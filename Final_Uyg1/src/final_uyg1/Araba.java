package final_uyg1;

    abstract class Araba{ //Soyut sınıf 
    private int agirlik; //"agirlik" adında integer değişken tanımlama
    private String renk; //"renk" adında string değişken tanımlama
    private String model; //"model" adında string değişken tanımlama
 
     //İnteger bir değer döndüreceğiz
    public int getAgirlik() {
        return agirlik;
    }
     // set metotdu ile değer giriyoruz
    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
    //String bir değer döndüreceğiz
    public String getRenk() {
        return renk;
    }
    // set metotdu ile değer giriyoruz
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
 
    public abstract int saateYaktigiBenzinLitresi(); //Soyut metot
}

