
package paket;

public class islem2 extends islem{
    
    islem2(int x, int y) {
        super(x, y);
        
        
        
    }
    islem2(int q) {
        super(q);
    }
   
    void faktoriyel()
    {
        int faktoriyel=1;
       int sayac=ilksayi;
       while(sayac>0)
       {
           faktoriyel=faktoriyel*sayac;
           sayac--;
           
       }
        System.out.println(ilksayi+ " Sayısının Faktoriyeli="+faktoriyel);
    }
    void üsalma()
    {
        int sonuc=1;
        int sayi1=ilksayi;
        int sayi2=ikincisayi;
        
        for(int i=1;i<=sayi2;i++)
        {
            sonuc=sonuc*sayi1;
        }
        System.out.println(ilksayi+"^"+ ikincisayi+" İşleminin Sonucu= "+ sonuc);
        
    }
    void karekök()
    {
        System.out.println(ilksayi+" Sayısının Karekekökü= "+Math.sqrt(ilksayi));
        
        
        
    }
    void mod()
    {
       
        int islem1=ilksayi/ikincisayi;
        int islem2=islem1*ikincisayi;
        int islem3=ilksayi-islem2;
        System.out.println(ilksayi+" Sayısının "+ikincisayi+" Sayısına Göre Modu="+islem3);
    }
    void durum()
    {
        if(ilksayi<ikincisayi)
        {
            System.out.println(ikincisayi+" Sayısı "+ilksayi+" Sayısından Büyüktür");
        }
        if(ilksayi>ikincisayi)
        {
            System.out.println(ilksayi+" Sayısı "+ikincisayi+" Sayısından Büyüktür");
        }
        if(ilksayi==ikincisayi)
        {
            System.out.println("İki Sayı Birbirine Eşittir");
        }
    }
}
