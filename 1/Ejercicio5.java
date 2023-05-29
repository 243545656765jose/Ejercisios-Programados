import java.util.Scanner;
public class Ejercicio5{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Digite un numero");
      int num1 = input.nextInt();
      int factorial = 0;
      for (int i = 1; i <= num1; i++) {
            factorial *= i;
        }
        System.out.println("es"+factorial);
    
      

    }

}