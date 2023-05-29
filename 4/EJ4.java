
import java.util.Scanner;

public class EJ4 {
    public static void main(String args[]){
        Scanner l = new Scanner(System.in);
        System.out.println("Digite el número:");
        int num = l.nextInt();
        while (num > 0){
            System.out.println("El elevado es: " + Math.pow(num, 2));
            num = l.nextInt();
        }
    }
}
