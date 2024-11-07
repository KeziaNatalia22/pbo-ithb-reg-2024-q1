package controller;

import java.util.ArrayList;
import Model.*;
import java.util.Scanner;

public class RusdilinesController {
    static Scanner scan = new Scanner(System.in);
    
    public static void biayaTiket (ArrayList <Tiket> tiket){
        double totalBiaya = 0;

        for (Tiket tikets : tiket) {
            if (tikets instanceof Ekonomi) {
                Ekonomi ekonomi = (Ekonomi) tikets;
                int hargaKm = ekonomi.getJarakTempuh();
                int hargaKg = ekonomi.getBagasi();

                if (hargaKg >= 5) {
                    totalBiaya = hargaKm *7500 + hargaKg*1500 + 5000;
                } else {
                    totalBiaya = hargaKm *7500 + 5000;
                }
                System.out.println("Kelas : Ekonomi \nTotal biaya : " + totalBiaya);
            }
            else if(tikets instanceof Bisnis){
                double totalBanget = 0;
                Bisnis bisnis = (Bisnis) tikets;
                int hargaKm = bisnis.getJarakTempuh();
                int hargaKg = bisnis.getBagasi();

                String makan = bisnis.makanan.namaMakanan;
                int total = bisnis.makanan.total;
                if (makan != "") {
                    if (hargaKg >= 5) {
                        totalBanget = hargaKm *10000 + hargaKg*2500;
                        totalBiaya = totalBanget * 0.1 + totalBanget;
                    } else {
                        totalBanget = hargaKm *10000;
                        totalBiaya = totalBanget * 0.1 + totalBanget;
                    }
                    System.out.println("Kelas : Bisnis \nTotal biaya : " + totalBiaya + "Memesan makanan : " + makan + " dengan total : " + total );
                } else {
                    if (hargaKg >= 5) {
                        totalBiaya = hargaKm *10000 + hargaKg*2500;
                    } else {
                        totalBiaya = hargaKm *10000;
                    }
                    System.out.println("Kelas : Bisnis \nTotal biaya : " + totalBiaya);
                }
                
            } else if (tikets instanceof FirstClass) {
                FirstClass first = (FirstClass)tikets;

                int hargaKm = first.getJarakTempuh();

                String makan = first.makanan.namaMakanan;
                int total = first.makanan.total;

                if (first.asuransi) {
                    totalBiaya = (hargaKm * 15000)*0.1 + hargaKm*15000;
                } else {
                    totalBiaya = hargaKm * 15000;
                }
                
                if (makan != " ") {
                    System.out.println("Kelas : First Class \nTotal biaya : " + totalBiaya + "Memesan makanan : " + makan + " dengan total : " + total + "\nAsuransi :" + first.asuransi);
                } else {
                    System.out.println("Kelas : First Class \nTotal biaya : " + totalBiaya + "\nAsuransi :" + first.asuransi);
                }
            }
        }
    }


    public static double totalSemua(ArrayList <Tiket> tiket){
        double totalSemwa = 0;
        for (Tiket tikets : tiket) {
            if (tikets instanceof Ekonomi) {
                Ekonomi ekonomi = (Ekonomi) tikets;
                int hargaKm = ekonomi.getJarakTempuh();
                int hargaKg = ekonomi.getBagasi();

                if (hargaKg >= 5) {
                    totalSemwa += hargaKm *7500 + hargaKg*1500 + 5000;
                } else {
                    totalSemwa += hargaKm *7500 + 5000;
                }
            }
            else if(tikets instanceof Bisnis){
                double totalBanget = 0;
                Bisnis bisnis = (Bisnis) tikets;
                int hargaKm = bisnis.getJarakTempuh();
                int hargaKg = bisnis.getBagasi();

                String makan = bisnis.makanan.namaMakanan;
                if (makan != "") {
                    if (hargaKg >= 5) {
                        totalBanget += hargaKm *10000 + hargaKg*2500;
                        totalSemwa += totalBanget * 0.1 + totalBanget;
                    } else {
                        totalBanget += hargaKm *10000;
                        totalSemwa += totalBanget * 0.1 + totalBanget;
                    }
                } else {
                    if (hargaKg >= 5) {
                        totalSemwa += hargaKm *10000 + hargaKg*2500;
                    } else {
                        totalSemwa += hargaKm *10000;
                    }
                }
                
            } else if (tikets instanceof FirstClass) {
                FirstClass first = (FirstClass)tikets;

                int hargaKm = first.getJarakTempuh();

                if (first.asuransi) {
                    totalSemwa += (hargaKm * 15000)*0.1 + hargaKm*15000;
                } else {
                    totalSemwa += hargaKm * 15000;
                }
                
            }
        }
        
        return totalSemwa;
    }
}
