/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B8_CRUDListFixCung;

import java.util.List;

/**
 *
 * @author cuongnguyenba
 */
public interface DongVatService {
    
    List<DongVat>getAll(); 
    
    String addDongVat(DongVat dongVat);
    
    void xoaDongVat(int viTri);
    
}
