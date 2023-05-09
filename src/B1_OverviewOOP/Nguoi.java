/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_OverviewOOP;

/**
 *
 * @author hangnt
 */
public class Nguoi {
//Tạo class Nguoi gồm các thuộc tính ten-String,  
//tuoi-int, diaChi-String  
//và các phương thức(contructor có  
//và không tham số, getter, setter) display():void. 

    // 1 Doi Tuong(Object) gom 2 dac trung:
    //  - Thuoc tinh(attribute) <=> Cac bien 
    //  - Phuong Thuc/ Hanh Dong (method) <=> Cac ham  
    private String ten;
    private int tuoi;
    private String diaChi;

    // Contructor : Khoi tao 1 doi tuong 
    // Dac trung cua contructor:
    // Ten cua contructor trung vs ten cua class 
    // Contructor khong co kieu du lieu tra ve (K co return)
    // Co 2 loai contructor :
    // - Contructor Co tham so
    // - Contructor khong tham so 
    // Mac dinh cua 1 class => Contructor khong tham so
    public Nguoi() {
    }
//
//    // contructor full tham so
    public Nguoi(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
//
//    public Nguoi(String ten, int tuoi) {
//        this.ten = ten;
//        this.tuoi = tuoi;
//    }

    // Getter : Lay ra cac gia tri thuoc tinh
    public String getTen() {
        return ten;
    }

    // Setter : Thay doi gia tri cua thuoc tinh
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void display() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
    }
}
