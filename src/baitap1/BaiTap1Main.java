/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author My PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SoHoc soHoc1 = new SoHoc();
        SoHoc soHoc2 = new SoHoc();
        soHoc1.setTinhToan(new Cong());
        soHoc2.setTinhToan(new Tru());
        System.out.println(soHoc1.tinh(75, 12));
        System.out.println(soHoc2.tinh(54, 78));
        
    }
    
}
