/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Date;

/**
 *
 * @author My PC
 */
public class SinhVien {

    private String ten;
    private String ngaySinh;
    private float diemTB;

    public SinhVien(String ten, String ngaySinh, float diemTB) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }
    
    public String getTen() {
        return ten;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public String inTT() {
        return "Tên:"+ten+"\n"+"Ngày sinh:"+ngaySinh+"\n"+"Điểm TB:"+diemTB;
    }
    
}
