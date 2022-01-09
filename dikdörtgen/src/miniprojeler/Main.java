package miniprojeler;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    System.out.println("Dikdörtgenin boy değerini giriniz");
    int boy = input.nextInt();
    System.out.println("Dikdörtgenin en değerini giriniz");
    int en = input.nextInt();

    for (int i = 0;i<boy;i++){
        for (int j = 0;j<en;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
}
