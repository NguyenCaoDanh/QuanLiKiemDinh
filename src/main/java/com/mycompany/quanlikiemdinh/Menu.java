/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

import static Design.Design.sc;
import static Design.Design.f;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Menu {

    public static void main(String[] args) throws ParseException {
///Gọi các danh sách: 
        List<NhanVien> dsNhanVien = new ArrayList<>();
        List<TieuChi> dsTieuChi = new ArrayList<>();
        List<TieuChuan> dsTieuChuan = new ArrayList<>();
        List<MinhChung> dsMinhChung = new ArrayList<>();
        List<KiemDinh> dsKiemDinh = new ArrayList<>();
        List<Integer> maMinhChung = new ArrayList<>();
        List<CapQuyen> qlQuyen = new ArrayList<>();
        List<DSLNV> dslnv = new ArrayList<>();
///biến kiểm tra cấp quyền        
        int SessionID = -1;
///gọi các lớp để thực hiện chức năng        
        NhanVien qlnv = new NhanVien();
        QuanLyMinhChung qlmc = new QuanLyMinhChung();
        KiemDinh kd = new KiemDinh();
        BoGD bgd = new BoGD();
        CapQuyen q = new CapQuyen();
///Tạo cứng các loại nhân viên
        DSLNV dslnv1 = new DSLNV(1, "Truong Phong");
        DSLNV dslnv2 = new DSLNV(2, "Nhan vien");
        DSLNV dslnv3 = new DSLNV(3, "Giang vien");
        dslnv.add(dslnv3);
        dslnv.add(dslnv2);
        dslnv.add(dslnv1);
        dslnv.forEach(h -> h.hienThi());
///Tạo cứng nhân viên
        NhanVien nv1 = new NhanVien(0, "Nguyen Cao Danh", 1);
        NhanVien nv2 = new NhanVien(1, "Nguyen Van A", 2);
        NhanVien nv3 = new NhanVien(2, "Nguyen Van B", 3);
        NhanVien nv4 = new NhanVien(3, "Nguyen Van C", 3);
        dsNhanVien.add(nv1);
        dsNhanVien.add(nv2);
        dsNhanVien.add(nv3);
        dsNhanVien.add(nv4);
        dsNhanVien.forEach(h -> h.taoThanhVien());
//Tạo cứng cấp quyền cho Trưởng Phòng
        CapQuyen tp = new CapQuyen(0, true, true, true, true, true,
                true, true, true, true, true,
                true, true, true, true,
                true, true, true);
        qlQuyen.add(tp);
///Menu cấp quyền
        int chon = 0;
        do {
            System.out.print("==Menu Cap Quyen Chuc Nang cho nhan vien==\n");
            System.out.print("1.Nhap Ma Thanh Vien de cap quyen\n");
            System.out.print("2.Hien thi quyen cua tung ma thanh vien\n");
            System.out.print("Nhap lua chon cua ban(1-2):\n");
            System.out.print("Thoat:(0)\n");
            System.out.println("======================================");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    q.nhapCapQuyen(qlQuyen);
                    break;
                case 2:
                    q.hienThiCapQuyenTheoList(qlQuyen);
                    break;
            }
        } while (chon != 0);
//Mã thành viên đăng nhập hệ thống: 
        System.out.print("Nhap ma thanh vien: ");
        SessionID = sc.nextInt();
        sc.nextLine();

///Menu hệ thống        
        int choice = 0;
        int choose;
        do {
            int index = 0;
            System.out.println("==Menu chuc nang== \n");
            System.out.println("1.Nhap bo kiem dinh ");
            System.out.println("2.Nhap tieu chuan ");
            System.out.println("3.Nhap tieu chi ");
            System.out.println("4.Nhap minh chung ");
            System.out.println("======================================");
            System.out.println("5.Hien thi danh sach kiem dinh ");
            System.out.println("6.Hien thi danh sach tieu chuan ");
            System.out.println("7.Hien thi danh sach tieu chi");
            System.out.println("8.Hien thi danh sach minh chung ");
            System.out.println("======================================");
            System.out.println("9.Bien soan noi dung tieu chi ");
            System.out.println("10.Them minh chung cho tieu chi ");
            System.out.println("11.Xoa minh chung cho tieu chi");
            System.out.println("12.Cap nhat minh chung cho tieu chi ");
            System.out.println("======================================");
            System.out.println("13.Xem danh sach minh chung theo tieu chi ");
            System.out.println("14.Tim kiem minh chung theo ten");
            System.out.println("15.Tim kiem minh chung theo noi ban hanh");
            System.out.println("16.Tim kiem minh chung theo ngay ban hanh");
            System.out.println("======================================");
            System.out.println("17.Tim kiem minh chung lien quan theo ten hoac phong ban cung cap minh chung");
            System.out.println("18.Sap xep minh chung theo ngay tao minh chung");
            System.out.println("19.Sap xep minh chung theo ten hoac ngay minh chung duoc tao");
            System.out.println("0.Thoat");
            System.out.print("Nhap lua chon cua ban(1-19): \n");
            System.out.println("======================================");
            choice = Integer.parseInt(sc.nextLine());
//            choose = sc.nextInt();
//            sc.nextLine();
            switch (choice) {
                case 1:
                    if (bgd.kiemTraThemTieuChuan(SessionID, qlQuyen)) {
                        bgd.themBoKiemDinh(dsKiemDinh, dsTieuChuan);
                    } else {
                        System.out.print("Error\n");
                    }
                    System.out.print("==========\n");
                    break;
                case 2:
                    if (qlnv.kiemTraThemTieuChuan(SessionID, qlQuyen)) {
                        qlnv.themTieuChuan(dsTieuChuan, dsTieuChi);

                    } else {
                        System.out.print("Error\n");
                    }
                    System.out.print("==========\n");
                    break;
                case 3:
                    if (qlnv.kiemTraThemTieuChi(SessionID, qlQuyen)) {
                        qlnv.themTieuChi(dsTieuChi, dsMinhChung);
                    } else {
                        System.out.print("Error\n");
                    }
                    System.out.print("==========\n");
                    break;
                case 4:
                    if (qlnv.kiemTraThemMinhChung(SessionID, qlQuyen)) {
                        qlnv.themMinhChung(dsMinhChung);
                    } else {
                        System.out.print("Error\n");
                    }
                    System.out.print("==========\n");
                    break;
                case 5:
                    bgd.hienThiKiemDinh(dsKiemDinh);
                    System.out.print("==========\n");
                    break;
                case 6:
                    qlnv.hienThiTieuChuan(dsTieuChuan);
                    System.out.print("==========\n");
                    break;
                case 7:
                    qlnv.hienThiTieuChi(dsTieuChi);
                    System.out.print("==========\n");
                    break;
                case 8:
                    qlnv.hienThiMinhChung(dsMinhChung);
                    System.out.print("==========\n");
                    break;
                case 9:
                    if (qlnv.kiemTraVietBaoCao(SessionID, qlQuyen)) {
                        qlnv.vietBaoCao();
                    } else {
                        System.out.print("Error\n");
                    }
                    break;
                case 10:
                    if (qlnv.kiemTraThemMinhChungVaoTieuChi(SessionID, qlQuyen)) {
                        qlnv.themMaMinhChungChoTieuChi(dsTieuChi, index, dsMinhChung);
                        System.out.print("==========\n");
                    } else {
                        System.out.print("Error\n");
                    }
                    break;
                case 11:
                    qlnv.xoaMinhChungKhoiTieuChi(dsTieuChi, dsMinhChung);
                    System.out.print("==========\n");
                    break;
                case 12:
                    break;
                case 13:
                    if (qlnv.kiemTraXemMinhChungTrongTieuChi(SessionID, qlQuyen)) {
                        qlnv.hienThiTieuChi(dsTieuChi);
                        System.out.print("==========\n");
                    } else {
                        System.out.print("Error\n");
                    }
                    break;
                case 14:
                    if (dsMinhChung.isEmpty()) {
                        System.out.println("Danh sach minh chung rong!");
                        break;
                    } else {
                        if (qlmc.kiemTraTimKiemTheoTenMinhChung(SessionID, qlQuyen)) {
                            System.out.print("Nhap ten minh chung muon tim: ");
                            String tenMinhChung = sc.nextLine();
                            qlmc.timKiemTheoTenMinhChung(dsMinhChung, tenMinhChung);
                        } else {
                            System.out.print("Error\n");
                        }
                        break;
                    }
                case 15:
                    if (dsMinhChung.isEmpty()) {
                        System.out.println("Danh sach minh chung rong!");
                        break;
                    } else {
                        if (qlmc.kiemTraTimKiemTheoNoiBanHanh(SessionID, qlQuyen)) {
                            System.out.print("Nhap noi ban hanh muon tim: ");
                            String noiBanHanh = sc.nextLine();
                            qlmc.timKiemTheoNoiBanHanh(dsMinhChung, noiBanHanh);
                        } else {
                            System.out.print("Error\n");
                        }
                        break;
                    }
                case 16:
                    if (dsMinhChung.isEmpty()) {
                        System.out.println("Danh sach minh chung rong!");
                        break;
                    } else {
                        if (qlmc.kiemTraTimKiemTheoNgayBanHanh(SessionID, qlQuyen)) {
                            System.out.print("Nhap ngay ban hanh muon tim: ");
                            Date ngayBanHanh = f.parse(sc.nextLine());
                            qlmc.timKiemTheoNgayBanhanh(dsMinhChung, ngayBanHanh);
                        } else {
                            System.out.print("Error\n");
                        }
                        break;
                    }
                case 17:
                    if (dsMinhChung.isEmpty()) {
                        System.out.println("Danh sach minh chung rong!");
                        break;
                    } else {
                        if (qlmc.kiemTraTimKiemTheoTenHoacPhongBan(SessionID, qlQuyen)) {
                            System.out.print("Nhap Ten minh chung || Nhap ma phong ban: ");
                            String tmpMH = sc.nextLine();
                            qlmc.timKiemTheoTenHoacPhongBan(dsMinhChung, tmpMH);
                        } else {
                            System.out.print("Error\n");
                        }
                        break;
                    }
                case 18:
                    if (dsMinhChung.isEmpty()) {
                        System.out.println("Danh sach minh chung rong!");
                        break;
                    }
                    if (qlmc.kiemTraSapXepTheoNgayTaoMinhChung(SessionID, qlQuyen)) {
                        qlmc.sapXepTheoNgayTaoMinhChung(dsMinhChung);
                    } else {
                        System.out.print("Error\n");
                    }
                    break;
                case 19:
                    if (dsMinhChung.isEmpty()) {
                        System.out.println("Danh sach minh chung rong!");
                        break;
                    }
                    if (qlmc.kiemTraSapXepTheoNgayTaoMinhChung(SessionID, qlQuyen)) {
                        qlmc.sapXepTheoTenHoacNgayTaoMinhChung(dsMinhChung);
                    } else {
                        System.out.print("Error\n");
                    }
                    break;

            }
        } while (choice != 0);
    }

}
