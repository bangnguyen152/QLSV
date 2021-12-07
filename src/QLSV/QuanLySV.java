package QLSV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySV {
    public static Scanner scanner = new Scanner(System.in);
    private ArrayList<SinhVien> arrSinhVien = new ArrayList<>();

    public QuanLySV() {

    }

    public void add() {
        String maSV = nhapMaSV();
        String hoTen = nhapHoTen();
        String lop = nhapLop();
        String ngaySinh = nhapNgaySinh();
        String diaChi = nhapDiaChi();
        SinhVien sinhVien = new SinhVien(maSV, hoTen, lop, ngaySinh, diaChi);
        try{
            arrSinhVien.add(sinhVien);
        }
        catch (NullPointerException e)
        {
            System.out.println("Đang có 1 lỗi gì đấy");
        }

    }

    public void edit(String maSV) {
        boolean tonTai = false;
        for (int i = 0; i < arrSinhVien.size(); i++) {
            if (arrSinhVien.get(i).getMaSV() == maSV) {
                tonTai = true;
                arrSinhVien.get(i).setHoTen(nhapHoTen());
                arrSinhVien.get(i).setLop(nhapLop());
                arrSinhVien.get(i).setNgaySinh(nhapNgaySinh());
                arrSinhVien.get(i).setDiaChi(nhapDiaChi());
                break;
            }
            if (!tonTai) {
                System.out.println(maSV + " không tồn tại!");
            }

        }
    }

    public void delete(String maSV) {
        SinhVien sinhVien = null;
        for (int i = 0; i < arrSinhVien.size(); i++) {
            if (arrSinhVien.get(i).getMaSV() == maSV) {
                sinhVien = arrSinhVien.get(i);
                break;
            }
        }
        if (sinhVien != null) {
            arrSinhVien.remove(sinhVien);
        } else System.out.println(maSV + " không tồn tại!");
    }

    public void show() {
        for (SinhVien sinhVien : arrSinhVien) {
            System.out.format("%5s | ", sinhVien.getMaSV());
            System.out.format("%20s | ", sinhVien.getHoTen());
            System.out.format("%5s | ", sinhVien.getNgaySinh());
            System.out.format("%20s | ", sinhVien.getDiaChi());
        }

    }

    public String nhapMaSV() {
        System.out.print("Nhập mã sinh viên: ");
        return scanner.nextLine();
    }

    public String nhapHoTen() {
        System.out.print("Nhập họ tên: ");
        return scanner.nextLine();
    }

    public String nhapLop() {
        System.out.print("Nhập lớp: ");
        return scanner.nextLine();
    }

    public String nhapDiaChi() {
        System.out.print("Nhập địa chỉ: ");
        return scanner.nextLine();
    }

    public String nhapNgaySinh() {
        while (true) {
                System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
                return scanner.nextLine();
        }

    }

    public void setArrSinhVien(ArrayList<SinhVien> arrSinhVien) {
        this.arrSinhVien = arrSinhVien;
    }

    public ArrayList<SinhVien> getArrSinhVien() {
        return arrSinhVien;
    }
    /*public float nhapGPA() {
        System.out.println("Nhập GPA: ");
        while (true) {
            try {
                float gpa = Float.parseFloat(scanner.nextLine());
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException e) {
                System.out.println("Nhập điểm không hợp lệ! Nhập lại!");
            }
        }

    }*/

}
