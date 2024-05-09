/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

import static Design.Design.sc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CapQuyen {

//    private String user;
//    private String password;
    private int maTV;
    private boolean themTieuChi;
    private boolean xoaTieuChi;
    private boolean capNhatTieuChi;
    private boolean themTieuChuan;
    private boolean xoaTieuChuan;
    private boolean capNhatTieuChuan;
    private boolean themMinhChung;
    private boolean xoaMinhChung;
    private boolean capNhatMinhChung;
    private boolean themMinhChungVaoTieuChi;
    private boolean xem;
    private boolean timKiemTheoTen;
    private boolean timKiemTheoNoiBanHanh;
    private boolean timKiemTheoNgayBanHanh;
    private boolean timKiemTheoTenHoacPhongBan;
    private boolean sapXepTheoNgayTaoMinhChung;
    private boolean sapXepTheoTenHoacNgayTaoMinhChung;
    private boolean vietBaoCao;

//    private boolean checkPassWord;
//    private boolean checkUserName;
    public CapQuyen() {
    }

    public CapQuyen(int maTV, boolean themTieuChi, boolean xoaTieuChi, boolean capNhatTieuChi, boolean themTieuChuan, boolean xoaTieuChuan, boolean themMinhChung,
            boolean xoaMinhChung, boolean capNhatMinhChung, boolean themMinhChungVaoTieuChi, boolean xem, boolean timKiemTheoTen, boolean timKiemTheoNgayBanHanh, boolean timKiemTheoNoiBanHanh,
            boolean timKiemTheoTenHoacPhongBan, boolean sapXepTheoNgayTaoMinhChung, boolean sapXepTheoTenHoacNgayTaoMinhChung, boolean vietBaoCao) {
        this.themTieuChi = themTieuChi;
        this.maTV = maTV;
        this.xoaTieuChi = xoaTieuChi;
        this.capNhatTieuChi = capNhatTieuChi;
        this.themTieuChuan = themTieuChuan;
        this.xoaTieuChuan = xoaTieuChuan;
        this.themMinhChung = themMinhChung;
        this.xoaMinhChung = xoaMinhChung;
        this.capNhatMinhChung = capNhatMinhChung;
        this.xem = xem;
        this.timKiemTheoTen = timKiemTheoTen;
        this.timKiemTheoNoiBanHanh = timKiemTheoNoiBanHanh;
        this.timKiemTheoNgayBanHanh = timKiemTheoNgayBanHanh;
        this.timKiemTheoTenHoacPhongBan = timKiemTheoTenHoacPhongBan;
        this.sapXepTheoNgayTaoMinhChung = sapXepTheoNgayTaoMinhChung;
        this.sapXepTheoTenHoacNgayTaoMinhChung = sapXepTheoTenHoacNgayTaoMinhChung;
        this.vietBaoCao = vietBaoCao;
    }

    List<CapQuyen> qlQuyen = new ArrayList<>();

    public void nhapCapQuyen(List<CapQuyen> qlQuyen) {
        System.out.print("Nhap ma thanh vien: ");
        this.maTV = sc.nextInt();
        sc.nextLine();
        System.out.print("Cap quyen xem (True or False): ");
        this.xem = sc.nextBoolean();
        System.out.print("Cap quyen them tieu chi(True or False): ");
        this.themTieuChi = sc.nextBoolean();
        System.out.print("Cap quyen xoa tieu chi(True or False): ");
        this.xoaTieuChi = sc.nextBoolean();
        System.out.print("Cap quyen cap nhat tieu chi(True or False): ");
        this.capNhatTieuChi = sc.nextBoolean();
        System.out.print("Cap quyen them tieu chuan(True or False): ");
        this.themTieuChuan = sc.nextBoolean();
        System.out.print("Cap quyen xoa tieu chuan(True or False): ");
        this.xoaTieuChuan = sc.nextBoolean();
        System.out.print("Cap quyen cap nhat tieu chuan(True or False): ");
        this.capNhatTieuChuan = sc.nextBoolean();
        System.out.print("Cap quyen minh chung(True or False): ");
        this.themMinhChung = sc.nextBoolean();
        System.out.print("Cap quyen xoa minh chung(True or False): ");
        this.xoaMinhChung = sc.nextBoolean();
        System.out.print("Cap quyen cap nhat minh chung(True or False): ");
        this.capNhatMinhChung = sc.nextBoolean();
        System.out.print("Cap quyen them minh chung vao tieu chi(True or False): ");
        this.themMinhChungVaoTieuChi = sc.nextBoolean();
        System.out.print("Cap quyen viet bao cao(True or False): ");
        this.vietBaoCao = sc.nextBoolean();
        sc.nextLine();

        CapQuyen q = new CapQuyen(maTV, themTieuChi, xoaTieuChi, capNhatTieuChi, themTieuChuan, xoaTieuChuan,
                themMinhChung, xoaMinhChung, capNhatMinhChung, themMinhChungVaoTieuChi, xem, timKiemTheoTen, timKiemTheoNgayBanHanh, timKiemTheoNoiBanHanh, timKiemTheoTenHoacPhongBan, sapXepTheoNgayTaoMinhChung, sapXepTheoTenHoacNgayTaoMinhChung, vietBaoCao);
        qlQuyen.add(q);
    }

    public void hienThiCapQuyenTheoList(List<CapQuyen> qlQuyen) {
        for (CapQuyen cq1 : qlQuyen) {
            cq1.hienThiCapQuyen();
        }
    }

    public void hienThiCapQuyen() {
        System.out.printf("Ma thanh vien: %s \n", this.maTV);
        System.out.printf("Xem: %s \n", this.xem);
        System.out.printf("Them tieu chi: %s \n", this.themTieuChi);
        System.out.printf("Xoa tieu chi: %s \n", this.xoaTieuChi);
        System.out.printf("Cap nhat tieu chi: %s \n", this.capNhatTieuChi);
        System.out.printf("Them tieu chuan: %s \n", this.themTieuChuan);
        System.out.printf("Xoa tieu chuan: %s \n", this.xoaTieuChuan);
        System.out.printf("Cap nhat tieu chuan: %s \n", this.capNhatTieuChuan);
        System.out.printf("Them minh chung: %s \n", this.themMinhChung);
        System.out.printf("Xoa minh chung: %s \n", this.xoaMinhChung);
        System.out.printf("Cap nhat minh chung:%s \n", this.capNhatMinhChung);
        System.out.printf("Them minh chung vao tieu chi:%s \n", this.themMinhChungVaoTieuChi);
        System.out.printf("Viet bao cao:%s \n", this.vietBaoCao);
        System.out.println("======================================");

    }

    /**
     * @return the user
     */
    /**
     * @return the idLoaiNV
     */
    /**
     * @return the themTieuChi
     */
    public boolean isThemTieuChi() {
        return themTieuChi;
    }

    /**
     * @param themTieuChi the themTieuChi to set
     */
    public void setThemTieuChi(boolean themTieuChi) {
        this.themTieuChi = themTieuChi;
    }

    /**
     * @return the xoaTieuChi
     */
    public boolean isXoaTieuChi() {
        return xoaTieuChi;
    }

    /**
     * @param xoaTieuChi the xoaTieuChi to set
     */
    public void setXoaTieuChi(boolean xoaTieuChi) {
        this.xoaTieuChi = xoaTieuChi;
    }

    /**
     * @return the capNhatTieuChi
     */
    public boolean isCapNhatTieuChi() {
        return capNhatTieuChi;
    }

    /**
     * @param capNhatTieuChi the capNhatTieuChi to set
     */
    public void setCapNhatTieuChi(boolean capNhatTieuChi) {
        this.capNhatTieuChi = capNhatTieuChi;
    }

    /**
     * @return the themTieuChuan
     */
    public boolean isThemTieuChuan() {
        return themTieuChuan;
    }

    /**
     * @param themTieuChuan the themTieuChuan to set
     */
    public void setThemTieuChuan(boolean themTieuChuan) {
        this.themTieuChuan = themTieuChuan;
    }

    /**
     * @return the xoaTieuChuan
     */
    public boolean isXoaTieuChuan() {
        return xoaTieuChuan;
    }

    /**
     * @param xoaTieuChuan the xoaTieuChuan to set
     */
    public void setXoaTieuChuan(boolean xoaTieuChuan) {
        this.xoaTieuChuan = xoaTieuChuan;
    }

    /**
     * @return the capNhatTieuChuan
     */
    public boolean isCapNhatTieuChuan() {
        return capNhatTieuChuan;
    }

    /**
     * @param capNhatTieuChuan the capNhatTieuChuan to set
     */
    public void setCapNhatTieuChuan(boolean capNhatTieuChuan) {
        this.capNhatTieuChuan = capNhatTieuChuan;
    }

    /**
     * @return the themMinhChung
     */
    public boolean isThemMinhChung() {
        return themMinhChung;
    }

    /**
     * @param themMinhChung the themMinhChung to set
     */
    public void setThemMinhChung(boolean themMinhChung) {
        this.themMinhChung = themMinhChung;
    }

    /**
     * @return the xoaMinhChung
     */
    public boolean isXoaMinhChung() {
        return xoaMinhChung;
    }

    /**
     * @param xoaMinhChung the xoaMinhChung to set
     */
    public void setXoaMinhChung(boolean xoaMinhChung) {
        this.xoaMinhChung = xoaMinhChung;
    }

    /**
     * @return the capNhatMinhChung
     */
    public boolean isCapNhatMinhChung() {
        return capNhatMinhChung;
    }

    /**
     * @param capNhatMinhChung the capNhatMinhChung to set
     */
    public void setCapNhatMinhChung(boolean capNhatMinhChung) {
        this.capNhatMinhChung = capNhatMinhChung;
    }

    /**
     * @return the checkPassWord
     */
//    public boolean isCheckPassWord() {
//        return checkPassWord;
//    }
//
//    /**
//     * @param checkPassWord the checkPassWord to set
//     */
//    public void setCheckPassWord(boolean checkPassWord) {
//        this.checkPassWord = checkPassWord;
//    }
//
//    /**
//     * @return the checkUserName
//     */
//    public boolean isCheckUserName() {
//        return checkUserName;
//    }
//
//    /**
//     * @param checkUserName the checkUserName to set
//     */
//    public void setCheckUserName(boolean checkUserName) {
//        this.checkUserName = checkUserName;
//    }
    /**
     * @return the maTV
     */
    public boolean isXem() {
        return xem;
    }

    public void setXem(boolean xem) {
        this.xem = xem;
    }

    public boolean isTimKiemTheoTen() {
        return timKiemTheoTen;
    }

    public void setTimKiemTheoTen(boolean timKiemTheoTen) {
        this.timKiemTheoTen = timKiemTheoTen;
    }

    public boolean isTimKiemTheoNoiBanHanh() {
        return timKiemTheoNoiBanHanh;
    }

    public void setTimKiemTheoNoiBanHanh(boolean timKiemTheoNoiBanHanh) {
        this.timKiemTheoNoiBanHanh = timKiemTheoNoiBanHanh;
    }

    public boolean isTimKiemTheoNgayBanHanh() {
        return timKiemTheoNgayBanHanh;
    }

    public void setTimKiemTheoNgayBanHanh(boolean timKiemTheoNgayBanHanh) {
        this.timKiemTheoNgayBanHanh = timKiemTheoNgayBanHanh;
    }

    public boolean isTimKiemTheoTenHoacPhongBan() {
        return timKiemTheoTenHoacPhongBan;
    }

    public void setTimKiemTheoTenHoacPhongBan(boolean timKiemTheoTenHoacPhongBan) {
        this.timKiemTheoTenHoacPhongBan = timKiemTheoTenHoacPhongBan;
    }

    public boolean isSapXepTheoNgayTaoMinhChung() {
        return sapXepTheoNgayTaoMinhChung;
    }

    public void setSapXepTheoNgayTaoMinhChung(boolean sapXepTheoNgayTaoMinhChung) {
        this.sapXepTheoNgayTaoMinhChung = sapXepTheoNgayTaoMinhChung;
    }

    public boolean isSapXepTheoTenHoacNgayTaoMinhChung() {
        return sapXepTheoTenHoacNgayTaoMinhChung;
    }

    public void setSapXepTheoTenHoacNgayTaoMinhChung(boolean sapXepTheoTenHoacNgayTaoMinhChung) {
        this.sapXepTheoTenHoacNgayTaoMinhChung = sapXepTheoTenHoacNgayTaoMinhChung;
    }

    public boolean isVietBaoCao() {
        return vietBaoCao;
    }

    public void setVietBaoCao(boolean vietBaoCao) {
        this.vietBaoCao = vietBaoCao;
    }

    public boolean isThemMinhChungVaoTieuChi() {
        return themMinhChungVaoTieuChi;
    }

    public void setThemMinhChungVaoTieuChi(boolean themMinhChungVaoTieuChi) {
        this.themMinhChungVaoTieuChi = themMinhChungVaoTieuChi;
    }

    public int getMaTV() {
        return maTV;
    }

    /**
     * @param maTV the maTV to set
     */
    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

}
