package sinavsorusu;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println( "Lütfen kaçıncı ayda olduğunuzu giriniz");
        int ay = klavye.nextInt();
        System.out.println( "Lütfen makine sayınızı giriniz");
        int makinesayisi = klavye.nextInt();

        int süre;
        int aralık;
        if (ay<9 && ay>2){
            süre = 480 ;
            aralık = 45;
        }
        else{
            süre = 540;
            aralık = 30;
        }
        for (int i=1; i<=makinesayisi; i++){
            System.out.println( i+"."+"Makinenin çalışma süresi :"+ süre);
            süre = süre-aralık;
        }
    }
}
