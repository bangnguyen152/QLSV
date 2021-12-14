package QLSV;
import java.util.Scanner;

public class Subject extends MonHoc{
    public Scanner sc1 = new Scanner(System.in);
    public Scanner sc2 = new Scanner(System.in);
    String maMH;
    String tenMh;
    float Diem;
    String tinhTrang;
    int soTC;
    public Subject(){}
    public Subject(String maMH,String tenMh,int soTC,float Diem,String tinhTrang){
        super(maMH, tenMh, soTC);
        this.Diem=Diem;
        this.tinhTrang=tinhTrang;
    }
    public void setDiem(float diem) {
        Diem = diem;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public float getDiem() {
        return Diem;
    }
    public String getTinhTrang() {
        return tinhTrang;
    }
    void nhapTT(){
        System.out.print("Nhập mã MH: ");
        this.maMH = sc2.nextLine();
        System.out.print("Nhập tên MH: ");
        this.tenMh= sc2.nextLine();
        System.out.print("Nhập số TC: ");
        this.soTC= sc1.nextInt();
        System.out.print("Nhập Điểm: ");
        this.Diem = sc1.nextFloat();
        if (this.Diem<=4){
            this.tinhTrang="Thi Lại";
        }
        else {
            this.tinhTrang="Qua Môn";
        }
    }
}
