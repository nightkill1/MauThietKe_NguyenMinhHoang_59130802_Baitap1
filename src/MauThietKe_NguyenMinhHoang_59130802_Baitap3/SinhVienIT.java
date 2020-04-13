/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MauThietKe_NguyenMinhHoang_59130802_Baitap3;

/**
 *
 * @author beron
 */
public class SinhVienIT extends SinhVienpoly{
      public double diemJava;
    public double diemCss;
    public double diemHtml;
    
    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml){
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2*this.diemJava+this.diemHtml+this.diemCss)/4;
    }
}
