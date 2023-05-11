/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOPTiep.P1_ChuaBTVN;

/**
 *
 * @author hangnt
 */
public class Nguoi {

    private String ten;
    private String diaChi;
    private int tuoi;

    public Nguoi(String ten, String diaChi, int tuoi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public Nguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void display() {
        System.out.printf("\nten: %s | tuoi: %d | dia chi: %s", ten, tuoi, diaChi);
        System.out.println("Hang");
    }
}
