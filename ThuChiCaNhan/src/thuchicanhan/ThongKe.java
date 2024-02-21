package thuchicanhan;

import javax.swing.table.DefaultTableModel;

// Tính toán thu và chi 

public class ThongKe {
    private DefaultTableModel tableModel;
    private int tongThu;
    private int tongChi;

    public ThongKe(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
        tinhToanVaThongKe();
    }

//    public ThongKe(InGiaoDich inGiaoDich) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    public ThongKe(InGiaoDich inGiaoDich) {
        this.tableModel = inGiaoDich.getModel();
        tinhToanVaThongKe();
}


    public void tinhToanVaThongKe() {
        if (tableModel == null) {
            System.out.println("Biến tableModel chưa được khởi tạo.");
            return;
        } else {
            System.out.println("CODE TINH TOAN VA THONG KE NHU SAU");
        }
        
        System.out.println(tableModel);
        
        tongThu = 0;
        tongChi = 0;
        
        int rowCount = tableModel.getRowCount();

        for (int row = 0; row < rowCount; row++) {
            Object soTienObj = tableModel.getValueAt(row, 4); // Chỉnh sửa chỉ số cột thành 4
//            if (soTienObj instanceof Integer) {
//                int soTien = (int) soTienObj;
//                if (soTien >= 0) {
//                    tongThu += soTien;
//                } else {
//                    tongChi += Math.abs(soTien);
//                }
//            }
            if (soTienObj instanceof String) {
                try {
                    int soTien = Integer.parseInt((String) soTienObj);
                    if (soTien >= 0) {
                        tongThu += soTien;
                    } else {
                        tongChi += Math.abs(soTien);
                    }
                } catch (NumberFormatException e) {
                    // Xử lý ngoại lệ nếu giá trị không phải là số
                    System.out.println("Giá trị không hợp lệ tại dòng " + (row + 1) + ": " + soTienObj);
                }
            }

        }
        
        System.out.println("Tổng thu: " + tongThu);
        System.out.println("Tổng chi: " + tongChi);
    }

    public int getTongThu() {
        return this.tongThu;
    }

    public int getTongChi() {
        return this.tongChi;
    }

    public static void main(String[] args) {
        // Tạo một đối tượng DefaultTableModel để sử dụng làm dữ liệu mẫu
        Object[][] data = {
            {"Value 1", "Value 2", "Value 3", "Value 4", 100},
            {"Value 5", "Value 6", "Value 7", "Value 8", -50}
        };
        String[] columnNames = {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5"};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Tạo đối tượng ThongKe và tính toán tổng thu và tổng chi
        ThongKe thongKe = new ThongKe(tableModel);
        thongKe.tinhToanVaThongKe();

        // In kết quả
        int tongThu = thongKe.getTongThu();
        int tongChi = thongKe.getTongChi();
        System.out.println("Tổng thu: " + tongThu);
        System.out.println("Tổng chi: " + tongChi);
    }
}