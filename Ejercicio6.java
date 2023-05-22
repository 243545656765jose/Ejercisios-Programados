import java.util.Scanner;
public class Ejercicio6{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Digite un numero");
      int num1 = input.nextInt();
      for (int i = 1; i <= 10; i++) {
        int resul = num1*i ;
        System.out.println(num1+"x"+i+"="+resul);
      }
        
    
      

    }

}