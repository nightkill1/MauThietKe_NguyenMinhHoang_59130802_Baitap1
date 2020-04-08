/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_bai1;

import java.util.Scanner;

/**
 *
 * @author beron
 */
public class NhanVien {
    
    public String Ten;
    public  int Tuoi;
    public  String DiaChi;
    public  Float Luong;
    public  Integer TongSoGio;
    
    public String getTen()
    {
        return Ten;
    }
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public Integer getTuoi()
    {
        return Tuoi;
    }
    public void setTuoi(int Tuoi)
    {
        this.Tuoi = Tuoi;
    }
    
    public String getDiaChi()
    {
        return DiaChi;
    }
    public void setDiaChi(String DiaChi)
    {
        this.DiaChi = DiaChi;
    }
    public Float getLuong()
    {
        return  Luong;
    }
    public void setLuong(float Luong)
    {
        this.Luong = Luong;
    }
    public Integer getTongSoGio()
    {
        return TongSoGio;
    }
    public void setTongSoGio(Integer TongSoGio)
    {
        this.TongSoGio  = TongSoGio;
    }
    
    public void getThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten");
         Ten = sc.nextLine();
         System.out.println("Nhap Tuoi");
         Tuoi = sc.nextInt();
         sc.nextLine();
         System.out.println("Nhap DiaChi");
         DiaChi = sc.nextLine();
         System.out.println("Nhap Luong");
         Luong = sc.nextFloat();
         System.out.println("Nhap T ongSo Gio Lam");
         TongSoGio = sc.nextInt();
         
    }
    public float tinhThuong()
    {
        float luongthuong;
        if(this.TongSoGio >= 200)
        {
            luongthuong =  this.Luong*20/100;
        }else if(this.TongSoGio <200 && this.TongSoGio>=100)
        {
             luongthuong = this.Luong*10/100;
        }else
        {
            luongthuong = this.Luong;
        }
        return luongthuong;
    }
}
