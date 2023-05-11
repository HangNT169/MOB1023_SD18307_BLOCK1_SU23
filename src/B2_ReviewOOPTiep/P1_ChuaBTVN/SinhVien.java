/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOPTiep.P1_ChuaBTVN;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, double diem, String ten, String diaChi, int tuoi) {
        super(ten, diaChi, tuoi);
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
        System.out.printf(" | ma sinh vien: %s | diem: %.1f", maSV, diem);
        System.out.println("Phong");
    }

}
