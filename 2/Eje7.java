import java.util.Scanner;

public class Eje7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Dijite un numero");
        int n= input.nextInt();
        double resul=n^2;
        System.out.println(resul);

        while(n>0){
          System.out.println("Dijite un numero");
          n= input.nextInt();
          resul=Math.pow(n,2);
          if(n>0){
            System.out.println(resul);
          }else{
            break;
          }
          
        }
    }
  
}
