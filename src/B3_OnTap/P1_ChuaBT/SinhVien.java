/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OnTap.P1_ChuaBT;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    private String maSV;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, boolean gioiTinh, String diaChi) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void display() {
        System.out.println("ma sinh vien" + maSV);
        System.out.println("ten sinh vien" + ten);
        System.out.println("tuoi" + tuoi);
        System.out.println("gioi tinh " + gioiTinh);
        System.out.println("dia chi" + diaChi);
    }
}
