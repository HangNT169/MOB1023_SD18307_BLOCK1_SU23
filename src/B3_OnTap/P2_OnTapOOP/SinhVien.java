/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OnTap.P2_OnTapOOP;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private double diem;

    // SV co 5 thuoc tinh : 3 thuoc tinh ke thua tu cha 
    public SinhVien() {
    }

    public SinhVien(String maSV, double diem, String ten, int tuoi, String diaChi) {
        super(ten, tuoi, diaChi);
        this.maSV = maSV;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("MSV: " + maSV);
        System.out.println("Diem: " + diem);
    }
}
