/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_CRUD_FULL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    @Override
    public String ghiFile(String path) {
        // Tao file 1 moi
        File file = new File(path);
        try {
            // Kiem tra su ton tai cua file
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                // Ghi tung doi tuong vao file
                for (DongVat t : lists) {
                    // viet vao file
                    oos.writeObject(t);
                }
            } catch (Exception e) {
                return "Ghi file that bai";
            }
        } catch (IOException e) {
            return "Ghi file that bai";
        }
        return "Ghi file thanh cong";
    }

    @Override
    public String docFile(String path) {
        // Tao file 1 moi
        File file = new File(path);
        // Kiem tra su ton tai cua file
        if (!file.exists()) {
            return "File khong ton tai!!!!!";
        }
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            // add data tu file vao list 
            // Check xem con dong de doc hay khong
            while (fis.available() > 0) {
                lists.add((DongVat) ois.readObject());
            }
        } catch (Exception e) {
            return "Doc file that bai";
        }
        return "Doc file thanh cong";
    }

}
