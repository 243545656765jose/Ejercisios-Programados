import java.util.Scanner;

public class quiz {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dijite las filas");
        int filas = input.nextInt();
        while(filas<=0){
            System.out.println("Dijite las filas");
            filas = input.nextInt();
        }

        System.out.println("Dijite las columnas");
        int columnas = input.nextInt();
        while(columnas<=0){
            System.out.println("Dijite las columnas");
            columnas = input.nextInt();
        }

        System.out.println("Dijite su nombre");
        String nombre = input.next();
        
        for (int i = 0; i < filas; i++) {
            for (int q = 0; q < columnas; q++) {
                System.out.print(nombre +"  ");
            }
            System.out.println();
        }

    }

}
