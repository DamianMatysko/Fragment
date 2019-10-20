package sk.itsovy.matysko.projectfragment;

import java.util.Scanner;

public class Bank {
    public Bank() {
    }

    //parametricky konstruktor
    Bank(String name) {

    }

    public double convert(double amount, String code) {
        //String TRY, HUF, CHF, HRK, GBP;


        switch (code) {
            case "TRY":
                amount = amount * 6.47;
                amount = Math.round(amount * 100.0) / 100.0;
                return amount;

            case "HUF":
                amount = amount * 331.21;
                amount = Math.round(amount * 100.0) / 100.0;
                return amount;
            case "CHF":
                amount = amount * 1.10;
                amount = Math.round(amount * 100.0) / 100.0;
                return amount;

            case "HRK":
                amount = amount * 17.44;
                amount = Math.round(amount * 100.0) / 100.0;
                return amount;
            case "GBP":
                amount = amount * 0.86;
                amount = Math.round(amount * 100.0) / 100.0;
                return amount;

            default:
                return -1;

        }
    }

    /*
    kurzy dajte priblizne s presnostou na 2 desatinne miesta
    metoda bude konvertovat EUR na tieto meny: TRY, HUF, CHF, HRK, GBP
    ak kod bude iny, metoda vrati -1

    priklad:
    convert (120,"CHF")  vrati vysledok 191.95 ...to urcite!!!

    convert (520,"USD")  vrati vysledok -1
*/
    public static double loan(double value, double interest, int months) {
        // doplnit kod
        if (value <= 0 || interest <= 0 || months <= 0) {
            return -1;
        } else {
            double resut = ((value / months) / 100) * interest;
            return resut;
        }
    /*
    metoda vypocita vypocita vysku mesacnej splatky
            (suma sa navysi o urok a vydeli sa poctom splatok)
    pri nespravnom vstupe, ak nejake cislo bude zaporne alebo 0, vrati metoda -1
*/
    }
}
