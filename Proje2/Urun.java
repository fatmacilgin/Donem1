/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje2;

/**
 *
 * @author FATMA
 */
public class Urun {
    private String ad;
    private String renk;
    private String beden;
    private double fiyat;
    private int begeni;
    private Uretici uretici;

public Urun (String ad,String renk,String beden, double fiyat, Uretici uretici){
    this.ad=ad;
    this.renk=renk;
    this.beden=beden;
    this.fiyat=fiyat;
    this.begeni=begeni;
    this.uretici=uretici;
}    
   public void Urunbilgileriyazdir(){
    System.out.println("urun adi: "+ this.ad);
    System.out.println("urun rengi: " + this.renk);
    System.out.println("urun fiyati: " + this.fiyat);
    System.out.println("urun bedeni: " + this.beden);
    System.out.println("urun begeni sayisi: " + this.begeni);
    System.out.println("----Urun Uretici Bilgileri----");
    this.uretici.UreticiBilgileriYazdir();
    }

   public int getBegeni() {
        return begeni;
    }

    public void Begeni() {
        this.begeni++;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }



}
