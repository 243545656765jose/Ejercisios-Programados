
import java.util.Scanner;
public class Eejercicio1{
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num=input.nextInt();
        if (num%2==0){
            System.out.println("Numero par:"+num);
        }else{
            System.out.println("Numero impar:"+num);
        }
    }
}