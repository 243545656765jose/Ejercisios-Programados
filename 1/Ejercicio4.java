import java.util.Scanner;
public class Ejercicio4{ public static void main(String args[]){
      Scanner input = new Scanner(System.in);

      System.out.println("Digite un numero");
      int num1 = input.nextInt();


      System.out.println("Digite segundo numero");
      int num2 = input.nextInt();
      

      
      int multi= num1 *num2;
      int divi= num1 /num2;
      int suma= num1 +num2;
      int rest= num1 -num2;

      System.out.println("la mu;ltiplicacion es :"+multi);
      System.out.println("la division  es :"+divi);
      System.out.println("la suma es :"+suma);
      System.out.println("la resta es :"+rest);
      

    }

}