/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_OverviewCollection.P2_LoadDataLenTable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class NhanVienServiceImpl implements NhanVienService {

    private List<NhanVien> listNhanVien = new ArrayList<>();

    @Override
    public List<NhanVien> getAll() {
        listNhanVien.add(new NhanVien("HangNT169", "Loai 1", false, "An"));
        listNhanVien.add(new NhanVien("PhongTT35", "Loai 2", true, "An"));
        listNhanVien.add(new NhanVien("NguyenVV4", "Loai 3", true, "An"));
        listNhanVien.add(new NhanVien("KhanhPG", "Loai 4", true, "An"));
        listNhanVien.add(new NhanVien("DungNA29", "Loai 1", false, "An"));
        return listNhanVien;
    }

}
