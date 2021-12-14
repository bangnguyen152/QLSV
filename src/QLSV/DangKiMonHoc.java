package QLSV;

import java.util.Scanner;

public class DangKiMonHoc {
    String maSV;
    String maMH;
    String maGV;
    Scanner input = new Scanner(System.in);
    public DangKiMonHoc(){}
    public DangKiMonHoc(String maSV,String maMH,String maGV){
        this.maSV=maSV;
        this.maGV=maGV;
        this.maMH=maMH;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    void DKi(){
        System.out.print("Nhập mã SV: ");
        this.maSV= input.nextLine();
        System.out.print("Nhập mã MH: ");
        this.maMH= input.nextLine();
        System.out.print("Nhập mã GV: ");
        this.maGV = input.nextLine();
    }
}
