import java.util.Scanner;

public class E4 {
    public static void main(String args[]){
        Scanner l = new Scanner(System.in);
        System.out.println("Dijite su fecha de nacimiento");
        int f =l.nextInt();
        while(f<0){
            System.out.println("Dijite su fecha de nacimiento");
            f =l.nextInt();
        }
        if(f%2==0){
            System.out.println("Si es bisiesto");
        }else if (f%100==1 || f%400==1){
            System.out.println("No es bisiesto");
        }

    }
    
}
