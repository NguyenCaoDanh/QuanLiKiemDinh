/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

import static Design.Design.sc;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyMinhChung {

    private List<MinhChung> dsMinhChung;
    private TieuChi tc = new TieuChi();

    public void timKiemTheoTenMinhChung(List<MinhChung> dsMinhChung, String a) {
        boolean timKiem = false;
        for (MinhChung mc : dsMinhChung) {
            if (a.equals(mc.getTenMinhChung())) {
                mc.hienThi();
                timKiem = true;

            }
        }
        if (timKiem == false) {
            System.out.println("Khong tim thay ten minh chung");
        }
    }

    public void timKiemTheoNoiBanHanh(List<MinhChung> dsMinhChung, String a) {
        boolean timKiem = false;
        for (MinhChung mc : dsMinhChung) {
            if (a.equals(mc.getNoiBanHanh())) {
                mc.hienThi();
                timKiem = true;

            }
        }
        if (timKiem == false) {
            System.out.println("Khong tim thay noi ban hanh");
        }
    }

    public void timKiemTheoNgayBanhanh(List<MinhChung> dsMinhChung, Date d) {
        boolean timKiem = false;
        for (MinhChung mc : dsMinhChung) {
            if (d.equals(mc.getNgayBanHanh())) {
                mc.hienThi();
                timKiem = true;
            }
        }
        if (timKiem == false) {
            System.out.println("Khong tim thay ngay ban hanh");
        }
    }

    public void sapXepTheoNgayTaoMinhChung(List<MinhChung> dsMinhChung) {
        dsMinhChung.sort(Comparator.comparing(MinhChung::getNgayTaoMinhChung));
        dsMinhChung.forEach(mc -> mc.hienThi());
    }

    public void timKiemTheoTenHoacPhongBan(List<MinhChung> dsMinhChung, String a) {
        boolean timKiem = false;
        for (MinhChung mc : dsMinhChung) {
            if (mc.getTenMinhChung().toLowerCase().contains(a.toLowerCase()) || mc.getPhongBanChiuTrachNhiem().toLowerCase().contains(a.toLowerCase())) {
                mc.hienThi();
                timKiem = true;
            }
        }
        if (timKiem == false) {
            System.out.println("Khong tim thay !!!");
        }

    }

    public void sapXepTheoTenHoacNgayTaoMinhChung(List<MinhChung> dsMinhChung) {
        int choose;
        do {
            System.out.println("1.Ten Minh Chung");
            System.out.println("2.Ngay Tao Minh Chung");
            System.out.println("0.Thoat");
            System.out.print("Ban chon: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    dsMinhChung.sort(Comparator.comparing(MinhChung::getTenMinhChung));
                    dsMinhChung.forEach(mc -> mc.hienThi());
                    break;
                case 2:
                    dsMinhChung.sort(Comparator.comparing(MinhChung::getNgayTaoMinhChung));
                    dsMinhChung.forEach(mc -> mc.hienThi());
                    break;

            }
        } while (choose != 0);
    }

    public void hienThi1(List<MinhChung> dsMinhChung) {
        for (MinhChung mc1 : dsMinhChung) {
            mc1.hienThi();
        }
    }

    public boolean kiemTraTimKiemTheoTenMinhChung(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isTimKiemTheoTen() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraTimKiemTheoNoiBanHanh(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isTimKiemTheoNoiBanHanh() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraTimKiemTheoNgayBanHanh(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isTimKiemTheoNgayBanHanh() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraTimKiemTheoTenHoacPhongBan(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isTimKiemTheoTenHoacPhongBan() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraSapXepTheoNgayTaoMinhChung(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isSapXepTheoNgayTaoMinhChung() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraSapXepTheoTenHoacNgayTaoMinhChung(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isSapXepTheoTenHoacNgayTaoMinhChung() == true) {
                return true;
            }
        }
        return false;
    }

    public List<MinhChung> getDsMinhChung() {
        return dsMinhChung;
    }

    public void setDsMinhChung(List<MinhChung> dsMinhChung) {
        this.dsMinhChung = dsMinhChung;
    }
}
