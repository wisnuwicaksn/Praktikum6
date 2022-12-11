public class Segitiga extends BangunDatar {
    int alas, tinggi;

    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    

    public void Gambar(){
        System.out.println("Gambar Segitiga");
    }

    public float getLuas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }
}
