
package thuchicanhan;

// đối tượng quản lý 1 giao dịch 

public class GiaoDich {
    private int STT;
    private String Ngay;
    private String Ten;
    private String Loai;
    private double SoTien;

    public GiaoDich(int STT ,String Ngay, String Ten, String Loai, double SoTien) {
        this.Ngay = Ngay;
        this.Ten = Ten;
        this.Loai = Loai;
        this.SoTien = SoTien;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }
    

    
    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double SoTien) {
        this.SoTien = SoTien;
    }
    
    

   
}