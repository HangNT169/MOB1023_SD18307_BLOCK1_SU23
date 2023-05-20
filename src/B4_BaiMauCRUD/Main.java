/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_BaiMauCRUD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DongHo> listNew = new ArrayList<>();
        DongHoServiceImpl dongHoServiceImpl = new DongHoServiceImpl();
        // Class = new Class 
        // interface = new Class 
        DongHoService dhs = new DongHoServiceImpl();
        System.out.println("chuc nang 1");
        System.out.println("chuc nang 2");
        System.out.println("chuc nang 3");
        System.out.println("chuc nang 4");
        System.out.println("chuc nang 5");
        int chucNang = 0;
        do {
            System.out.println("Moi nhap chuc nang");
            chucNang = Integer.valueOf(scanner.nextLine());
            // tao menu
            switch (chucNang) {
                case 1: {
                    // Muon goi 1 ham tu 1 class bat ki 
                    // B1: XD ten class chua ham muon goi 
                    // B2: Goi theo cu phap 
                    new DongHoServiceImpl().nhapDongHo(listNew);
                    break;
                }
                case 2: {
                    new DongHoServiceImpl().xuatDanhSachDongHo(listNew);
                    break;
                }
                case 3: {
                    System.out.println("Moi nhap ma:");
                    String ma = scanner.nextLine();
                    new DongHoServiceImpl().xoaDongHoTheoMa(listNew, ma);
                    break;
                }
                case 4: {
                    new DongHoServiceImpl().sapXepGiamDan(listNew);
                    break;
                }
                case 5: {
                    new DongHoServiceImpl().sapXepTangDan(listNew);
                    break;
                }
                case 6: {
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai");
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
