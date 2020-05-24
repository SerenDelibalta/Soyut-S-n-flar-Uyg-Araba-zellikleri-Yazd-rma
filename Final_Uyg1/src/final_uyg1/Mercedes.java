package final_uyg1;
public class Mercedes extends Araba{
    private int cantKalinligi; // "cantKalinligi" değişkeni olurturdum
    //İnteger bir değer döndüreceğiz
    public int getCantKalinligi() {
        return cantKalinligi;
    }
    // set metotdu ile değer giriyoruz
    public void setCantKalinligi(int cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }
   //İnteger bir değer döndüreceğiz
    public int saateYaktigiBenzinLitresi() {
        return getAgirlik()*2;
    }
}
