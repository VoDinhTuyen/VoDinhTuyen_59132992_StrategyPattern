/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author My PC
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HangHoa hangHoa1 = new HangHoa("USB", 135000, "USB kingston");
        HangHoa hangHoa2 = new HangHoa("điện thoại", 3500000, "điện thoại nokia");
        
        HangHoa hangHoa3 = new HangHoa("RAM", 650000, "RAM Samsung 4Gb");
        HangHoa hangHoa4 = new HangHoa("Cable", 80000, "cable RJ-45 7m");
        
        GioHang gioHang1 = new GioHang();
        gioHang1.themHH(hangHoa1);
        gioHang1.themHH(hangHoa2);
        gioHang1.setHinhThucTT(new ThanhToanCOD());
        gioHang1.inDSHH();
        System.out.println("Tiền phải thanh toán: "+gioHang1.getThanhToan(gioHang1.getTienHang())+"\n");
        
        GioHang gioHang2 = new GioHang();
        gioHang2.themHH(hangHoa3);
        gioHang2.themHH(hangHoa4);
        gioHang2.setHinhThucTT(new ThanhToanOnline());
        gioHang2.inDSHH();
        System.out.println("Tiền phải thanh toán: "+gioHang2.getThanhToan(gioHang2.getTienHang()));
                
    }
    
}
