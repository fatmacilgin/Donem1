package Proje1;

import java.util.Scanner;

public class Proje1 {

    public static void karakterDizisiCizdir(String input) {
        int loopValue = 0;
        char myChar = ' ';
        boolean rakamMi = false;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '1' -> {
                    loopValue = 1;
                    rakamMi = true;
                }
                case '2' -> {
                    loopValue = 2;
                    rakamMi = true;
                }
                case '3' -> {
                    loopValue = 3;
                    rakamMi = true;
                }
                case '4' -> {
                    loopValue = 4;
                    rakamMi = true;
                }
                case '5' -> {
                    loopValue = 5;
                    rakamMi = true;
                }
                case '6' -> {
                    loopValue = 6;
                    rakamMi = true;
                }
                case '7' -> {
                    rakamMi = true;
                    loopValue = 7;
                }
                case '8' -> {
                    rakamMi = true;
                    loopValue = 8;
                }
                case '9' -> {
                    rakamMi = true;
                    loopValue = 9;
                }
                case '0' -> {
                    rakamMi = true;
                    loopValue = 0;
                }
                case 'b' -> {
                    rakamMi = false;
                    myChar = ' ';
                }// kullanici b girerse bir onceki rakam kadar bos birakir.
                case 's' -> {
                    rakamMi = false;
                    myChar = '*';
                }//kullanici s girerse bir onceki rakam kadar * yazdirir.
                case 'n' -> {
                    rakamMi = false;
                    myChar = '\n';
                }// kullanici n girerse bir onceki rakam kadar bir sonraki satira gecer.
                case 't' -> {
                    myChar = ' ';
                    loopValue = 3;
                    rakamMi = false;
                } // kullanici t girere 3 kere bosluk birakir.
                }
            if (!rakamMi) {
                // Ekrana sadece rakam disinda karakterleri basacagim.
                // bu islem sonrasinda loopValue yu 1 e cekiyorum.
                for (int j = 0; j < loopValue; j++) {
                    System.out.print(myChar);
                }
                loopValue = 1;
            }
        }
    }

    public static String buyukHarfeCevir(String input) {
        int n = 0;
        String output = "";
        for (int i = 0; i < input.length(); i++) { // metnin uzerinde geziyoruz. :)  
            char buyuk_harf = input.charAt(i);
            if (buyuk_harf >= 97 && buyuk_harf <= 122) //ASCII kod kullanarak harfleri buyuk harfe ceviriyoruz.
            {
                n = buyuk_harf - 32;// kucuk harfin ascii kodundan 32 cikartarak onu buyuk harfe cevirdik.
            }
            buyuk_harf = (char) n;
            if (i == 0 || input.charAt(i - 1) == ' ') {// cumlenin ilk harfini veya cumlenin bosluktan sonraki harfteyse   
                output = output + buyuk_harf;
            } // harfi outputa ekliyoruz.
            else {
                output += input.charAt(i);
            }
// eger cumlenin ilk harfini veya cumlenin bosluktan sonraki harfi degilse harfi direk outputa ekliyoruz.
        }
        return output; // metodu dondurdum.
    }

    public static String sifreleCoz(String input, int kaydirma_degeri) {
        String sifreli_metin = "";
        String str = "";
        char alfabe;
        for (int i = 0; i < input.length(); i++) { // Her seferinde bir karakter degistirir.
            alfabe = input.charAt(i);
            if (alfabe >= 'a' && alfabe <= 'z') {
                alfabe = (char) (alfabe - 32 + kaydirma_degeri); // 32 cikartarak harfi buyuk yapiyoruz.
                if (alfabe > 'z') {
                    alfabe = (char) (alfabe + 'a' - 'z');
                }
                sifreli_metin = sifreli_metin + alfabe;
            } else if (alfabe >= 'A' && alfabe <= 'Z') {
                alfabe = (char) (alfabe + kaydirma_degeri);
                if (alfabe > 'Z') {
                    alfabe = (char) (alfabe + 'A' - 'Z');
                }
                sifreli_metin = sifreli_metin + alfabe;
            } else {
                sifreli_metin = sifreli_metin + alfabe;
            }
        }
        System.out.println("Sifrelenmis metin : " + sifreli_metin);// sifreli metini ekrana yazdiriyorum.
        return str; // metodu dondurdum.
    }

    public static void harfCizdir(String karakter, int boyut) {
        if (karakter.equals("Z")) { // eger kullanici Z secerse asagidaki donguye girer.
            for (int i = 0; i < boyut; i++) { // karakterleri birer birer artarak alir.
                System.out.print("*"); // girilen boyut sayisi kadar * girer.
            }
            System.out.print("\n"); // bir sonraki satira gecer.
            for (int i = 0; i < boyut - 2; i++) { // 0'dan baslayarak boyut degerinin iki eksigine kadar devam eder.
                for (int j = 0; j < boyut - i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*"); // Z harfinin çapraz kismini yazdirir.
            }
            for (int i = 0; i < boyut; i++) { // Z harfinin en alt kismini yazdirir.
                System.out.print("*");
            }
            System.out.print("\n"); // alt satira gecer.
        } else { // eger kullanici X secerse asagidaki donguye girer ve x'i boyut degerine gore yazdirir.
            int i = 0;
            int k = boyut;//5
            int j;
            for (i = 1; i <= k; i++) {
                for (j = 1; j <= k; j++) {
                    if (j == i || j == k - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  // bir scanner objesi olusturduk
        String input; // input adinda string olusturdum.
        int boyut; //boyut adinda integer olusturdum.
        while (true) { // programimiz bir sonsuz dongu icinde devam edecektir.
            System.out.println("\nProje 1 Kullanici Menusu"
                    + "\n1. Karakter dizisini cizdir"
                    + "\n2. Buyuk harfe cevir"
                    + "\n3. Sifrele ve sifre coz"
                    + "\n4. Harf  ciz"); // kullanici menusunu yazdiriyoruz.
            System.out.print("Lutfen bir secim yapiniz: ");
            input = myScanner.nextLine(); // kullanicidan secim yapmasini istiyoruz

            if (input.equals("dur")) {
                break;
            } else if (input.equals("Dur")) {
                break;
            } else if (input.equals("DuR")) {
                break;
            }
// kullanici "dur", "Dur" veya "DuR" seklinde input girmedigi muddetce dongu devam eder aksi durumda break ile dongu durur.

            if (input.equals("1")) { // kullanici bir girerse alttaki asamalar gerceklesicek
                System.out.print("Bir dizi karakter giriniz:");
                input = myScanner.nextLine();// kullanicidan karakter girmesini isityoruz.
                karakterDizisiCizdir(input);

            } else if (input.equals("2")) { // kullanici iki girerse secerse asagidaki asamalar gerceklesicek.
                System.out.print("Cumle giriniz:");
                input = myScanner.nextLine();// kullanicidan cumle girmesini istiyoruz.
                System.out.println("Cikti:" + buyukHarfeCevir(input));

            } else if (input.equals("3")) { // kullanici 3 girerse secerse asagidaki asamalar gercelesicek.
                System.out.print("Cumle giriniz:");
                input = myScanner.nextLine();// kullanicidan cumle girmesini istiyoruz.
                System.out.print("Kaydirma degeri giriniz:");// kullanicidan kaydirma degeri istiyoruz.
                int kaydirma = myScanner.nextInt();
                System.out.println(sifreleCoz(input, kaydirma));

            } else if (input.equals("4")) { // kullanici 4 girerse asagidaki asamalar gerceklesicek.
                while (true) {
                    System.out.print("Bir karakter giriniz:");
                    input = myScanner.nextLine(); // kullanicidan harf girmesini istiyoruz.
                    if (input.equals("X") || input.equals("Z")) //kullanici sadece X ve Y karakterlerini girebilir. 
                    {
                        break; //X veya Z girere donguden cikicak.
                    }
                    System.out.println("Girilen karakter gecersiz"); // X ve Y den baska karakter girerse bu yazi cikicak, ve donguye girecek.
                }
                while (true) {
                    System.out.print("Boyut degeri giriniz:");
                    boyut = myScanner.nextInt();// kullanicidan deger girmesini istiyoruz.
                    if (boyut % 2 == 1 && boyut >= 5) // bu degerin tek sayi olmasini ve 5'e esit veya buyuk olmasini istiyoruz.
                    {
                        break; // eger istenilen kosullari saglarsa donguden cikicak.
                    }
                    System.out.println("Gecerli degil"); // kosullari saglamazsa ekrana yazdirir.
                }
                harfCizdir(input, boyut);
            }
        }
    }

}
