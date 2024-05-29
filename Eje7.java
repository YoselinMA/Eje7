import java.util.Scanner;
public class Eje7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i, j;
        System.out.println("Ingtesa el numero");
        numero = sc.nextInt();

        System.out.println("Ascendente\n");
        for (i =1; i<=numero; i ++){
            for (j = 1; j <= i; j ++ ){
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.print("\nDescendente\n");
        for(i = numero; i >= 1; i --){
            for(j=1; j<=i; j ++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    
}
