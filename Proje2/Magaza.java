/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje2;

/**
 *
 * @author FATMA
 */
import java.util.Scanner;
public class Magaza {
    private String ad;
    private String adres;
    private String uyelik_tarihi;
    private int takipci;
    private int begeni;
    private int urun_sayisi;
    private Urun[] urun_listesi;
   
public Magaza (String ad, String adres, String uyelik_tarihi){
    this.ad=ad;
    this.adres=adres;
    this.uyelik_tarihi=uyelik_tarihi;
    this.urun_sayisi=urun_sayisi;
    this.urun_listesi = new Urun[10];

} 
public void Magazabilgileriyazdir(){
 System.out.println("-----Magaza Bilgileri-----");
 System.out.println("Magaza adi: " + this.ad);
 System.out.println("Magaza adresi: " + this.adres);
 System.out.println("Magazanin uyelik tarihi: " + this.uyelik_tarihi);
 System.out.println("magazanin takipci sayisi: " + this.takipci);
 System.out.println("magazanin begeni sayisi: " + this.begeni);
 System.out.println("magazanin urun sayisi: " + this.urun_sayisi);
 System.out.println("\n"+"MAGAZADAKI URUNLER: " );
 System.out.println("--------------------------------");
        for (int i = 0; i < urun_listesi.length; i++) {
            if (urun_listesi[i] != null) {
               System.out.println(urun_listesi[i].getAd()+": " + urun_listesi[i].getFiyat()+"TL"); 
               //urun_listesi[i].Urunbilgileriyazdir();
            }
        }
System.out.println("---------------------------");
int[] min_max_urun = minMaxBegeni();
System.out.println("magazadaki max begenili urun adi: "+ urun_listesi[min_max_urun[0]].getAd());
System.out.println("begeni sayisi: " +urun_listesi[min_max_urun[0]].getBegeni());
System.out.println("magazadaki min begenili urun adi: "+ urun_listesi[min_max_urun[1]].getAd());
System.out.println("begeni sayisi: " + urun_listesi[min_max_urun[1]].getBegeni());
System.out.println("--------------------------------");
System.out.println("\n");
    
}
public void UrunBul(){
    Scanner scan = new Scanner(System.in);
    System.out.print(this.ad + " magazasinda urun ara: ");
         String musteribul = scan.nextLine();
for(int i =0; i<this.urun_listesi.length; i++){
    if(urun_listesi[i]!= null && urun_listesi[i].getAd().contains(musteribul)){
        System.out.println("urun bulundu :)"+"\n");
        this.urun_listesi[i].Urunbilgileriyazdir();
    } 
    else if(urun_listesi[i]!=null){
      System.out.println("urun bulunamadi :("+"\n");
        break;
    }
}    
}
public int[] minMaxBegeni() {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int min_idx = 0;
        int max_idx = 0;

        for (int i = 0; i < urun_listesi.length; i++) {
            if (urun_listesi[i] != null) {
                if (urun_listesi[i].getBegeni() > max) {
                    max_idx = i;
                    max = urun_listesi[i].getBegeni();
                } if (urun_listesi[i].getBegeni() < min) {
                    min_idx = i;
                    min = urun_listesi[i].getBegeni();
                }
            }
        }

        return new int[]{max_idx, min_idx};
    }

public boolean MagazaUrunEkle(Urun urun) {
        boolean eklendiMi = false;

        for (int i = 0; i < urun_listesi.length; i++) {
            if (urun_listesi[i] == null) {
                urun_listesi[i] = urun;
                eklendiMi = true;
                urun_sayisi++;
                break;
            }
        }

        return eklendiMi;
 }
 public boolean MagazaUrunSil(Urun urun) {
    boolean silindiMi= false;
        for (int i = 0; i < urun_listesi.length; i++) {
            if (urun_listesi[i] != null) {
                urun_listesi[i] = null;
                silindiMi = true;
            urun_sayisi--;
                break;
            }
        }
        return silindiMi;
         
    }

    public int getTakipci() {
        return takipci;
    }

    public void Takipci() {
        this.takipci++;
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
}
