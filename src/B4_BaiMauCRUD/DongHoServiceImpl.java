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
public class DongHoServiceImpl implements DongHoService {

    @Override
    public void nhapDongHo(ArrayList<DongHo> lists) {
        // ma - String, the loai - String, mau sac - String
        // kich thuoc - int , chat lieu - String, gia - int
        // B1: Nhap tu ban phim 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap ma:");
        String ma = scanner.nextLine();
        System.out.print("Moi nhap the loai:");
        String theLoai = scanner.nextLine();
        System.out.print("Moi nhap mau sac:");
        String mauSac = scanner.nextLine();
        System.out.print("Moi nhap kich thuoc: ");
        int kichThuoc = Integer.valueOf(scanner.nextLine());
        System.out.print("Moi nhap chat lieu:");
        String chatLieu = scanner.nextLine();
        System.out.print("Moi nhap gia: ");
        int gia = Integer.valueOf(scanner.nextLine());
        // B2: Tao 1 Dong Ho 
        // C1: Contructor khong tham so 
//        DongHo dongHo = new DongHo();
//        dongHo.setMaDongHo(ma);
        // C2: Contructor co tham so 
        DongHo dongHo = new DongHo(ma, theLoai, mauSac, kichThuoc, chatLieu, gia);
        //B3: Add Dong Ho vao arraylist
        lists.add(dongHo);
    }

    @Override
    public void xuatDanhSachDongHo(ArrayList<DongHo> lists) {
        // C1: for thuong (for - i)
//        for (int i = 0; i < lists.size(); i++) {
//            // in 
//            DongHo dongHo = lists.get(i); // Muon lay gia tri cua vi tri => get 
//            // Mang dong . Vi tri i => Gia tri cua vi tri i => lists.get(vitri)
//            dongHo.inThongTin();
//        }
        // C2: for each 
//        for (DongHo d : lists) {
//            d.inThongTin();
//        }
        // C3: for each + lamda (->)
        lists.forEach(s -> s.inThongTin());
    }

    @Override
    public void xoaDongHoTheoMa(ArrayList<DongHo> lists, String ma) {
        for (DongHo dongHo : lists) {
            if (dongHo.getMaDongHo().equalsIgnoreCase(ma)) {
                // Tim thay dong ho => Xoa 
                lists.remove(dongHo);
            }
        }
    }

    @Override
    public void sapXepTangDan(ArrayList<DongHo> a) {
       a.sort((o1, o2) -> {
           return o1.getKichThuoc()-o2.getKichThuoc(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
       });
    }

    @Override
    public void sapXepGiamDan(ArrayList<DongHo> lists) {
        lists.sort((o1, o2) -> {
            return o2.getTheLoai().compareTo(o1.getTheLoai()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

}
