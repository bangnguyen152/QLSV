package QLSV;

import java.util.Scanner;

public class MonHoc {
    public Scanner sc1 = new Scanner(System.in);
    String maMH;
    int soTC;
    String tenMh;
    public MonHoc(){}
    public MonHoc(String maMH,String tenMh,int soTC){
        this.maMH=maMH;
        this.tenMh=tenMh;
        this.soTC=soTC;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getTenMh() {
        return tenMh;
    }

    public void setTenMH(String tenMh) {
        this.tenMh = tenMh;
    }
    void nhapTTMon(){
        System.out.print("Nhập mã mh: ");
        this.maMH = sc1.nextLine();
        System.out.print("Nhập tên mh: ");
        this.tenMh = sc1.nextLine();
        System.out.print("Nhập số TC: ");
        this.soTC=sc1.nextInt();
    }
}
