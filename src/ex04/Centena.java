package ex04;

import java.util.Scanner;

public class Centena
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número para teste: ");
        numero = s.nextInt();

        if (numero >= 0 & numero <= 100)
        {
            System.out.println("O número está compreendido entre 0 e 100");
        }
        else
        {
            System.out.println("O número não está compreendido entre 0 e 100");
        }
    }
}
