
package paket;

import java.util.Scanner;

public class hesapla {
    public static void main(String[] args) {
        
        
        System.out.println("Matematiksel İşlemler Dünyasına HOŞGELDİNİZ.." );
        Scanner klavye=new Scanner(System.in);
        System.out.println("Hangi işlemi Yapmak İstiyorsunuz?");
        System.out.println("1-Toplama(x+y), 2-Çıkarma(x-y), 3-Çarpma(x*y), 4-Bölme(x/y), "
                + "5-Faktoriyel Hesabı(x!), 6-Kuvvet Alma(x^y, 7-Karekök Alma(√), 8-Mod Bulma(%),9-Hangi Sayının Büyük Olduğunu Bulma "
                + "10-İki Sayının Ebobunu Bulma, 11-İki Sayının Ekokunu Bulma ");
        
        
        int secim=klavye.nextInt();
      
         if(secim<0 || secim>11 )
         {
             System.out.println("Lütfen Sadece Belirli Sayıları Giriniz");
             System.out.println("");
             System.out.println("Hangi işlemi Yapmak İstiyorsunuz?");
             System.out.println("1-Toplama(x+y), 2-Çıkarma(x-y), 3-Çarpma(x*y), 4-Bölme(x/y), "
                + "5-Faktoriyel Hesabı(x!), 6-Kuvvet Alma(x^y, 7-Karekök Alma(√), 8-Mod Bulma(%),9-Hangi Sayının Büyük Olduğunu Bulma "
                + "10-İki Sayının Ebobunu Bulma, 11-İki Sayının Ekokunu Bulma ");
               secim=klavye.nextInt();
         }
             if(secim==6)
             {
                  System.out.println("Tabanı Gir");
              int sayi1=klavye.nextInt();
              System.out.println("Üssü Gir");
              int sayi2=klavye.nextInt();
              islem2 deneme=new islem2(sayi1,sayi2);
              switch (secim){
      
                case 6: 
                deneme.üsalma();
                break;   
          
               default:
               break;
        
             }
             }
             if(secim==8)
             {
                  System.out.println("Bir Sayı Gir Gir");
              int sayi1=klavye.nextInt();
              System.out.println("Hangi Sayıya Göre Mod Alınsın?");
              int sayi2=klavye.nextInt();
              islem2 deneme=new islem2(sayi1,sayi2);
              switch (secim){
      
                case 8: 
                deneme.mod();
                break;   
          
               default:
               break;
        
             }
             }
             if(secim==1 || secim==2 || secim==3 || secim==4 || secim==9 || secim==10 || secim==11)
             {
              System.out.println("İlk sayıyı Gir");
              int sayi1=klavye.nextInt();
              System.out.println("İkinci sayıyı Gir");
              int sayi2=klavye.nextInt();
              islem2 deneme=new islem2(sayi1,sayi2);
              switch (secim){
        case 1: 
                deneme.toplam();
                break;
         case 2: 
                deneme.fark();
                break;
        case 3: 
                deneme.carpım();
                break;
        case 4: 
                deneme.bolüm();
                break;     
        
         case 9: 
                deneme.durum();
                break;     
         case 10: 
                deneme.ebob();
                break;   
        case 11: 
                deneme.ekok();
                break;             
        default:
        break;
                           }
             }
        if(secim==5 || secim==7)
        {
            System.out.println("Sayıyı Gir");
            int sayii=klavye.nextInt();
            if(sayii<0)
            {
                System.out.println("Lütfen Pozitif Bir Sayı Giriniz");
                sayii=klavye.nextInt();
            }
            islem2 dnme=new islem2(sayii);
            
            switch (secim){
                
                case 5: dnme.faktoriyel();
                        break;
                case 7: dnme.karekök();
                        break;        
                default:
                break;
            }
           
            
        }
       
         
         
        
        
        
        
        
        
      
    
    
}

    private static void Switch(int secim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}