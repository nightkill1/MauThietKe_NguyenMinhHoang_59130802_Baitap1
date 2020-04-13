/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenMinhHoang_59130802_Baitap4;

import java.util.ArrayList;

/**
 *
 * @author beron
 */
public class QuanLyChuyenXe {
    ArrayList<Chuyenxe> DSChuyenxe = new ArrayList<>();
    
    public void themChuyenXe(Chuyenxe CX){
        DSChuyenxe.add(CX);
    }
      
    public void inListChuyenXe(){
        for(int i = 0; i < DSChuyenxe.size(); i++){
            System.out.println("Chuyến xe số: "+(i+1));
            DSChuyenxe.get(i).inThongTinChuyenXe();
            System.out.println("-------------------------");
        }
    }
    
    public double tinhDoanhThuNoiThanh(){
        double doanhThu = 0;
        for(int i = 0; i < DSChuyenxe.size(); i++){
            if(DSChuyenxe.get(i) instanceof XeNoiThanh)
                doanhThu += DSChuyenxe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double doanhThu = 0;
        for(int i = 0; i < DSChuyenxe.size(); i++){
            if(DSChuyenxe.get(i) instanceof XeNgoaiThanh)
                doanhThu += DSChuyenxe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    public double tongDoanhThu(){
        double doanhThu = 0;
        for(int i = 0; i < DSChuyenxe.size(); i++){
            doanhThu += DSChuyenxe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
}
