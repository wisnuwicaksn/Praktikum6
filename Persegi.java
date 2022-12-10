public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public float getLuas(){
        return this.sisi * sisi;
    }
}
