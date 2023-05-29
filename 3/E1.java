import java.util.Scanner;

public class E1 {
    public static void main(String args[]){
        Scanner le =new Scanner(System.in);
        System.out.println("Ïngrese un numero");
        int n1 =le.nextInt();
        System.out.println("Ïngrese el otro  numero");
        int n2 =le.nextInt();
        if(n1==n2){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        

    }
}
