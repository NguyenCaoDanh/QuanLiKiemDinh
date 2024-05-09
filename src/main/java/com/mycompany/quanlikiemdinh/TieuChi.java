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
public class TieuChi {

    private int maTieuChi;
    private String tenTieuChi;
    private String noiDung;
    private List<Integer> maMinhChung = new ArrayList<>();
    private List<MinhChung> dsMinhChung;

    public TieuChi() {
    }

    public TieuChi(int maTieuChi, String tenTieuChi, String noiDung) {
        this.maTieuChi = maTieuChi;
        this.tenTieuChi = tenTieuChi;
        this.noiDung = noiDung;
    }

    public TieuChi(int maTieuChi, String tenTieuChi, String noiDung, List<Integer> maMinhChung) {
        this.maTieuChi = maTieuChi;
        this.tenTieuChi = tenTieuChi;
        this.noiDung = noiDung;
        this.maMinhChung = maMinhChung;

    }

    public void hienThi() {
        System.out.printf("Ma Tieu Chi: %s\n", this.maTieuChi);
        System.out.printf("Ten Tieu Chi: %s\n", this.tenTieuChi);
        System.out.printf("Noi Dung: %s\n", this.noiDung);
        for (Integer i : maMinhChung) {
            System.out.printf("MaMinhChung: %s\n", i);
        }
    }

    public int getMaTieuChi() {
        return maTieuChi;
    }

    public void setMaTieuChi(int maTieuChi) {
        this.maTieuChi = maTieuChi;
    }

    public String getTenTieuChi() {
        return tenTieuChi;
    }

    public void setTenTieuChi(String tenTieuChi) {
        this.tenTieuChi = tenTieuChi;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public List<Integer> getMaMinhChung() {
        return maMinhChung;
    }

    public void setMaMinhChung(List<Integer> maMinhChung) {
        this.maMinhChung = maMinhChung;
    }

    public List<MinhChung> getDsMinhChung() {
        return dsMinhChung;
    }

    public void setDsMinhChung(List<MinhChung> dsMinhChung) {
        this.dsMinhChung = dsMinhChung;
    }

    public void setMaMinhChung(int maMinhChung) {
        if (!this.maMinhChung.contains(maMinhChung)) {
            this.maMinhChung.add(maMinhChung);
        }
    }
}
