package Model;

public class Bisnis extends Tiket {
    public Makanan makanan;

    public Bisnis(int jarakTempuh, int bagasi, Makanan makanan){
        super(jarakTempuh, bagasi);
        this.makanan = makanan;
    }

}
