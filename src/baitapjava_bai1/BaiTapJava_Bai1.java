/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_bai1;
import baitapjava_bai1.NhanVien;
/**
 *
 * @author beron
 */
public class BaiTapJava_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien Nv = new NhanVien();
        NhanVien Nv1 = new NhanVien();
        Nv.getThongTin();
        Nv1.getThongTin();
        System.out.println("-------------NHAN VIEN 1-----------------");
        System.out.println("ten \t\t:" + Nv.Ten);
        System.out.println("Tuoi \t\t:" + Nv.Tuoi);
        System.out.println("Dia chi \t:" + Nv.DiaChi);
        System.out.println("Luong \t\t:" + Nv.Luong);
        System.out.println("Tong so gio lam :" + Nv.TongSoGio);
        System.out.println("Tien thuong cho vien :"+ Nv.tinhThuong());
        System.out.println("-------------NHAN VIEN 2-----------------");
        System.out.println("ten \t\t:" + Nv1.Ten);
        System.out.println("Tuoi \t\t:" + Nv1.Tuoi);
        System.out.println("Dia chi \t:" + Nv1.DiaChi);
        System.out.println("Luong \t\t:" + Nv1.Luong);
        System.out.println("Tong so gio lam :" + Nv1.TongSoGio);
        System.out.println("Tien thuong cho vien"+ Nv1.tinhThuong());
    }   
    
}
