/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author My PC
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SinhVien sinhVien1 = new SinhVien("Tuyen", "1999-07-07", 8.5f);
        SinhVien sinhVien2 = new SinhVien("An", "1999-07-17", 8.0f);
        SinhVien sinhVien3 = new SinhVien("Minh", "1999-07-17", 8.3f);
        
        QLSV dsSinhVien = new QLSV();
        dsSinhVien.themSV(sinhVien1);
        dsSinhVien.themSV(sinhVien2);
        dsSinhVien.themSV(sinhVien3);
        
        dsSinhVien.setSoSanh(new SoSanhTheoDiem());
        dsSinhVien.sapXep();
        System.out.println("Sắp xếp theo Điểm:");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh(new SoSanhTheoTen());
        dsSinhVien.sapXep();
        System.out.println("Sắp xếp theo tên:");
        dsSinhVien.inDS();
    }
    
}
