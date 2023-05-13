/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OnTap.P1_ChuaBT;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    //Tao 1 class SinhVien gom cac thuoc tinh
    // maSV - String, ten - String, tuoi - int
    // gioiTinh - boolean , diaChi - String
    // va cac contructor, getter, setter va ham display(): void 
    // Tao 1 class SinhVienPoly ke thua tu class SinhVien
    // va them cac thuoc tinh sau: chuyenNganh - String, kiHoc - int
    // va cac contructor, getter, setter va ham display(): void 
    // Tao class Main. Nhap thong tin cua 1 sinh vien poly 
    // va in ra man hinh. Su dung contructor khong tham so 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma sinh vien ");
        String maSV = scanner.nextLine();
        System.out.println("nhap vao ten sinh vien");
        String ten = scanner.nextLine();
//        System.out.println("nhap vao tuoi ");
//        int tuoi = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
//        boolean gioiTinh = scanner.nextBoolean();
       // C1: Them scanner.nextLine()
//        scanner.nextLine();
        // C2: Coi tat ca moi thu nhap tu ban phim vao la chuoi
        // Sau do ep kieu ve kieu du lieu tuong ung 
        // B1: Coi la Chuoi roi nhap 
//        String gioiTinhStr = scanner.nextLine();
        // B2: Ep kieu String => Boolean 
        boolean gioiTinh = Boolean.valueOf(scanner.nextLine());
        System.out.println("Nhap diaChi: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();
        System.out.println("Nhap ky hoc: ");
        int kyHoc = Integer.valueOf(scanner.nextLine());
//        
//        double a  = Double.valueOf(scanner.nextLine());
//        float b = Float.valueOf(scanner.nextLine());
        // Su dung contructor khong tham so 
        SinhVienPoly sinhVienPoly = new SinhVienPoly();
        // Thay doi thong tin cua ma 
        sinhVienPoly.setMaSV(maSV);
       
        // In ra 
        sinhVienPoly.display();
    }
}
