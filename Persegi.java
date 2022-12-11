public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public float getLuas(){
        return this.sisi * sisi;
    }

    public void Gambar(){
        System.out.println("Gambar Persegi");
    }
}
