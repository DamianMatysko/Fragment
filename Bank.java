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

        Scanner myObj = new Scanner(System.in);
        System.out.println("Amount:");
        amount = myObj.nextDouble();
        System.out.println("Code:");
        code = myObj.nextLine();
        switch (code) {
            case "TRY":
                amount = ((amount * 100) / 647) / 100.00;
                return amount;

            case "HUF":
                amount = ((amount * 100) / 647) / 100.00;
                return amount;
            case "CHF":
                amount = ((amount * 100) / 647) / 100.00;
                return amount;

            case "HRK":
                amount = ((amount * 100) / 647) / 100.00;
                return amount;
            case "GBP":
                amount = ((amount * 100) / 647) / 100.00;
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
    convert (120,"CHF")  vrati vysledok 191.95

    convert (520,"USD")  vrati vysledok -1
*/
    public static double loan(double value, double interest, int months) {
        // doplnit kod
        return -1;
    }
    /*
    metoda vypocita vypocita vysku mesacnej splatky
            (suma sa navysi o urok a vydeli sa poctom splatok)
    pri nespravnom vstupe, ak nejake cislo bude zaporne alebo 0, vrati metoda -1
*/
}
