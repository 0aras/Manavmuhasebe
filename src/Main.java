import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner taa = new Scanner(System.in);
        System.out.println("Armut kaç Kilo ");
        float armut= (float) (taa.nextFloat()*2.14);
        System.out.println("Elma kaç kilo");
        float elma=(float)(taa.nextFloat()*3.67);
        System.out.println("Domates kaç kilo");
        float domates=(float)(taa.nextFloat()*1.11);
        System.out.println("Muz kaç kilo");
        float muz=(float)(taa.nextFloat()*0.95);
        System.out.println("Patlıcan kaç kilo");
        float patlican=(float)(taa.nextFloat()*5.0);

        System.out.println("Toplam tutar: "+(armut+elma+domates+muz+patlican)+ " TL");
    }
}