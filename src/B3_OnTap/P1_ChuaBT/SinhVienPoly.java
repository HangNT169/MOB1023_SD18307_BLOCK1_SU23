/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OnTap.P1_ChuaBT;

/**
 *
 * @author hangnt
 */
public class SinhVienPoly extends SinhVien {

    private String chuyenNghanh;
    private int kiHoc;

    public SinhVienPoly() {

    }

    public SinhVienPoly(String chuyenNghanh, int kiHoc) {
        this.chuyenNghanh = chuyenNghanh;
        this.kiHoc = kiHoc;
    }

    public SinhVienPoly(String chuyenNghanh, int kiHoc, String maSV, String ten, int tuoi, boolean gioiTinh, String diaChi) {
        super(maSV, ten, tuoi, gioiTinh, diaChi);
        this.chuyenNghanh = chuyenNghanh;
        this.kiHoc = kiHoc;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public int getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(int kiHoc) {
        this.kiHoc = kiHoc;
    }

    public void display() {
        super.display();
        System.out.println("chuyen nghanh hoc" + chuyenNghanh);
        System.out.println("ki hoc" + kiHoc);
    }

}
