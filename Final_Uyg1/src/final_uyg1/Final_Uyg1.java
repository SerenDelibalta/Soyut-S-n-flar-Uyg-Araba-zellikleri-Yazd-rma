

package final_uyg1;

public class Final_Uyg1 {
    public static void main(String[] args) {
       Araba ford =new Ford(); //"ford" nesnesi olusturma
        //Set Metotları ile değerlerimizi giriyoruz.
        ford.setAgirlik(1000);
        ford.setModel("Fiesta");
        ford.setRenk("Gri");
        Araba mercedes=new Mercedes();
        mercedes.setAgirlik(2000);
        mercedes.setModel("E200");
        mercedes.setRenk("Siyah");
 
        Araba arabalar[]=new Araba[]{mercedes,ford}; //dizi oluşturma
        KullaniciEkrani ekran =new KullaniciEkrani(); //"ekran" nesnesi oluşturma
        ekran.goster(arabalar);
    }
    
}
