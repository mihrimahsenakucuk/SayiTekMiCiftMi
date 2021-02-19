import java.util.Scanner;

public class SayiTekMiCıftMiOgrenme {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayınızı giriniz.");
        int sayi = scan.nextInt();

        if(sayi % 2 ==0){
            System.out.println("Girdiğiniz sayi : Çift");
        }
        else{
            System.out.println("Girdiğiniz sayı : Tek ");
        }
    }
}