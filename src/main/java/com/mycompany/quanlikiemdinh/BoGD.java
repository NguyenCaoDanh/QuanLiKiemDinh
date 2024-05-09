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
public class BoGD {

    private List<KiemDinh> dsKiemDinh = new ArrayList<>();
    private List<TieuChuan> dsTieuChuan = new ArrayList<>();
    KiemDinh d = new KiemDinh();
    int choose;

    public void themBoKiemDinh(List<KiemDinh> dsKiemDinh, List<TieuChuan> dsTieuChuan) {
        List<Integer> maTieuChuan = new ArrayList<>();
        boolean check = false;
        System.out.print("Ma Kiem Dinh: ");
        int maKiemDinh = Integer.parseInt(sc.nextLine());
        System.out.print("Ten Kiem Dinh: ");
        String tenKiemDinh = sc.nextLine();
        System.out.printf("Ten Khoa: ");
        String tenKhoa = sc.nextLine();
        do {
            System.out.printf("Them ma tieu chuan: ");
            choose = Integer.parseInt(sc.nextLine());
            for (TieuChuan tc : dsTieuChuan) {

                if (tc.getMaTieuChuan() == choose) {
                    check = true;
                    maTieuChuan.add(choose);
                    break;
                } else {
                    check = false;

                }
            }
            if (check == false && choose != -1) {
                System.out.printf("Ko ton tai tieu chuan\n");
            }

        } while (choose != -1);
        KiemDinh kd = new KiemDinh(maKiemDinh, tenKiemDinh, tenKhoa, maTieuChuan);
        dsKiemDinh.add(kd);
    }

    public void hienThiKiemDinh(List<KiemDinh> dsKiemDinh) {
        for (KiemDinh kd : dsKiemDinh) {
            kd.hienThi();
        }
    }

    public boolean kiemTraThemTieuChuan(int maTV, List<CapQuyen> dsQ) {
        for (CapQuyen q : dsQ) {
            if (q.getMaTV() == maTV && q.isThemTieuChuan() == true) {
                return true;
            }
        }
        return false;
    }

}
