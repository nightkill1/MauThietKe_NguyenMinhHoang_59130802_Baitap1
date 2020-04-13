/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MauThietKe_NguyenMinhHoang_59130802_Baitap3;
import java.util.Scanner;
/**
 *
 * @author beron
 */
public abstract class SinhVienpoly {
    public String hoTen;
    public String nganh;

    SinhVienpoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    
    public String getHocLuc(){
        if(this.getDiem() < 5)
            return "Yếu";
        else if(this.getDiem() >= 5 && this.getDiem() < 6.5)
            return "Trung bình";
        else if(this.getDiem() >= 6.5 && this.getDiem() < 7.5)
            return "Khá";
        else if(this.getDiem() >= 7.5 && this.getDiem() < 9)
            return "Giỏi";
        else
            return "Xuất sắc";
    }
    
    public void xuat(){
        System.out.println("Họ tên sinh viên: "+this.hoTen+
                "\nNgành học: "+this.nganh+
                "\nĐiểm: "+this.getDiem()+
                "\nHọc lực: "+this.getHocLuc());
    }
    
}
