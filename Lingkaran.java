public class Lingkaran extends BangunDatar{
    private float pi = (float) 3.14;
    int r;

    public Lingkaran(int r){
        this.r = r;
    } 

    public float getLuas(){
        return (float) (this.pi * r * r);
    }
}