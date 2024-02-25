/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje2;

/**
 *
 * @author FATMA
 */
public class Test {
    
    public static void main(String[] args){
       
        Musteri musteri1 = new Musteri("Omer","kara","12.11.2021");
        Musteri musteri2 = new Musteri("sevgi","cilgin","10.04.2020");
        Musteri musteri3 = new Musteri("ebrar","ozdemir","21.12.2024");
        Sepet sepet1 = new Sepet(musteri1);
        Sepet sepet2 = new Sepet(musteri2);
        Sepet sepet3 = new Sepet(musteri3);
        
        
        Uretici uretici1 = new Uretici("tuana","yilmaz","04.06.2020",20);
        Uretici uretici2 = new Uretici("tuba","yildiz","04.06.2003",30);
        
        Urun mont = new Urun("mont","beyaz","M",800,uretici1);
        Urun ceket = new Urun("ceket","siyah","L",500,uretici2);
        Urun sweat = new Urun("sweatshirt","gri","S",300,uretici2);
       
        Magaza zara = new Magaza("ZARA","istanbul","06.11.2003");
        Magaza bershka = new Magaza("BERSHKA","istanbul","07.10.2021");    
        
        musteri1.SepetUrunEkle(mont);
        musteri1.SepetUrunEkle(ceket);
        musteri1.SepetUrunEkle(sweat);
       
        
        
        
        musteri2.SepetUrunEkle(mont);
        musteri2.SepetUrunEkle(ceket);
        
        musteri3.SepetUrunEkle(sweat);
        musteri3.SepetUrunEkle(sweat);
        musteri3.SepetUrunSil(sweat);
      
        bershka.MagazaUrunEkle(mont);
        bershka.MagazaUrunEkle(ceket);
        bershka.MagazaUrunEkle(sweat);
        bershka.MagazaUrunSil(mont);
        
        zara.MagazaUrunEkle(ceket);
        zara.MagazaUrunEkle(mont);
        zara.MagazaUrunEkle(sweat);
       
      
       musteri1.MagazaBegeni(zara);
       musteri2.MagazaBegeni(bershka);
       musteri1.MagazaTakip(zara);
       musteri2.MagazaTakip(bershka);
       musteri2.MagazaTakip(zara); 
       
       musteri1.UrunBegenme(ceket);
       musteri2.UrunBegenme(ceket);
       musteri1.UrunBegenme(mont);
       musteri2.UrunBegenme(mont);
       musteri3.UrunBegenme(ceket);
       musteri3.UrunBegenme(sweat);
       
       musteri1.UreticiBegenme(uretici2);
       musteri2.UreticiBegenme(uretici2);
       musteri3.UreticiBegenme(uretici1);
       musteri1.UreticiTakip(uretici2);
       musteri2.UreticiTakip(uretici1);
   
       
    musteri1.Musteribilgileriyazdir(); 
    System.out.println("**********************************");
    
    zara.Magazabilgileriyazdir();
    System.out.println("**********************************");
    
    sepet2.Sepetbilgileriyazdir();   
    System.out.println("**********************************");
    
    bershka.Magazabilgileriyazdir();
    System.out.println("**********************************");
    
   
  zara.UrunBul();



    }

}

