/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sepeda;

/**
 *
 * @author msi 14
 */
public class SepedaDemo {
    public static void main(String [] args){
        Sepeda s1 = new Sepeda();
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0;
        s1.start();
        s1.tambahKecepatan(15); s1.kurangiKecepatan(3);
        s1.tampilData();
    }
}
