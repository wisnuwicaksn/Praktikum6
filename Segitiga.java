public class Segitiga extends BangunDatar {
    int alas, tinggi;

    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float getLuas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }
}
