package QLSV;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static ArrayList<Mark> Diem1 = new ArrayList<>();
    public static ArrayList<DangKiMonHoc> DK1 = new ArrayList<>();
    public static ArrayList<Teacher> GV1 = new ArrayList<>();
    public static ArrayList<QuanLySV> SV1 = new ArrayList<>();
    public static ArrayList<MonHoc> taoMon = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sc1 = new Scanner(System.in);
    public static QuanLySV quanLySV = new QuanLySV();
    public static Teacher gv1 = new Teacher();
    public static Mark diem1 = new Mark();
    public static MonHoc m1 = new MonHoc();
    public static void main(String[] args) {
        boolean con = true;
        while (con) {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    AddNewStudentorTeacher();
                    break;
                case 2:
                    EditProfile();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    quanLySV.show();
                    break;
                case 5:
                    ShowProfileTeacher();
                    break;
                case 6:
                    InsertMark();
                    break;
                case 7:
                    CheckbyIDStudent();
                    break;
                case 8:
                    CheckbyIDSubject();
                    break;
                case 9:
                    ListPassorFail();
                    break;
                case 10:
                    CheckHocBong();
                    break;
                case 11:
                    InsertSubject();
                    break;
                case 12:
                    DangKiMonHoc();
                    break;
                case 13:
                    inTTDangKi();
                    break;
                case 14:
                    break;
                default:
                    con = false;
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n-----------MENU------------");
        System.out.println("1. Thêm sinh viên/giáo viên.");
        System.out.println("2. Sửa thông tin theo mã SV.");
        System.out.println("3. Xoá thông tin theo mã SV.");
        System.out.println("4. Xem danh sách sinh viên.");
        System.out.println("5. Xem danh sách giáo viên.");
        System.out.println("6. Thêm điểm theo mã SV");
        System.out.println("7. Xem điểm theo Mã SV");
        System.out.println("8. Xem điểm theo mã MH");
        System.out.println("9. Lọc trượt/qua");
        System.out.println("10. Học bổng (GPA>7.5) ");
        System.out.println("11. Tạo Môn Học");
        System.out.println("12. Đăng Kí Học ");
        System.out.println("13. Danh Sách Các Môn Đã ĐK theo mã SV) ");
        System.out.println("Press 0 to exit!!");
        System.out.println("---------------------------");
    }
    public static void AddNewStudentorTeacher(){
        System.out.println("1.Thêm SV");
        System.out.println("2.Thêm GV");
        System.out.print("Nhập lựa chọn: ");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            quanLySV.add();
            SV1.add(quanLySV);
        } else {
            gv1.nhapTT();
            GV1.add(gv1);
        }
    }
    public static void EditProfile(){
        String maSV = quanLySV.nhapMaSV();
        quanLySV.edit(maSV);
    }
    public static void Delete(){
        String maSV = quanLySV.nhapMaSV();
        quanLySV.delete(maSV);
    }
    public static void ShowProfileTeacher(){
        String header = String.format("%-12s%-12s%-15s%-15s%-15s%-15s%-15s", "Mã GV", "Họ Tên", "Giới tính", "Ngày sinh", "Địa chỉ","SĐT","Khoa");
        System.out.println(header);
        for (Teacher gv1:GV1){
            String row = String.format("%-12s%-12s%-15S%-15s%-15s%-15s%-15s", gv1.getMaGV(), gv1.getHoTen(), gv1.getGioiTinh(), gv1.getNgaySinh(), gv1.getDiaChi(),gv1.getSoDt(),gv1.getKhoa());
            System.out.println(row);
        }
    }
    public static void InsertMark(){
        for (int i = 0; i < 1; i++) {
            diem1.nhapTT();
            Diem1.add(diem1);
        }
    }
    public static void InsertSubject(){
        m1.nhapTTMon();
        taoMon.add(m1);
    }
    public static void DangKiMonHoc() {
        boolean check = true;
        while (check) {
            System.out.print("Đăng kí học (Y/N): ");
            String option = sc1.nextLine();
            if (Objects.equals(option, "Y") || Objects.equals(option, "y")) {
                DangKiMonHoc dk1 = new DangKiMonHoc();
                dk1.DKi();
                DK1.add(dk1);
            } else {
                check = false;
            }
        }
    }

    public static void inTTDangKi() {
        System.out.print("Nhập mã SV: ");
        String masv1 = sc1.nextLine();
        String header3 = String.format("%-12s%-12s%-15s", "TênMH", "Số TC", "Tên Giảng Viên");
        System.out.println(header3);
        for (DangKiMonHoc dk1 : DK1) {
            if (masv1.equals(dk1.maSV)) {
                String row = String.format("%-12s%-12s%-15s", show(dk1.maMH), show1(dk1.maMH), show2(dk1.maGV));
                System.out.println(row);
            }
        }
    }
    public static String show(String MaMH) {
        for (MonHoc m1 : taoMon) {
            if (MaMH.equals(m1.getMaMH())) {
                return m1.tenMh;
            }
        }
        return null;
    }
    public static int show1(String MaMH) {
        for (MonHoc m1 : taoMon) {
            if (MaMH.equals(m1.getMaMH())) {
                return m1.soTC;
            }
        }
        return 0;
    }
    public static String show2(String MaGV) {
        for (Teacher gv1 : GV1) {
            if ((MaGV.equals(gv1.getMaGV()))) {
                return gv1.hoTen;
            }
        }
        return null;
    }
    public static void CheckbyIDStudent() {
        System.out.print("Nhập mã SV: ");
        String MaSv = sc1.nextLine();
        String header = String.format("%-12s%-12s%-15s%-15s%-10s", "Mã SV", "MaMH", "TênMH", "Điểm", "Tình Trạng");
        System.out.println(header);
        for (Mark diem1 : Diem1) {
            if (MaSv.equals(diem1.getMaSv())) {
                for (int i = 0; i < diem1.Mon.length; i++) {
                    String row = String.format("%-12s%-12s%-15S%-15.2f%-10s", diem1.getMaSv(), diem1.Mon[i].maMH, diem1.Mon[i].tenMh, diem1.Mon[i].getDiem(), diem1.Mon[i].getTinhTrang());
                    System.out.println(row);
                }
            }
        }
    }

    public static void CheckbyIDSubject() {
        System.out.print("Nhập mã MH: ");
        String MaMH = sc1.nextLine();
        String header2 = String.format("%-12s%-12s%-15s%-15s%-10s", "Mã SV", "MaMH", "TênMH", "Điểm", "Tình Trạng");
        System.out.println(header2);
        for (Mark diem1 : Diem1) {
            for (int i = 0; i < diem1.Mon.length; i++) {
                if (MaMH.equals(diem1.Mon[i].maMH)) {
                    String row = String.format("%-12s%-12s%-15S%-15f%-10s", diem1.getMaSv(), diem1.Mon[i].maMH, diem1.Mon[i].tenMh, diem1.Mon[i].getDiem(), diem1.Mon[i].getTinhTrang());
                    System.out.println(row);
                }
            }
        }
    }

    public static void ListPassorFail() {
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
    }
    public static void CheckHocBong(){
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
    }
}
