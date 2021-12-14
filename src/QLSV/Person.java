package QLSV;

import java.util.Scanner;

public class Person {
    public Scanner sc1 = new Scanner(System.in);
    public Scanner sc2 = new Scanner(System.in);
    String hoTen;
    String ngaySinh;
    String diaChi;
    String soDt;
    String gioiTinh;
    public Person(){}
    public Person(String hoTen,String ngaySinh,String diaChi,String soDt,String gioiTinh){
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.ngaySinh=ngaySinh;
        this.gioiTinh=gioiTinh;
        this.soDt=soDt;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public String getSoDt() {
        return soDt;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }
    void nhapTT(){
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc1.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh=sc1.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.diaChi=sc1.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc1.nextLine();
        System.out.print("Nhập SĐT: ");
        this.soDt=sc1.nextLine();
    }
}
