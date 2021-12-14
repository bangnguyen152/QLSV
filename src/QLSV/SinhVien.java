package QLSV;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien extends Person{
    private String maSV;
    private String lop;
    public SinhVien() {

    }

    public SinhVien(String maSV, String hoTen, String lop, String ngaySinh, String diaChi,String soDt,String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, soDt, gioiTinh);
        this.maSV = maSV;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

}
