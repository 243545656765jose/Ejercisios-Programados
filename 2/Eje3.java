import java.util.Scanner;
public class Eje3{
     public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("DIjite primer numeros:");
        int uno = input.nextInt();
        while(uno!=0){
            System.out.println("DIjite segundo numero numeros:");
            uno = input.nextInt();
        }
        System.out.println("DIjite primer numero numeros:");
        int dos = input.nextInt();
        while(uno!=0){
            System.out.println("DIjite segundo numero numeros:");
            dos = input.nextInt();
        }
        if (uno > dos){
            System.out.println("EL NUMERO MAYOR ES:"+uno) ;
        }else{
            System.out.println("El numero mayor es :"+dos);
        }
    }
}