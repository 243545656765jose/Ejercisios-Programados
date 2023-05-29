import java.util.Scanner;

public class E6 {
    public static void main(String args[]){
        Scanner l=new Scanner (System.in);
        System.out.println("Dijite la hora");
        int h = l.nextInt();
        while (h<=0|| h>24){
            System.out.println("Dijite la hora");
            h = l.nextInt();
        }
        
        System.out.println("Dijite los minutos");
        int m = l.nextInt();
        while(m<=0|| m>60){
            System.out.println("Dijite los minutos");
            m = l.nextInt();
        }

        System.out.println("Dijite los segundos");
        int s = l.nextInt();
        while(s<0|| s>60){
            System.out.println("Dijite los segundos");
            s = l.nextInt();
        }
        if(h>0 && h <=24 && m>0 && m<=60 && s>=0 && s<=60){
            System.out.println("Es correcta son las "+h+":"+m+" "+s);
        }else {
            System.out.println("La hora:"+h+m+s+"no es correcta");
        }

    }
    
}
