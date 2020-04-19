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
public class HangHoa {
    
    private String tenHH;
    private int gia;
    private String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    
    public String inHH() {
       return "Tên hàng hóa:"+tenHH+"\n"+"Giá:"+gia+"\n"+"Mô tả:"+moTa;
    }

    public int getGia() {
        return gia;
    }
    
    
}
