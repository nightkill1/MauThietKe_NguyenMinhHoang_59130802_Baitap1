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
public class MauThietKe_NguyenMinhHoang_59130802_Baitap3 {
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienIT svIt = new SinhVienIT("Nguyen Minh Hoang", "Công nghệ thông tin", 6, 8.5, 8);
        
        SinhVienBiz svBiz = new SinhVienBiz("Bui thi Thanh Hieu", "Quan Tri Kinh Doanh", 9, 9.5);
        
        svIt.xuat();
        
        System.out.println("-----------------------");
        
        svBiz.xuat();
    }
}
