
package final_uyg1;

public class KullaniciEkrani{
    public void goster(Araba[] arabalar){
        for (int i = 0; i < arabalar.length; i++) {
            Araba araba = arabalar[i];
            //Ekrana yazdırma
            System.out.println("Agirlik : "+araba.getAgirlik());
            System.out.println("Model : "+araba.getModel());
            System.out.println("Renk : "+araba.getRenk());
            System.out.println("Yaktigi Lt. Benzin : "+araba.saateYaktigiBenzinLitresi());
        }
    }
}