import java.util.Scanner;

public class Eje10 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int ant=15;
        int suma= 0;
        int sumatotal=0;
        for (int i = 1; i <= ant; i++) {
            System.out.print("Número " + i + ": ");
            int numero = input.nextInt();
            sumatotal += numero;
        }
        System.out.println("La suma es :"+sumatotal);
    }
}
