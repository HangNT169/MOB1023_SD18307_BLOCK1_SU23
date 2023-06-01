/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_XuLyNgoaiLe_DocGhiFile.P1_XuLyNgoaiLe;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // Mang => a
        // 3,4,-1,6,9
        // a[0] = 3
        // a[2] = -1
        // a[10]  => Chet chuong trinh 
        // => Xay ra ngoai le (Expection)
//        int a[] = {3, 4, -1, 6, 9};
//        // try...catch
//        try {
//            // Chua cac dong nghi ngo xay ra loi 
//            System.out.println(a[12]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Cach de xu ly khi xay ra loi
//            System.out.println("Mang chi co 5 phan tu nen...");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap tuoi");
//        try {
//            int tuoi = scanner.nextInt();
//            System.out.println("Tuoi = " + tuoi);
//        } catch (Exception e) {
//            System.out.println("Tuoi la so ");
//        }
        // C1: Exception => Cha cua tat ca cac the loai loi 
        // C2: Ten cu the cua tung loai loi  => Nho
        try {
            int tuoi = scanner.nextInt();
            System.out.println("Tuoi = " + tuoi);
        } catch (Exception e) {
            System.out.println("Tuoi la so ");
        }finally{
            // Du co loi hay k => Van chay vao finally
            System.out.println("Done roiiiiii");
        }
        // Voi Java 7 > => try..with resource 
        // Dong cong ket noi => Java tu dong dong cho cac ban
//        try(){
//            
//        }catch(){
//            
//        }
    }
}
