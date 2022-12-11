public class Utama {
    public static void main(String[] args) {
        
        BangunDatar persegi = new Persegi(4);
        BangunDatar segitiga = new Segitiga(2, 3);
        BangunDatar lingkaran = new Lingkaran(5);
        
        persegi.setWarna("Merah");
        persegi.Gambar();
        System.out.println("Luas persegi " + persegi.getWarna() + " : " + persegi.getLuas());
        segitiga.setWarna("Hitam");
        segitiga.Gambar();
        System.out.println("Luas Segitiga " + segitiga.getWarna() + " : " + segitiga.getLuas());
        lingkaran.setWarna("Hijau");
        lingkaran.Gambar();
        System.out.println("Luas lingkaran " + lingkaran.getWarna() + " : " + lingkaran.getLuas());
    }
}
