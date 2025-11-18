import java.util.Scanner;

public class GreaterInFour {
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(" value of a , b , c , d is..."+ a + " " + b+ " " + c+ " " + d + " ");

        int max = a;

        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        if(d > max){
            max = d;
        }

        System.out.println("Greatest number is: " + max);
    }
}
