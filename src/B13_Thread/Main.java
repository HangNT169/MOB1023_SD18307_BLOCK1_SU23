/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Main implements Runnable {

    @Override
    public void run() {
        // Hien thi dong ho
        while (true) {
            try {
                // Lay ngay gio hien tai cua he thong
                Calendar ca = Calendar.getInstance();
                // hh:mm:ss
                int h = ca.get(Calendar.HOUR);
                int m = ca.get(Calendar.MINUTE);
                int s = ca.get(Calendar.SECOND);
                System.out.println(h + " : " + m + " : " + s);
                Thread.sleep(1000); // 1s = 1000ms => Ngat
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    /**
     * Mulithread => Da luong 1 luc => Nhieu tieu chuong trinh cung chay Co 2
     * cach de tao ra 1 thread c1: extends Thread C2: implement Runnable
     */
    public static void main(String[] args) {
        new Main().run();
    }
}
