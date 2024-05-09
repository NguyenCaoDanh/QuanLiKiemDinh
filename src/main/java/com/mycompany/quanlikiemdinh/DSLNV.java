/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

/**
 *
 * @author Admin
 */
public class DSLNV {

    private int iDLoaiNV;
    private String tenLoaiNV;

    public DSLNV() {
    }

    public DSLNV(int iDLoaiNV, String tenLoaiNV) {
        this.iDLoaiNV = iDLoaiNV;
        this.tenLoaiNV = tenLoaiNV;
    }

    public void hienThi() {
        System.out.printf("Ma loai nhan vien: %s\n", this.iDLoaiNV);
        System.out.printf("Ten loai nhan vien: %s\n", this.tenLoaiNV);
         System.out.println("======================================");
    }

    public int getiDLoaiNV() {
        return iDLoaiNV;
    }

    public void setiDLoaiNV(int iDLoaiNV) {
        this.iDLoaiNV = iDLoaiNV;
    }

    public String getTenLoaiNV() {
        return tenLoaiNV;
    }

    public void setTenLoaiNV(String tenLoaiNV) {
        this.tenLoaiNV = tenLoaiNV;
    }
}
