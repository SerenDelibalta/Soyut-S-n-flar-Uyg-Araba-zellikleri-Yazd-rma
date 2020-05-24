package final_uyg1;
public class Ford extends Araba{
    private int devirSayisi; //değişken tanımlıyorum
 
     //İnteger bir değer döndüreceğiz
    public int getDevirSayisi() {
        return devirSayisi;
    }
    // set metotdu ile değer giriyoruz
    public void setDevirSayisi(int devirSayisi) {
        this.devirSayisi = devirSayisi;
    }
      //İnteger bir değer döndüreceğiz
    public int saateYaktigiBenzinLitresi() {
        return getAgirlik()*1; //işlem yaptırıp döndürüyoruz
    }
}
