package Model;

public class FirstClass extends Tiket{
    public Makanan makanan;
    public boolean asuransi;

    public FirstClass(int jarakTempuh, int bagasi, Makanan makanan, boolean asuransi){
        super(jarakTempuh, bagasi);
        this.makanan = makanan;
        this.asuransi = asuransi;
    }

}
