/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

import static Design.Design.f;
import static Design.Design.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVien extends ThanhVien {

    TieuChi tc = new TieuChi();
    List<TieuChuan> dsTieuChuan = new ArrayList<>();
    List<TieuChi> dsTieuChi = new ArrayList<>();
    List<MinhChung> dsMinhChung = new ArrayList<>();
    List<NhanVien> dsNhanVien = new ArrayList<>();

    private int iDLoaiNV;
    KiemDinh kd = new KiemDinh();
    int choose;

    public NhanVien() {
    }

    public NhanVien(int maTV, String ten, int iDLoaiNV) {
        super(ten, maTV);
        this.iDLoaiNV = iDLoaiNV;
    }

    public void hienThiNV(NhanVien... a) {
        this.dsNhanVien.forEach(h -> h.taoThanhVien());
    }

    public void taoThanhVien() {
        System.out.printf("Ma Nhan Vien: %s\n", this.getMaTV());
        System.out.printf("Ten Nhan Vien: %s\n", this.getTen());
        System.out.printf("Loai Nhan Vien: %s\n", this.iDLoaiNV);
        System.out.println("======================================");
    }

    public void themTieuChuan(List<TieuChuan> dsTieuChuan, List<TieuChi> dsTieuChi) {
        List<Integer> maTieuChi = new ArrayList<>();
        boolean check = false;
        boolean isMaTieuChuanTrung = false;
        System.out.printf("Ma Tieu Chuan: ");
        int maTieuChuan = Integer.parseInt(sc.nextLine());
        for (TieuChuan tc : dsTieuChuan) {
            if (tc.getMaTieuChuan() == maTieuChuan) {
                isMaTieuChuanTrung = true;
                System.out.println("Ma tieu chuan da ton tai trong danh sach!");
                break;
            }
        }
        if (isMaTieuChuanTrung) {
            return;
        }
        System.out.print("Ten Tieu Chuan: ");
        String tenTieuChuan = sc.nextLine();
        System.out.printf("Noi Dung: ");
        String noiDung = sc.nextLine();
        do {
            System.out.printf("Them ma tieu chi: ");
            choose = Integer.parseInt(sc.nextLine());
            for (TieuChi tc : dsTieuChi) {

                if (tc.getMaTieuChi() == choose) {
                    check = true;
                    maTieuChi.add(choose);
                    break;
                } else {
                    check = false;

                }
            }
            if (check == false && choose != -1) {
                System.out.printf("Ko ton tai tieu chi\n");
            }

        } while (choose != -1);
        TieuChuan tchuan = new TieuChuan(maTieuChuan, tenTieuChuan, noiDung, maTieuChi);
        dsTieuChuan.add(tchuan);
    }

    public void xoaTieuChuan(List<TieuChuan> dsTieuChuan, List<TieuChi> dsTieuChi, int i) {
        for (int j = 0; j < dsTieuChuan.size(); j++) {
            if (j == i) {
                dsTieuChuan.remove(j);
                dsTieuChi.remove(j);
            }
        }
    }

    public void hienThiTieuChuan(List<TieuChuan> dsTieuChuan) {
        for (TieuChuan tchuan : dsTieuChuan) {
            tchuan.inTieuChuan();
        }
    }

    public void vietBaoCao() {
        System.out.print("Nhap noi dung bao cao:");
        String s1 = sc.nextLine();
        System.out.printf("Noi dung bao cao: %s", s1);
    }

    public void themTieuChi(List<TieuChi> dsTieuChi, List<MinhChung> dsMinhChung) {
        List<Integer> maMinhChung = new ArrayList<>();
        boolean check = false;
        boolean isMaTieuChiTrung = false;
        System.out.printf("Ma Tieu Chi: ");
        int maTieuChi = Integer.parseInt(sc.nextLine());
        for (TieuChi tc : dsTieuChi) {
            if (tc.getMaTieuChi() == maTieuChi) {
                isMaTieuChiTrung = true;
                System.out.println("Ma tieu chi da ton tai trong danh sach!");
                break;
            }
        }
        if (isMaTieuChiTrung) {
            return;
        }
        System.out.print("Ten Tieu Chi: ");
        String tenTieuChi = sc.nextLine();
        System.out.print("Noi Dung: ");
        String noiDung = sc.nextLine();
        do {

            System.out.printf("Them ma minh chung: ");
            choose = Integer.parseInt(sc.nextLine());
            for (MinhChung mc : dsMinhChung) {
                if (mc.getMaMinhChung() == choose) {
                    check = true;
                    maMinhChung.add(choose);
                    break;
                } else {
                    check = false;

                }

            }
            if (check == false && choose != -1) {
                System.out.printf("Ko ton tai minh chung\n");
            }
        } while (choose != -1);
        TieuChi tc = new TieuChi(maTieuChi, tenTieuChi, noiDung, maMinhChung);
        dsTieuChi.add(tc);
    }

    public void themMaMinhChungChoTieuChi(List<TieuChi> dsTieuChi, int i, List<MinhChung> dsMinhChung) {
        boolean isMaTieuChiTonTai = false;
        System.out.printf("Nhap ma Tieu Chi: ");
        int maTieuChi = Integer.parseInt(sc.nextLine());
        for (i = 0; i < dsTieuChi.size(); i++) {
            TieuChi tc = dsTieuChi.get(i);
            if (tc.getMaTieuChi() == maTieuChi) {
                isMaTieuChiTonTai = true;
                System.out.print("Nhap ma minh chung muon them: ");
                int maMinhChung = Integer.parseInt(sc.nextLine());
                boolean timThayMaMinhChung = false;
                for (MinhChung mc : dsMinhChung) {
                    if (mc.getMaMinhChung() == maMinhChung) {
                        timThayMaMinhChung = true;
                        System.out.println("Ma minh chung da ton tai trong danh sach!");
                        break;
                    }
                }
                if (timThayMaMinhChung == false) {
                    System.out.println("Ma minh chung khong ton tai!");
                    return;
                }
                tc.setMaMinhChung(maMinhChung);
            }
        }
        if (isMaTieuChiTonTai == false) {
            System.out.println("Ma tieu chi khong ton tai trong danh sach!");
        }
    }

    public void capNhatMaMinhChungChoTieuChi(List<TieuChi> dsTieuChi, List<MinhChung> dsMinhChung) {
        System.out.print("Nhap ma Tieu Chi: ");
        int maTieuChi = Integer.parseInt(sc.nextLine());
        boolean timThayMaTieuChi = false;
        for (TieuChi tc : dsTieuChi) {
            if (tc.getMaTieuChi() == maTieuChi) {
                timThayMaTieuChi = true;
                System.out.print("Nhap ma minh chung muon cap nhat: ");
                int maMinhChung = Integer.parseInt(sc.nextLine());
                boolean timThayMaMinhChung = false;
                for (MinhChung mc : dsMinhChung) {
                    if (mc.getMaMinhChung() == maMinhChung) {
                        timThayMaMinhChung = true;
                        break;
                    }
                }
                if (timThayMaMinhChung == false) {
                    System.out.println("Ma minh chung khong ton tai!");
                    return;
                }
                tc.setMaMinhChung(maMinhChung);
                System.out.println("Cap nhat ma minh chung thanh cong!");
            }
        }
        if (timThayMaTieuChi == false) {
            System.out.println("Ma tieu chi khong ton tai trong danh sach!");
        }
    }

    public void xoaMinhChungKhoiTieuChi(List<TieuChi> dsTieuChi, List<MinhChung> dsMinhChung) {
        System.out.print("Nhap ma Tieu Chi: ");
        int maTieuChi = Integer.parseInt(sc.nextLine());
        boolean timThayMaTieuChi = false;
        for (TieuChi tc : dsTieuChi) {
            if (tc.getMaTieuChi() == maTieuChi) {
                timThayMaTieuChi = true;
                if (tc.getMaMinhChung() == null) {
                    System.out.println("Tieu chi khong co ma minh chung!");
                    return;
                }
                System.out.print("Nhap ma minh chung muon xoa: ");
                int maMinhChung = Integer.parseInt(sc.nextLine());
                if (tc.getMaMinhChung() != null) {
                    tc.setMaMinhChung(null);
                    System.out.println("Xoa ma minh chung thanh cong!");
                } else {
                    System.out.println("Ma minh chung khong ton tai trong tieu chi!");
                    return;
                }
            }
        }
        if (timThayMaTieuChi == false) {
            System.out.println("Ma tieu chi khong ton tai trong danh sach!");
        }
    }
//    public void capNhatMinhChungChoTieuChi(List<TieuChi> dsTieuChi, String maMinhChung, List<MinhChung> dsMinhChung) {
//        boolean check = false;
//        for (MinhChung mc : dsMinhChung) {
//            if (maMinhChung.equals(Integer.toString(mc.getMaMinhChung()))) {
//                check = true;
//            }
//        }
//        if (check == false) {
//            System.out.print("Ma minh chung khong ton tai!!");
//            return;
//        }
//        do {
//            System.out.println("Ten Tieu Chi: ");
//            System.out.println("Noi Dung: ");
//            System.out.println("Ma Minh Chung: ");
//            System.out.print("Ban chon: ");
//            choose = sc.nextInt();
//            sc.nextLine();
//            switch (choose) {
//                case 1:
//                    System.out.print("Nhap ten tieu chi: ");
//                    String tenTieuChi = sc.nextLine();
//                    break;
//                case 2:
//                    System.out.print("Nhap noi dung: ");
//                    String noiDung = sc.nextLine();
//                    break;
//                case 3:
//                    boolean checkMa = false;
//                    System.out.print("Nhap ma tieu chi: ");
//                    String maMinhChung = sc.nextLine();
//                    for (MinhChung mc : dsMinhChung) {
//                        if (maMinhChung.toLowerCase().equals(maMinhChung.toLowerCase())) {
//                            checkMa = true;
//                        }
//
//                    }
//                    if (!checkMa) {
//                        System.out.println("Ma minh chung ko ton tai!");
//                        return;
//                    }
//                    break;
//            }
//        } while (choose != 0);
//    }
//    public void xoaMinhChungTrongTieuChi(List<TieuChi> dsTieuChi) {
//        List<Integer> maMinhChung = new ArrayList<>();
//        boolean check = true;
//        System.out.printf("Nhap ma tieu chuan can tim:  ");
//        int maTieuChi = Integer.parseInt(sc.nextLine());
//        for(TieuChi tc: dsTieuChi){
//            if(tc.getMaTieuChi() == maTieuChi)
//                check = true;
//                dsTieuChi.remove(maMinhChung);
//        }
//        
//    }
//        for (TieuChi tc : dsTieuChi) {
//            if (tc.getMaMinhChung().equals(maMinhChung)) {
//                dsTieuChi.remove(tc);
//                System.out.print("Da xoa minh chung" + maMinhChung);
//
//            }
//        }
//        if (check == false) {
//            System.out.println("Ma minh chung khong ton tai!!");
//        }
//    }

    public void hienThiTieuChi(List<TieuChi> dsTieuChi) {
        for (TieuChi tc1 : dsTieuChi) {
            tc1.hienThi();
        }
    }

    public void themMinhChung(List<MinhChung> dsMinhChung) throws ParseException {
        boolean isMaMinhChungTrung = false;
        System.out.print("Nhap ma minh chung: ");
        int maMinhChung = Integer.parseInt(sc.nextLine());
        for (MinhChung mc : dsMinhChung) {
            if (mc.getMaMinhChung() == maMinhChung) {
                isMaMinhChungTrung = true;
                System.out.println("Ma minh chung da ton tai trong danh sach!");
                break;
            }
        }
        if (isMaMinhChungTrung) {
            return;
        }

        System.out.print("Nhap ten minh chung: ");
        String tenMinhChung = sc.nextLine();
        System.out.print("Nhap noi ban hanh: ");
        String noiBanHanh = sc.nextLine();
        System.out.print("Nhap ngay ban hanh: ");
        Date ngayBanHanh = f.parse(sc.nextLine());
        System.out.print("Nhap phong ban chiu trach nhiem: ");
        String phongBanChiuTrachNhiem = sc.nextLine();
        System.out.print("Nhap ngay phong ban cung cap: ");
        Date ngayPhongBanCungCap = f.parse(sc.nextLine());
        System.out.print("Nhap ngay tao minh chung: ");
        Date ngayTaoMinhChung = f.parse(sc.nextLine());
        MinhChung mc = new MinhChung(maMinhChung, tenMinhChung, noiBanHanh, ngayBanHanh, phongBanChiuTrachNhiem, ngayPhongBanCungCap, ngayTaoMinhChung);
        dsMinhChung.add(mc);
    }

    public void hienThiMinhChung(List<MinhChung> dsMinhChung) {
        for (MinhChung mc1 : dsMinhChung) {
            mc1.hienThi();
        }
    }

    /**
     * @return the iDLoaiNV
     */
    public int getiDLoaiNV() {
        return iDLoaiNV;
    }

    /**
     * @param iDLoaiNV the iDLoaiNV to set
     */
    public void setiDLoaiNV(int iDLoaiNV) {
        this.iDLoaiNV = iDLoaiNV;
    }

    public boolean kiemTraThemMinhChung(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isThemMinhChung() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraThemTieuChi(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isThemTieuChi() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraThemTieuChuan(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isThemTieuChuan() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraVietBaoCao(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isVietBaoCao() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraThemMinhChungVaoTieuChi(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isThemMinhChungVaoTieuChi() == true) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraXemMinhChungTrongTieuChi(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isXem() == true) {
                return true;
            }
        }
        return false;
                
    }
    public boolean kiemTraXoaTieuChuan(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isXoaTieuChuan()== true) {
                return true;
            }
        }
        return false;
    }

}
