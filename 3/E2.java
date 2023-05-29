import java.util.Scanner;
public class E2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int n = input.nextInt();
        while (n<0){
            System.out.println("Ingrese el numero");
            n = input.nextInt();
        }
        System.out.println("El doble de: "+n+   "es="  +n*2);
        System.out.println("El triple d:"+n+    "es="  +n*3);




    }
    
}
