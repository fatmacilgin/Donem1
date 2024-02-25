/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje2;

/**
 *
 * @author FATMA
 */
public class Musteri extends Kullanici {
     private Urun[] urun_listesi;
     private int urun_sayisi;
     double sum;

     public Musteri(String ad, String soyad, String uye_yili) {
     super(ad, soyad, uye_yili);
        this.urun_sayisi=urun_sayisi;
        this.urun_listesi = new Urun[100];
}
public void Musteribilgileriyazdir(){
System.out.println("-----Musteri Bilgileri-----");
super.KullaniciBilgileri();
   System.out.println("sepetindeki urun sayisi: " + this.urun_sayisi);
  if(this.toplam()<=1500){
        System.out.println("STANDART MUSTERISINIZ!");
        System.out.println("kargo parasi: 20TL");
        System.out.println("odenecek tutar: " + (this.sum+20));
    }else{
        System.out.println("PREMIUM MUSTERISINIZ!");
        System.out.println("kargo ucretsiz!");         
        System.out.println("sepette %20 indirim!");
 double indirim = toplam()/10;
 double yeni_fiyat= (this.toplam()/3)-indirim;
 System.out.println("sepet tutari: "+(yeni_fiyat+indirim));
 System.out.println("indirim tutari: " + indirim);
 System.out.println("odenecek tutar: " + yeni_fiyat);
 }
  System.out.println("\n"+"SEPETINDEKI URUNLER: ");
System.out.println("------------------------------");
    for (int i = 0; i < urun_listesi.length; i++) {
         if (urun_listesi[i] != null) {
       urun_listesi[i].Urunbilgileriyazdir();
 
         }
    }

    
int[] min_max_urun = minMaxTutar();
System.out.println("sepetindeki max fiyatli urun adi: "+ urun_listesi[min_max_urun[0]].getAd());
    System.out.println("fiyati: " + urun_listesi[min_max_urun[0]].getFiyat());
System.out.println("sepetindeki min fiyatli urun adi: "+ urun_listesi[min_max_urun[1]].getAd());
    System.out.println("fiyati: " + urun_listesi[min_max_urun[1]].getFiyat());
System.out.println("---------------------------");
System.out.println("\n");
}
public double toplam(){
 
       for (int i = 0; i < urun_listesi.length; i++) {
                 if (urun_listesi[i] != null)  
         this.sum += urun_listesi[i].getFiyat();
      }  
       
       
    return sum;
  }
public int[] minMaxTutar() {
      int min = Integer.MAX_VALUE;
        int max = 0;
        int max_idx = 0;
        int min_idx=0;

        for (int i = 0; i < urun_listesi.length; i++) {
            if (urun_listesi[i] != null) {
                if (urun_listesi[i].getFiyat() > max) {
                    max_idx = i;
                    max = (int) urun_listesi[i].getFiyat();
                }if(urun_listesi[i].getFiyat()<min){
                    min_idx=i;
                    min=(int) urun_listesi[i].getFiyat();
                }
            }
        }

        return new int[]{max_idx,min_idx};
  }
public boolean SepetUrunEkle(Urun urun) {

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
public boolean SepetUrunSil(Urun urun) {
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


    public void UrunBegenme(Urun urun){
        urun.Begeni();
    }
    public void MagazaTakip(Magaza magaza){
        magaza.Takipci();
    }
    public void MagazaBegeni(Magaza magaza){
        magaza.Begeni();
    }
    public void UreticiBegenme(Uretici uretici){
        uretici.Begeni();
    }
    public void UreticiTakip(Uretici uretici){
        uretici.Takipci();
    }
}

