package view;
import controller.*;
import Model.Bisnis;
import Model.Ekonomi;
import Model.FirstClass;
import Model.Makanan;
import Model.Tiket;

import java.util.*;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList <Tiket> tiket = new ArrayList<Tiket>();
    public static void main(String[] args) {

        System.out.println("Masukin jenis tiket :");
        String type = scan.nextLine();

        System.out.println("Masukkan jarak : ");
        int jarak = scan.nextInt();

        System.out.println("Masukkin berat bagasi :");
        int berat = scan.nextInt();

        if (type.equalsIgnoreCase("ekonomi")) {
            Tiket ekonomi = new Ekonomi(jarak, berat);
            tiket.add(ekonomi);
        } else if(type.equalsIgnoreCase("bisnis")){
            System.out.println("Mau pesen makanan?");
            boolean pesenMakanan = scan.nextBoolean();

            System.out.println("Pilih makanan (Nasgor or Emih) dan total: ");
            String makan = scan.nextLine();
            int total = scan.nextInt();

            if (pesenMakanan) {
                Tiket bisnis = new Bisnis(jarak, berat, new Makanan(makan, total));
                tiket.add(bisnis);
            } else {
                Tiket bisnis = new Bisnis(jarak, berat, new Makanan("", 0));
                tiket.add(bisnis);
            }

        } else if(type.equalsIgnoreCase("firstclass")){
            System.out.println("Mau pesen makanan?");
            boolean pesenMakanan = scan.nextBoolean();

            System.out.println("Pilih makanan (Nasgor or Emih) dan total: ");
            String makan = scan.nextLine();
            int total = scan.nextInt();

            System.out.println("Mau asuransi? bayar.. ");
            boolean mau = scan.nextBoolean();

            if (pesenMakanan) {
                Tiket firstClass = new FirstClass(jarak, berat, new Makanan(makan, total), mau);
                tiket.add(firstClass);
            } else {
                Tiket firstClass = new FirstClass(jarak, berat, new Makanan("", 0), false);
                tiket.add(firstClass);
            }
        } else{
            System.out.println("Gada pilihan!");
        }
        
        int menu = 0;
        while (menu <= 2 ) {
            System.out.println("Pilih menu \n1.Biaya Tiket km \n2.Biaya Total Paket sekaligus : ");
            menu = scan.nextInt();

            if (menu == 1) {
                controller.RusdilinesController.biayaTiket(tiket);
            } else if (menu == 2) {
                controller.RusdilinesController.totalSemua(tiket);
            } 
        }
    }

    public static void pilihpilih (){

    }
}
