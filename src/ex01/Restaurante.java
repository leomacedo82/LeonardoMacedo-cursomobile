package ex01;

import java.util.Scanner;

public class Restaurante
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double conta;
        double resultado;

        System.out.println("Digite o valor da conta:");
        conta = s.nextDouble();
        resultado = conta * 1.1;
        System.out.println("O valor total da conta com a taxa de gorjeta é: " + resultado);
    }
}
