package Model;

public class FirstClass extends Tiket{
    public Makanan makanan;

    public FirstClass(int jarakTempuh, int bagasi, Makanan makanan){
        super(jarakTempuh, bagasi);
        this.makanan = makanan;
    }
}
