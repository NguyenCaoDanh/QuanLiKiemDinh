/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TieuChuan {

    private int maTieuChuan;
    private String tenTieuChuan;
    private String noiDung;
    private List<Integer> maTieuChi = new ArrayList<>();

    public TieuChuan() {
    }

    public TieuChuan(int maTieuChuan, String tenTieuChuan, String noiDung,List<Integer> maTieuChi) {
        this.maTieuChuan = maTieuChuan;
        this.tenTieuChuan = tenTieuChuan;
        this.noiDung = noiDung;
        this.maTieuChi = maTieuChi;
    }

    public void inTieuChuan() {
        System.out.printf("Ma Tieu Chuan:%s\n", this.maTieuChuan);
        System.out.printf("Ten Tieu Chuan:%s\n", this.tenTieuChuan);
        System.out.printf("Noi Dung:%s\n", this.noiDung);
        for(Integer i : maTieuChi){
            System.out.printf("MaTieuChi: %s\n", i);
        }
    }

    public int getMaTieuChuan() {
        return maTieuChuan;
    }

    public void setMaTieuChuan(int maTieuChuan) {
        this.maTieuChuan = maTieuChuan;
    }

    public String getTenTieuChuan() {
        return tenTieuChuan;
    }

    public void setTenTieuChuan(String tenTieuChuan) {
        this.tenTieuChuan = tenTieuChuan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the maTieuChi
     */
    public List<Integer> getMaTieuChi() {
        return maTieuChi;
    }

    /**
     * @param maTieuChi the maTieuChi to set
     */
    public void setMaTieuChi(List<Integer> maTieuChi) {
        this.maTieuChi = maTieuChi;
    }

}
