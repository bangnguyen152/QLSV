package QLSV;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private String diaChi;
    private float gpa;

    public SinhVien() {

    }

    public SinhVien(String maSV, String hoTen, String lop, String ngaySinh, String diaChi) {
        super();
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
