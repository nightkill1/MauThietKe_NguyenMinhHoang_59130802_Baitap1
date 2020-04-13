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
public class SinhVienBiz extends SinhVienpoly{
    
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2*this.diemMarketing+this.diemSales)/3;
    }
    
}