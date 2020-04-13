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
public class XeNoiThanh extends Chuyenxe{
    int soTuyen;
    double soKm;
     
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    
    @Override
    public void inThongTinChuyenXe() {
        System.out.println("Mã số chuyến: "+this.MSChuyen);   
        System.out.println("Họ và tên tài xế: "+this.hoTenTaiXe);
        System.out.println("Số xe: "+this.soXe);
        System.out.println("Số tuyến: "+this.soTuyen);
        System.out.println("Số km đã đi: "+this.soKm);
        System.out.println("Doanh thu: "+this.doanhThu);
        
    }
}
