/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenMinhHoang_59130802_Baitap4;

/**
 *
 * @author beron
 */
public abstract class Chuyenxe {
    public String MSChuyen, hoTenTaiXe, soXe;
    double doanhThu;

    public Chuyenxe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.MSChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
//    setter &    getter
    public void setMaSoChuyen(String maSoChuyen){
        this.MSChuyen = maSoChuyen;
    }
    public void setHoTenTaiXe(String hoTenTaiXe){
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public void setSoXe(String soXe){
        this.soXe = soXe;
    }
    public void setDoanhThu(double doanhThu){
        this.doanhThu = doanhThu;
    }
    public String getMaSoChuyen(){
        return MSChuyen;
    }
    public String getHoTenTaiXe(){
        return hoTenTaiXe;
    }
    public String getSoXe(){
        return soXe;
    }
    public double getDoanhThu(){
        return doanhThu;
    }
    
    public abstract void inThongTinChuyenXe();
}
