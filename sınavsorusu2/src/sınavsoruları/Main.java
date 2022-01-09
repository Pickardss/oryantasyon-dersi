package sınavsoruları;
import java.util.Scanner;
public class Main {


    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);

        System.out.println( "Lütfen cinsiyetinizi giriniz");
        String Cinsiyet = klavye.nextLine();
        System. out.println("Lütfen adım sayınızı giriniz");
        int adimsayisi = klavye.nextInt();

        int kalori ;
        if (Cinsiyet.equals("kadın")){
            kalori = adimsayisi*30/500;
        }
        else {
            kalori = adimsayisi*45/500;
        }
        System.out.println( "Yakılan kalori miktarınız :"+ kalori);
    }
}
