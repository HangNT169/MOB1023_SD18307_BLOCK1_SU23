/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_XuLyNgoaiLe_DocGhiFile.P2_DocGhiFile;

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
 * @author hangnt
 */
public class Main {

    // Doc ghi file 
    // Tao class Teacher gom cac thuoc tinh
    // ten - String, tuoi - int, diaChi - String, 
    // truongDayHoc - String va cac contructor getter setter
    // Ghi 5 doi tuong vao file va doc ra. 
    public static void main(String[] args) {

    }

    // Ghi file  => Output Stream
    public void ghiFileObjectOutputStream() {
        try {
            // Tao file 1 moi
            File file = new File("test.txt");
            // Kiem tra su ton tai cua file
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);

                }
            }

            // Add cac phan tu vao list 
            List<Teacher> lists = new ArrayList<>();
            // add 5 phan tu vao list 
            lists.add(new Teacher("ten1", 10, "ha noi", "Poly"));
            lists.add(new Teacher("ten2", 11, "ha noi1", "Poly"));
            lists.add(new Teacher("ten3", 12, "ha noi2", "Poly"));
            lists.add(new Teacher("ten4", 13, "ha noi3", "Poly"));
            lists.add(new Teacher("ten5", 14, "ha noi4", "Poly"));

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Ghi tung doi tuong vao file
            for (Teacher t : lists) {
                // viet vao file
                oos.writeObject(t);
            }

            // Close => Close tao sau truoc 
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Doc file => Input Stream
    public void docFileObjectInputStream() {
        try {
            // Tao file 1 moi
            File file = new File("test.txt");
            // Kiem tra su ton tai cua file
            if (!file.exists()) {
                System.out.println("File chua ton tai");
            }

            // doc file
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Tao doi tuong
            Teacher teacherInput = new Teacher();
            List<Teacher> listsInput = new ArrayList<>();

            // add data tu file vao list 
            while (fis.available() > 0) {
                // add vao list 
                teacherInput = (Teacher) ois.readObject();
                listsInput.add(teacherInput);
            }

            // in list 
            for (Teacher teacher : listsInput) {
                System.out.println(teacher.toString());
            }
            // Close => Close tao sau truoc 
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
