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
public class Baitap4 {
     public static void main(String[] args) {
        XeNoiThanh xeNoi = new XeNoiThanh("001", "Nguyễn Minh Hoàng", "79 N1-24550", 15000, 5, 50);
        XeNoiThanh xeNoi1 = new XeNoiThanh("002", "Đoàn Văn Hậu", "79 N1-55550", 35000, 1, 50);
        XeNoiThanh xeNoi2 = new XeNoiThanh("003", "Mai Quốc Khánh", "79 V1-12345", 55000, 10, 70);
        
        XeNgoaiThanh xeNgoai = new XeNgoaiThanh("Đà Nẵng", 5, "004", "Đăng Quốc Tài", "79 N1-45678", 200000);
        XeNgoaiThanh xeNgoai1 = new XeNgoaiThanh("HCM", 20, "005", "Nguyễn Trọng Luân", "79 N2-9009", 350000);
        XeNgoaiThanh xeNgoai2 = new XeNgoaiThanh("Ninh Thuận", 10, "005", "Bùi Anh Tú", "79 V1-12369", 100000);
        
        var qlXe = new QuanLyChuyenXe();
        qlXe.themChuyenXe(xeNoi);
        qlXe.themChuyenXe(xeNoi1);
        qlXe.themChuyenXe(xeNoi2);
        
        qlXe.themChuyenXe(xeNgoai);
        qlXe.themChuyenXe(xeNgoai1);
        qlXe.themChuyenXe(xeNgoai2);
        qlXe.inListChuyenXe();
        
        System.out.println("Tổng số doanh thu xe nội thành: "+qlXe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng số doanh thu xe ngoai thành: "+qlXe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng số doanh thu: "+qlXe.tongDoanhThu());
    }
}
