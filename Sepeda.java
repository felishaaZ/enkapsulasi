/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sepeda;

/**
 *
 * @author msi 14
 */
public class Sepeda {
    public String kode;
    protected String merek;
    String jenis;
    float kecepatan;
    int gigi;
    public static int jumTotalSepeda; //atribut class
    
    public Sepeda(){
        System.out.println("Objek terbentuk menggunakan konstruktor default");
        kode = merek = jenis = "KOSONG";
        kecepatan = gigi = 0;
    }
    public Sepeda(int g){
        System.out.println("Objek terbentuk menggunakan konstruktor berparameter 1");
        kode = merek = jenis = "KOSONG";
        kecepatan = 0;
        gigi = g;
    }
    public Sepeda(int g, float v){
        System.out.println("Objek terbentuk menggunakan konstruktor berparameter 2");
        kode = merek = jenis = "KOSONG";
        kecepatan = v;
        gigi = g;
    }
    
    public void start(){
        gigi = 1; kecepatan = 0;
    }
    private void kurangGigi(){
        gigi--;
    }
    private void tambahGigi(){
        gigi++;
    }
    public void tambahKecepatan(float v){
        kecepatan += v;
        if(v>10)
            tambahGigi();
    }
    public void kurangiKecepatan(float v){
        kecepatan += v;
        if(v>5.5)
            kurangGigi();
    }
    public void stop(){
        kecepatan = 0; gigi =0;
    }
    public void tampilData(){
        System.out.println("KODE = "+kode);
        System.out.println("MEREK = "+merek);
        System.out.println("JENIS = "+jenis);
        System.out.println("KECEPATAN = "+kecepatan);
        System.out.println("GIGI = "+gigi);
    }
    public static void tambahJumTotalSepeda(){ //method class
        jumTotalSepeda ++;
    }
    public static void main(String [] args){
        Sepeda s1 = new Sepeda(); //Atribut dan method instansiasi (langsung melalui nama objek)
        Sepeda.tambahJumTotalSepeda(); //Atribut dan method class (static) (langsung menggunakan nama class)
        s1.kode="5001"; s1.merek="Polygon"; s1.jenis="XC"; s1.kecepatan=0;
        s1.gigi=0; 
        s1.start();
        s1.tambahKecepatan(15); s1.kurangiKecepatan(0);
        s1.tampilData();
        Sepeda s2 = new Sepeda(2);
        Sepeda.tambahJumTotalSepeda();
        s2.tampilData();
        Sepeda s3 = new Sepeda(4, 25);
        Sepeda.tambahJumTotalSepeda();
        s3.tampilData();
        System.out.println("Jumlah total objek sepeda yang dibuat = "+Sepeda.jumTotalSepeda);
    }
}
