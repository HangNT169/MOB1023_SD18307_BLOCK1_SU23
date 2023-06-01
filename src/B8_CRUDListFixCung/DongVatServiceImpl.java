/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_CRUDListFixCung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuongnguyenba
 */
public class DongVatServiceImpl implements DongVatService {

    private List<DongVat> lists = new ArrayList<>();

    @Override
    public List<DongVat> getAll() {
        lists.add(new DongVat("ph1", "Meo", 12, true));
        lists.add(new DongVat("ph2", "Meo", 15, true));
        lists.add(new DongVat("ph3", "Meo", 16, false));
        lists.add(new DongVat("ph4", "Me333o", 16, false));
        return lists;
    }

    @Override
    public String addDongVat(DongVat dongVat) {
        if (dongVat != null) {
            lists.add(dongVat);
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    @Override
    public void xoaDongVat(int viTri) {
        lists.remove(viTri);
    }

}
