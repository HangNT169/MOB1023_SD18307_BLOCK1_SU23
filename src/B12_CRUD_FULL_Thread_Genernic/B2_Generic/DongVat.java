/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_CRUD_FULL_Thread_Genernic.B2_Generic;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String ma;
    private Boolean gioiTinh;
    private String khuVucSong;

    public DongVat() {
    }

    public DongVat(String ma, Boolean gioiTinh, String khuVucSong) {
        this.ma = ma;
        this.gioiTinh = gioiTinh;
        this.khuVucSong = khuVucSong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

}
