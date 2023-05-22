import java.util.Scanner;
public class Eje2{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Ijite dos numeros:");
        int uno = input.nextInt();
        int dos = input.nextInt();
        int resultado = 0;
        resultado = uno / dos ;

        if (resultado == 0){
            System.out.println("El numero si es multiplo ");

        }else{
            System.out.println("El numero no es multiplo ");
        }
    }
}