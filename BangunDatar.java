public abstract class BangunDatar {
    String warna, gambar;

    String getWarna(){
        return warna;
    }

    void setWarna(String warna){
        this.warna = warna;
    }

    String setGambar(){
        return gambar;
    }

    abstract float getLuas();
}