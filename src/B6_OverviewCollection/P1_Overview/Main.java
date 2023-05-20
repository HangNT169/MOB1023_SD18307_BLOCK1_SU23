/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_OverviewCollection.P1_Overview;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class Main {
    public static void main(String[] args) {
        // ArrayList la 1 phan cua lop Collections
        // Collection : List, Set,Map ..
        //C1:  Class = new Class 
        ArrayList<Integer> lists = new ArrayList<>();
        // C2: interface = new Class 
        // List<Integer> lists1 = new ArrayList<>();
        // import List => java.util 
        lists.add(1);
        lists.add(2);
        lists.add(-5);
        lists.add(2);
        // in ra 
        System.out.println(lists);
    }
}
