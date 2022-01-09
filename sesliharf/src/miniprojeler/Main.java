package miniprojeler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Bir harf giriniz");
        char harf = giris.next().charAt(0);

        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("sesli bir harftir");
                break;
            default:
                System.out.println("sessiz bir haftir");
        }
    }
}