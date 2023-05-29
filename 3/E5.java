
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        System.out.println("Ingrese las millas (0 para salir):");
        double millas = l.nextDouble();
        double k = 1.6093;
        
        while (millas != 0) {
            System.out.println("Los kilómetros son: " + millas *k);
            System.out.println("Ingrese las millas (0 para salir):");
            millas = l.nextDouble();
        }
    }
}
