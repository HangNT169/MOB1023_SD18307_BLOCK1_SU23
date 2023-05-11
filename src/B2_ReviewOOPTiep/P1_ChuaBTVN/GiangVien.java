/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOPTiep.P1_ChuaBTVN;

/**
 *
 * @author hangnt
 */
public class GiangVien extends Nguoi {

    public int bac;

    public GiangVien() {
    }

    public GiangVien(int bac, String ten, String diaChi, int tuoi) {
        super(ten, diaChi, tuoi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void display() {
        super.display(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print(" | bac: " + bac);
    }

}
