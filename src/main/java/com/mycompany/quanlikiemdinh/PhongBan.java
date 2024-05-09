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
public class PhongBan {

    private int maPB;
    private String tenPB;
//    private List<Integer>maMinhChung= new ArrayList<>();

    public PhongBan(int maPB, String tenPB/*,List<Integer>maMinhChung*/) {
        this.maPB = maPB;
        this.tenPB = tenPB;
//        this.maMinhChung = maMinhChung;
    }

    public PhongBan() {

    }

    public void taoPhongBan() {
        System.out.printf("Ma Phong Ban: %s\n", this.maPB);
        System.out.printf("Ten Phong Ban: %s\n", this.tenPB);
        System.out.println("======================================");
    }

    public int getMaPB() {
        return maPB;
    }

    public void setMaPB(int maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

}
