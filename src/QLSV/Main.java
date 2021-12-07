package QLSV;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Mark> Diem1 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        boolean con = true;
        QuanLySV quanLySV = new QuanLySV();
        String maSV;
        while (con) {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    quanLySV.add();
                    break;
                //HS1.add(quanLySV);
                case 2:
                    maSV = quanLySV.nhapMaSV();
                    quanLySV.edit(maSV);
                    break;
                case 3:
                    maSV = quanLySV.nhapMaSV();
                    quanLySV.delete(maSV);
                    break;
                case 4:
                    quanLySV.show();
                    break;
                case 5:
                    for (int i = 0; i < 1; i++) {
                        Mark diem1 = new Mark();
                        diem1.nhapTT();
                        Diem1.add(diem1);
                    }
                    break;
                case 6:
                    System.out.print("Nhập mã SV: ");
                    String MaSv = sc1.nextLine();
                    String header = String.format("%-12s%-12s%-15s%-15s%-10s", "Mã SV", "MaMH", "TênMH", "Điểm", "Tình Trạng");
                    System.out.println(header);
                    for (Mark diem1 : Diem1) {
                        if (MaSv.equals(diem1.getMaSv())) {
                            for (int i = 0; i < diem1.Mon.length; i++) {
                                String row = String.format("%-12s%-12s%-15S%-15.2f%-10s", diem1.getMaSv(), diem1.Mon[i].getMaMH(), diem1.Mon[i].getTenMh(), diem1.Mon[i].getDiem(), diem1.Mon[i].getTinhTrang());
                                System.out.println(row);
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.print("Nhập mã MH: ");
                    String MaMH = sc1.nextLine();
                    String header2 = String.format("%-12s%-12s%-15s%-15s%-10s", "Mã SV", "MaMH", "TênMH", "Điểm", "Tình Trạng");
                    System.out.println(header2);
                    for (Mark diem1 : Diem1) {
                        for (int i = 0; i < diem1.Mon.length; i++) {
                            if (MaMH.equals(diem1.Mon[i].getMaMH())) {
                                String row = String.format("%-12s%-12s%-15S%-15f%-10s", diem1.getMaSv(), diem1.Mon[i].getMaMH(), diem1.Mon[i].getTenMh(), diem1.Mon[i].getDiem(), diem1.Mon[i].getTinhTrang());
                                System.out.println(row);
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.print("Nhập mã MH: ");
                    String Ma = sc1.nextLine();
                    System.out.println("1.Trượt");
                    System.out.println("2.Qua");
                    System.out.print("Nhập lựa chọn: ");
                    int chon = sc.nextInt();
                    String header3 = String.format("%-12s%-12s%-15s%-15s", "Mã SV", "MaMH", "TênMH", "Điểm");
                    System.out.println(header3);
                    if (chon == 1) {
                        for (Mark diem1 : Diem1) {
                            for (int i = 0; i < diem1.Mon.length; i++) {
                                if ("Thi Lại".equals(diem1.Mon[i].getTinhTrang()) && Ma.equals(diem1.Mon[i].getMaMH())) {
                                    String row = String.format("%-12s%-12s%-15S%-15f", diem1.getMaSv(), diem1.Mon[i].getMaMH(), diem1.Mon[i].getTenMh(), diem1.Mon[i].getDiem());
                                    System.out.println(row);
                                }
                            }
                        }
                    } else {
                        for (Mark diem1 : Diem1) {
                            for (int i = 0; i < diem1.Mon.length; i++) {
                                if ("Qua Môn".equals(diem1.Mon[i].getTinhTrang()) && Ma.equals(diem1.Mon[i].getMaMH())) {
                                    String row = String.format("%-12s%-12s%-15S%-15f", diem1.getMaSv(), diem1.Mon[i].getMaMH(), diem1.Mon[i].getTenMh(), diem1.Mon[i].getDiem());
                                    System.out.println(row);
                                }
                            }
                        }
                    }
                    break;
                case 9:
                    for (Mark diem1 : Diem1) {
                        if (diem1.GPA() > 7.5) {
                            for (SinhVien sinhVien : quanLySV.getArrSinhVien()) {
                                if (diem1.getMaSv().equals(sinhVien.getMaSV())) {
                                    quanLySV.show();
                                    System.out.println("GPA: " + diem1.GPA());
                                }
                            }
                        } else {
                            System.out.println("Null!!");
                        }
                    }
                    break;
                default:
                    con = false;
            }
        }
    }

    //menu
    public static void showMenu() {
        System.out.println("\n-----------MENU------------");
        System.out.println("1. Thêm sinh viên.");
        System.out.println("2. Sửa thông tin theo mã SV.");
        System.out.println("3. Xoá thông tin theo mã SV.");
        System.out.println("4. Xem danh sách.");
        System.out.println("5. Thêm điểm");
        System.out.println("6. Xem điểm theo Mã SV");
        System.out.println("7. Xem điểm theo mã MH");
        System.out.println("8. Lọc trượt/qua");
        System.out.println("9. Học bổng (GPA>7.5) ");
        System.out.println("Press any key to exit!!");
        System.out.println("---------------------------");
    }

}
