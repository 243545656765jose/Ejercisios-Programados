import java.util.Scanner;
public class Ejercicio3{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Digite el radio");
      int num = input.nextInt();
      double pi=13.14;
      double area = (num^2)*pi;
      double perimetro= (2*pi)*num;
      System.out.println("El area es :"+area+"y el perimetro es:"+perimetro);
     
    }

}
