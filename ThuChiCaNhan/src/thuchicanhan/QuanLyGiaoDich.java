
package thuchicanhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;
    private String tenTep = "jframe/data.txt"; // Cập nhật đường dẫn tệp

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
        loadDuLieuTuFile();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
        luuDuLieuVaoFile();
    }

    public void xoaGiaoDich(int index) {
        danhSachGiaoDich.remove(index);
        luuDuLieuVaoFile();
    }

    public void suaGiaoDich(int index, GiaoDich giaoDichMoi) {
        danhSachGiaoDich.set(index, giaoDichMoi);
        luuDuLieuVaoFile();
    }

    public List<GiaoDich> layDanhSachGiaoDich() {
        return danhSachGiaoDich;
    }

    private void loadDuLieuTuFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(tenTep))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int STT = Integer.parseInt(parts[0].trim());
                String Ngay = parts[1].trim();
                String Ten = parts[2].trim();
                String Loai = parts[3].trim();
                double SoTien = Double.parseDouble(parts[4].trim());
                GiaoDich giaoDich = new GiaoDich(STT, Ngay, Ten, Loai, SoTien);
                danhSachGiaoDich.add(giaoDich);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void luuDuLieuVaoFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(tenTep))) {
            for (GiaoDich giaoDich : danhSachGiaoDich) {
                writer.println(giaoDich.getSTT() + ", " + giaoDich.getNgay() + ", " + giaoDich.getTen() + ", " + giaoDich.getLoai() + ", " + giaoDich.getSoTien());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
