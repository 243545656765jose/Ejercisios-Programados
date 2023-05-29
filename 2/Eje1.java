import java.util.Scanner;
public class Eje1{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Digite un numero");
      int numero =input.nextInt();
      if(numero >= 0){
        System.out.println("EL numero es par:"+numero);

      }else{
        System.out.println("ES impar:"+numero);
      }
    }

}
