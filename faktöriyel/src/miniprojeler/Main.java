package miniprojeler;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        long fak = 1;
        System.out.println( "Bir sayı giriniz");
        long sayi = klavye.nextInt();

        for (int i=1;i<=sayi;i++){
            fak = fak *i;
        }
        System.out.println(sayi+" sayısının faktöriyeli :" +fak);
    }
}
