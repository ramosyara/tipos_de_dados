import java.util.Scanner;

public class OperadorCalc {
    // colete dois números do teclado
    //faça as 5 operações matemáticas
    //double
    //float
    //declare também as variáveis soma, mult, divisão, resto, subtração

    public static void main(String[] Soncin) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        int multiplicação;
        double divisão;
        int subtração;
        double resto;

    

    System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();

        soma=numero1+numero2;
        System.out.println("A soma dos dois números é:" + soma);

        multiplicação=numero1*numero2;
        System.out.println("A multiplicação dos dois números é:" + multiplicação);

        divisão=numero1/numero2;
        System.out.println("A divisão dos dois números é:" + divisão);

        subtração=numero1-numero2;
        System.out.println("A subtração dos dois números é:" + subtração);

        resto=numero1%numero2;
        divisão=numero1/numero2;
        System.out.println("O resto dos dois números é:" + resto);
    }

}