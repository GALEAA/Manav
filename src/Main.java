import java.util.Scanner;

public class Main {
    public static void main(String[] args) {}

    static {
    Scanner tutar = new Scanner(System.in);

    double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;
    double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

    System.out.print("Armut miktarını kilogram cinsinden giriniz : ");
    armutKilo = tutar.nextDouble();

    System.out.print("Elma miktarını kilogram cinsinden giriniz : ");
    elmaKilo = tutar.nextDouble();

    System.out.print("Domates miktarını kilogram cinsinden giriniz : ");
    domatesKilo = tutar.nextDouble();

    System.out.print("Muz miktarını kilogram cinsinden giriniz : ");
    muzKilo = tutar.nextDouble();

    System.out.print("Patlıcan miktarını kilogram cinsinden giriniz : ");
    patlicanKilo = tutar.nextDouble();

    double hesap = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
    System.out.print("Ücret :" + hesap + "Türk Lirası");

    }
}
