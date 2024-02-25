/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje2;

/**
 *
 * @author FATMA
 */
public class Uretici extends Kullanici {
    private int begeni;
    private int takipci;
    private int yas;

public Uretici(String ad, String soyad,String uye_yili,int yas) {
    super(ad, soyad, uye_yili);
        this.begeni=begeni;
        this.takipci=takipci;
        this.yas=yas;
}

 public void UreticiBilgileriYazdir() {
        System.out.println("uretici isim soyisim: " + getAd() + " " + getSoyad());
        System.out.println("uretici begeni sayisi: " + this.begeni);
        System.out.println("uretici takipcisi: " + this.takipci);
        System.out.println("uretici yasi: " + this.yas);
        System.out.println("---------------------------------");
        System.out.println("\n");
    }
 

    public int getBegeni() {
        return begeni;
    }

    public void Begeni() {
        this.begeni++;
    }

    public int getTakipci() {
        return takipci;
    }

    public void Takipci() {
        this.takipci++;
    }



}
