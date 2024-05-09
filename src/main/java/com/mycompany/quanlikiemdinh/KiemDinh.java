/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

import static Design.Design.sc;
import static Design.Design.SO_TIEU_CHUAN_TOI_DA;
import static Design.Design.SO_TIEU_CHUAN_TOI_THIEU;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KiemDinh {

    private int maKiemDinh;
    private String tenKiemDinh;
    private String tenKhoa;
    private TieuChuan boTieuChuan;
    private int soTieuChi = 0;
    private List<TieuChuan> dsTieuChuan = new ArrayList<>();
    private List<Integer> maTieuChuan = new ArrayList<>();

    public KiemDinh() {
    }

    public KiemDinh(int maKiemDinh, String tenKiemDinh, String tenKhoa, List<Integer> maTieuChuan) {
        this.maKiemDinh = maKiemDinh;
        this.tenKiemDinh = tenKiemDinh;
        this.tenKhoa = tenKhoa;
        this.maTieuChuan = maTieuChuan;
    }

//    public void nhapKiemDinh() {
//        System.out.print("Nhap Khoa:\n");
//        this.tenKhoa = sc.nextLine();
//        System.out.print("Nhap Ma Kiem Dinh:\n");
//        this.maKiemDinh = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Nhap Ten Kiem Dinh:\n");
//        this.tenKiemDinh = sc.nextLine();
//        for (Integer i : maTieuChuan) {
//            System.out.printf("Ma Tieu Chuan: %s\n", i);
//            }
//    }
        public void hienThi() {
        System.out.printf("Ma Kiem Dinh: %s\n", this.maKiemDinh);
        System.out.printf("Ten Kiem Dinh: %s\n", this.tenKiemDinh);
        System.out.printf("Ten Khoa: %s\n", this.tenKhoa);
        for(Integer i : maTieuChuan){
            System.out.printf("Ma Tieu Chuan: %s\n", i);
        }
    }
    public List<Integer> getMaTieuChuan() {
        return maTieuChuan;
    }

    public void setMaTieuChuan(List<Integer> maTieuChuan) {
        this.maTieuChuan = maTieuChuan;
    }

    public void themTieuChuan(TieuChuan... a) throws Exception {
        this.soTieuChi += a.length;
        if (this.soTieuChi < SO_TIEU_CHUAN_TOI_THIEU) {
            throw new Exception("Khong du so luong tieu chi!\n");
        } else if (this.soTieuChi > SO_TIEU_CHUAN_TOI_DA) {
            throw new Exception("Vuot qua so luong tieu chi!\n");
        } else {
            this.dsTieuChuan.addAll(Arrays.asList(a));
        }
    }

    public int getMaKiemDinh() {
        return maKiemDinh;
    }

    public void setMaKiemDinh(int maKiemDinh) {
        this.maKiemDinh = maKiemDinh;
    }

    public String getTenKiemDinh() {
        return tenKiemDinh;
    }

    public void setTenKiemDinh(String tenKiemDinh) {
        this.tenKiemDinh = tenKiemDinh;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    /**
     * @return the dsTieuChuan
     */
    public List<TieuChuan> getDsTieuChuan() {
        return dsTieuChuan;
    }

    /**
     * @param dsTieuChuan the dsTieuChuan to set
     */
    public void setDsTieuChuan(List<TieuChuan> dsTieuChuan) {
        this.dsTieuChuan = dsTieuChuan;
    }

    /**
     * @return the boTieuChi
     */
    public TieuChuan getBoTieuChuan() {
        return boTieuChuan;
    }

    /**
     * @param boTieuChuan the boTieuChi to set
     */
    public void setBoTieuChuan(TieuChuan boTieuChuan) {
        this.boTieuChuan = boTieuChuan;
    }
}
