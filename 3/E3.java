import java.util.Scanner;
public class E3 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int n = input.nextInt();
        while (n<0){
            System.out.println("Ingrese el numero");
            n = input.nextInt();
        }
        if (n%3==0){
            System.out.println(" Es multiplo de 3");
        }else{
            System.out.println(" Noes  multiplo de 3");
        }
        if (n%5==0){
            System.out.println(" Es multiplo de 5");
        }else{
            System.out.println(" No esmultiplo de 5");
        }

    }
    
}