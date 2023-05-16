/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B4_BaiMauCRUD;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public interface DongHoService {

    void nhapDongHo(ArrayList<DongHo> lists);

    void xuatDanhSachDongHo(ArrayList<DongHo> lists);

    void xoaDongHoTheoMa(ArrayList<DongHo> lists, String ma);

    void sapXepTangDan(ArrayList<DongHo> lists);

    void sapXepGiamDan(ArrayList<DongHo> lists);

}
