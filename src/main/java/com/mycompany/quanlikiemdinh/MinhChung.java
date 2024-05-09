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
public class MinhChung {

    private int maMinhChung;
    private String tenMinhChung;
    private String noiBanHanh;
    private Date ngayBanHanh;
    private String phongBanChiuTrachNhiem;
    private Date ngayPhongBanCungCap;
    private Date ngayTaoMinhChung;
    List<MinhChung> dsMinhChung = new ArrayList<>();

    public MinhChung() {
    }

    public MinhChung(int maMinhChung, String tenMinhChung, String noiBanHanh, Date ngayBanHanh, String phongBanChiuTrachNhiem,
            Date ngayPhongBanCungCap, Date ngayTaoMinhChung) {
        this.maMinhChung = maMinhChung;
        this.tenMinhChung = tenMinhChung;
        this.ngayBanHanh = ngayBanHanh;
        this.ngayPhongBanCungCap = ngayPhongBanCungCap;
        this.ngayTaoMinhChung = ngayTaoMinhChung;
        this.noiBanHanh = noiBanHanh;
        this.phongBanChiuTrachNhiem = phongBanChiuTrachNhiem;
    }

    public MinhChung(int maMinhChung, String tenMinhChung, String noiBanHanh, String ngayBanHanh, String phongBanChiuTrachNhiem,
            String ngayPhongBanCungCap, String ngayTaoMinhChung) throws ParseException {
        this(maMinhChung, tenMinhChung, noiBanHanh, f.parse(ngayBanHanh), phongBanChiuTrachNhiem,
                f.parse(ngayPhongBanCungCap),
                f.parse(ngayTaoMinhChung));
    }

//    public void nhapMinhChung(List<MinhChung> dsMinhChung) throws ParseException {
//        System.out.print("Nhap ma minh chung: ");
//        this.maMinhChung = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Nhap ten minh chung: ");
//        this.tenMinhChung = sc.nextLine();
//        System.out.print("Nhap noi ban hanh: ");
//        this.noiBanHanh = sc.nextLine();
//        System.out.print("Nhap ngay ban hanh: ");
//        this.ngayBanHanh = f.parse(sc.nextLine());
//        System.out.print("Nhap phong ban chiu trach nhiem: ");
//        this.phongBanChiuTrachNhiem = sc.nextLine();
//        System.out.print("Nhap ngay phong ban cung cap: ");
//        this.ngayPhongBanCungCap = f.parse(sc.nextLine());
//        System.out.print("Nhap ngay tao minh chung: ");
//        this.ngayTaoMinhChung = f.parse(sc.nextLine());
//        sc.nextLine();
//        MinhChung mc = new MinhChung(maMinhChung, tenMinhChung, noiBanHanh, ngayBanHanh
//                , phongBanChiuTrachNhiem, ngayPhongBanCungCap, ngayTaoMinhChung);
//        dsMinhChung.add(mc);
//    }
    public void hienThi() {
        System.out.printf("Ma minh chung: %s\n", this.maMinhChung);
        System.out.printf("Ten minh chung: %s\n", this.tenMinhChung);
        System.out.printf("Noi ban hanh: %s\n", this.noiBanHanh);
        System.out.printf("Ngay ban hanh: %s\n", this.ngayBanHanh);
        System.out.printf("Phong ban chiu trach nhiem: %s\n", this.phongBanChiuTrachNhiem);
        System.out.printf("Ngay phong ban cung cap: %s\n", this.ngayPhongBanCungCap);
        System.out.printf("Ngay tao minh chung: %s\n", this.ngayTaoMinhChung);
    }

    public int getMaMinhChung() {
        return maMinhChung;
    }

    public void setMaMinhChung(int maMinhChung) {
        this.maMinhChung = maMinhChung;
    }

    public String getTenMinhChung() {
        return tenMinhChung;
    }

    public void setTenMinhChung(String tenMinhChung) {
        this.tenMinhChung = tenMinhChung;
    }

    public String getNoiBanHanh() {
        return noiBanHanh;
    }

    public void setNoiBanHanh(String noiBanHanh) {
        this.noiBanHanh = noiBanHanh;
    }

    public Date getNgayBanHanh() {
        return ngayBanHanh;
    }

    public void setNgayBanHanh(Date ngayBanHanh) {
        this.ngayBanHanh = ngayBanHanh;
    }

    public String getPhongBanChiuTrachNhiem() {
        return phongBanChiuTrachNhiem;
    }

    public void setPhongBanChiuTrachNhiem(String phongBanChiuTrachNhiem) {
        this.phongBanChiuTrachNhiem = phongBanChiuTrachNhiem;
    }

    public Date getNgayPhongBanCungCap() {
        return ngayPhongBanCungCap;
    }

    public void setNgayPhongBanCungCap(Date ngayPhongBanCungCap) {
        this.ngayPhongBanCungCap = ngayPhongBanCungCap;
    }

    public Date getNgayTaoMinhChung() {
        return ngayTaoMinhChung;
    }

    public void setNgayTaoMinhChung(Date ngayTaoMinhChung) {
        this.ngayTaoMinhChung = ngayTaoMinhChung;
    }

    public List<MinhChung> getDsMinhChung() {
        return dsMinhChung;
    }

    public void setDsMinhChung(List<MinhChung> dsMinhChung) {
        this.dsMinhChung = dsMinhChung;
    }

}
