/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_CRUD_FULL_Thread_Genernic.B2_Generic;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    private String ma;
    private Integer tuoi;
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String ma, Integer tuoi, String diaChi) {
        this.ma = ma;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
