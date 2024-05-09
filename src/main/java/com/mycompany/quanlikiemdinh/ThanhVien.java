/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlikiemdinh;

/**
 *
 * @author Admin
 */
public abstract class ThanhVien {
    private int maTV;
    private String ten;
    public ThanhVien()
    {
    }
    public ThanhVien(String ten ,int maTV)
    {
        this.ten = ten;
        this.maTV = maTV;
    }
    public int getMaTV() {
        return maTV;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
