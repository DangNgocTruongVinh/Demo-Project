package thuchicanhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Highlighter;
//import java.lang.UnsupportedOperationException;


public class InGiaoDich {
    private DefaultTableModel tableModel;
    private int sequenceNumber;
//    private DefaultTableModel model; 
    private String fileName;

    public InGiaoDich(DefaultTableModel tableModel, String fileName, int sequenceNumber) {
        this.tableModel = tableModel;
        this.sequenceNumber = 0;
        this.fileName = fileName;
        importDataFromTextFile(fileName);
    }
    
    public InGiaoDich(DefaultTableModel tableModel, String fileName) {
        this.tableModel = tableModel;
        this.fileName = fileName;
        importDataFromTextFile(fileName);
    }

    public InGiaoDich(DefaultTableModel defaultTableModel) {
        this.tableModel = defaultTableModel;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addTransaction(int sequenceNumber, String ngay, String ten, String loai, String soTien) {
        if ("".equals(ngay) || "".equals(ten) || "".equals(loai) || "".equals(soTien)) {
            showMessage("Vui lòng nhập đầy đủ thông tin.");
        } else {
            int soTienInt = Integer.parseInt(soTien);
            if (loai.equals("Chi")) {
                soTienInt = -soTienInt; // Thêm dấu trừ đằng trước nếu loại là "Chi"
            }
            String[] rowData = {String.valueOf(sequenceNumber), ngay, ten, loai, String.valueOf(soTienInt)};
            tableModel.addRow(rowData);

            updateTransactionTable();
            exportDataToTextFile(fileName); // Lưu dữ liệu vào file txt sau khi thêm giao dịch mới
        }
    }

    private void updateTransactionTable() {
        int rowCount = tableModel.getRowCount();
        if (rowCount > 0) { // Chỉ cập nhật nếu có ít nhất một hàng
            for (int i = 0; i < rowCount; i++) {
                tableModel.setValueAt(i + 1, i, 0);
            }
        }
    }

    public TableModel getTableModel() {
        return tableModel;
    }

    public void timKiemDuLieu(String ngay) {
        List<String[]> filteredRows = new ArrayList<>();

        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String dateValue = tableModel.getValueAt(i, 1).toString();
            if (dateValue.matches(ngay)) {
                String[] row = new String[tableModel.getColumnCount()];
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    row[j] = tableModel.getValueAt(i, j).toString();
                }
                filteredRows.add(row);
            }
        }

        refreshTable(filteredRows);
    }

    private void refreshTable(List<String[]> rows) {
        tableModel.setRowCount(0);
        for (String[] row : rows) {
            tableModel.addRow(row);
        }
    }

    private void showMessage(String message) {
        System.out.println(message);
        // Hoặc sử dụng cơ chế thông báo thích hợp khác trong ứng dụng của bạn
    }

    DefaultTableModel getModel() {
        return this.tableModel;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public void exportDataToBinary(String fileName) {
//        try {
//            FileOutputStream fileOut = new FileOutputStream(fileName);
//            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//            objectOut.writeObject(this); // Ghi đối tượng hiện tại vào file
//            objectOut.close();
//            fileOut.close();
//            System.out.println("Dữ liệu đã được xuất thành công vào file: " + fileName);
//        } catch (Exception e) {
//            System.out.println("Xuất dữ liệu vào file thất bại: " + e.getMessage());
//            e.printStackTrace();
//        }
        try {
            // Tạo một đối tượng ObjectOutputStream để ghi dữ liệu vào file
            try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(fileName))) {
                // Lấy dữ liệu từ DefaultTableModel và ghi vào file
                objectOut.writeObject(tableModel.getDataVector());
                System.out.println("Dữ liệu đã được xuất thành công vào file: " + fileName);
            }
        
        } catch (IOException e) {
            System.out.println("Xuất dữ liệu vào file thất bại: " + e.getMessage());
            e.printStackTrace();
        }
    }
     
    public void importDataFromTextFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Đọc dòng đầu tiên chứa tên các cột
            String columnLine = reader.readLine();
            String[] columns = columnLine.split(", ");

            // Xóa dữ liệu cũ trong tableModel
            tableModel.setRowCount(0);

            // Đọc từng dòng và thêm vào tableModel
            String line;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(", ");
                tableModel.addRow(rowData);
            }

            System.out.println("Dữ liệu đã được nhập từ file văn bản: " + fileName);
        } catch (IOException e) {
            System.out.println("Nhập dữ liệu từ file văn bản thất bại: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void importDataFromBinary(String fileName) {
        try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(fileName))) {
            Vector<Vector<Object>> dataVector = (Vector<Vector<Object>>) objectIn.readObject();
            tableModel.setDataVector(dataVector, new Vector<>());
            System.out.println("Dữ liệu đã được nhập từ file nhị phân: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nhập dữ liệu từ file nhị phân thất bại: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void exportDataToTextFile(String fileName) {
        if (fileName == null || fileName.trim().isEmpty()) {
            System.out.println("Tên tệp không hợp lệ.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Ghi tên các cột vào tệp văn bản
            int columnCount = tableModel.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                writer.write(tableModel.getColumnName(i));
                if (i < columnCount - 1) {
                    writer.write(", ");
                }
            }
            writer.newLine();

            // Ghi dữ liệu từ mỗi hàng vào tệp văn bản
            int rowCount = tableModel.getRowCount();
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                    Object value = tableModel.getValueAt(row, col);
                    writer.write(String.valueOf(value));
                    if (col < columnCount - 1) {
                        writer.write(", ");
                    }
                }
                writer.newLine();
            }

            System.out.println("Dữ liệu đã được xuất thành công vào file: " + fileName);
        } catch (IOException e) {
            System.out.println("Xuất dữ liệu vào file thất bại: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
}