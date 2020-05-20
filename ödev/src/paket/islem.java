package paket;

public class islem {



    int ilksayi;
    int ikincisayi;

    islem(int x, int y) {
        ilksayi = x;
        ikincisayi = y;

    }
    islem(int q) {
        ilksayi = q;
        

    }
     
    
    void toplam() {
        System.out.println("İki Sayının Toplamı="+((double)ilksayi + (double)ikincisayi));
    }

    void fark() {
        System.out.println("İki Sayının Toplamı="+((double)ilksayi - (double)ikincisayi));
    }

    void bolüm() {
        System.out.println("Bölme İşleminin Sonucu="+((double)ilksayi / (double)ikincisayi));
    }

    void carpım() {
        System.out.println("Çarpma İşleminin Sonucu="+((double)ilksayi / (double)ikincisayi));
    }

    void ebob() {
        int ebbob = 0;
        int sayac = 2;
        
        if (ilksayi < ikincisayi) {
            while (sayac <= ilksayi) {
                if ( ilksayi % sayac == 0 && ikincisayi % sayac == 0) {
                    ebbob = sayac;
                }
                sayac++;
            }
        }
        if (ilksayi > ikincisayi) {
            while (sayac <= ikincisayi) {
                if (ilksayi  % sayac == 0 && ikincisayi % sayac == 0) {
                    ebbob = sayac;
                }
                sayac++;
            }
        }
        System.out.println("iki Sayının Ebobu="+ebbob);
    }

  
 void ekok() {
        int ekkok = 0;
        
        if (ilksayi <= ikincisayi) {
           
           int sayac = 2;
            while (sayac <= ikincisayi) {
                if ( sayac % ilksayi == 0 && sayac % ikincisayi == 0) {
                    ekkok = sayac;
                }
                sayac++;
            }
        }
        if (ilksayi > ikincisayi) {
            
             int sayac = 2;
            while (sayac <= ilksayi) {
                if ( sayac % ilksayi == 0 && sayac % ikincisayi == 0) {
                    ekkok = sayac;
                }
                sayac++;
            }
        }
        System.out.println("iki Sayının Ekoku="+ekkok);
    }
 
 
}
