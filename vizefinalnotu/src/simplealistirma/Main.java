package simplealistirma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner klavye = new Scanner(System.in);
    System.out.println( "Vize notunuzu giriniz");
    double Vize = klavye.nextDouble();
    System.out.println("Final notunuzu giriniz");
    double Final = klavye.nextDouble();

    double ogrencinotu = (Vize*0.4)+(Final*0.6);
    System.out.println("Öğrencinin Notu"+ogrencinotu);

    if (ogrencinotu<=50){
        System.out.println("Maalesef geçemediniz");
    }
    else{
        System.out.println( "Tebrikler geçtiniz");
    }
    }
}
