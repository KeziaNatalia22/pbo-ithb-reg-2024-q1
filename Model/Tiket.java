package Model;

public abstract class Tiket {
    private int jarakTempuh, bagasi;

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public int getBagasi() {
        return bagasi;
    }

    public void setBagasi(int bagasi) {
        this.bagasi = bagasi;
    }

    public Tiket(int jarakTempuh, int bagasi) {
        this.jarakTempuh = jarakTempuh;
        this.bagasi = bagasi;
    }


}