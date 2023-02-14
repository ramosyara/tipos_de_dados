 import java.util.Scanner;

public class Operadores {
    public static void main(String[] yara){

        Scanner entrada = new Scanner (System.in);
         int idade=0;
         int numero1;
         int numero2;
         int soma;

         System.out.println("digite sua idade");
         idade=entrada.nextInt();
         System.out.println(idade);


         System.out.println("digite um número: ");
         numero1=entrada.nextInt();

         System.out.println("digite um número: ");
         numero2=entrada.nextInt();
         soma=numero1+numero2;
         System.out.println("a soma dos dois numeros são " + soma);
    }
   
}