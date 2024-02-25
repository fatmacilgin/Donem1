/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje2;

/**
 *
 * @author FATMA
 */
public class Kullanici {
    private String ad;
    private String soyad;
    private String uye_yili;
   
public Kullanici (String ad, String soyad, String uye_yili){
    this.ad=ad;
    this.soyad=soyad;
    this.uye_yili=uye_yili;
}
public void KullaniciBilgileri(){
    System.out.println("adi soyadi: " + this.ad+" "+this.soyad);
    System.out.println("uyelik tarihi: " + this.uye_yili);
}

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getUye_yili() {
        return uye_yili;
    }
}
