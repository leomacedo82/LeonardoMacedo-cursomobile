package ex02;

import java.util.Scanner;

public class Volume
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double raio;
        double altura;
        double volume;

        System.out.println("Digite o valor do raio da lata:");
        raio = s.nextDouble();
        System.out.println("Digite o valor da altura da lata:");
        altura = s.nextDouble();
        volume = 3.141559 * raio * raio * altura;
        System.out.println("O valor do volume da Lata de Óleo é: " + volume +" cm");
    }
}
