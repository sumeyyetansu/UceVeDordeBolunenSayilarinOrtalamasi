import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;
        int count = 0 , total = 0;

        System.out.println("Lütfen bir sayı giriniz:");
        number = scanner.nextInt();

        for (int i = 0 ; i < number ; i++){

            if ( i % 3 == 0 && i % 4 == 0){
                count ++;
                total += i;
                System.out.println(i);
            }
        }
        System.out.println(total/count);
    }
}