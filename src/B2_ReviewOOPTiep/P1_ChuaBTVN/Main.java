/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOPTiep.P1_ChuaBTVN;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // B1: Nhap thong tin cua Nguoi : ten, tuoi, dia chi
        System.out.print("Nhap vao ten: ");
        // next, nextLine : Chuoi. Nhung next => Khi den dau cach => Khong nhan nua
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = scanner.nextInt();
        // Co 2 cach :
        // C1: Them scanner.nextLine() sau cho xay ra loi
        scanner.nextLine();
        System.out.print("Nhap dia chi:");
        String diaChi = scanner.nextLine();
        
        // B2: Tao ra 1 doi tuong Nguoi 
        Nguoi nguoi = new Nguoi(ten, diaChi, tuoi);
        
        // B3: In ra 
        nguoi.display();
    }
    
}
