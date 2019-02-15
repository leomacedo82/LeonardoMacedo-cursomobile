package ex03;

import java.util.Scanner;

public class Emprestimo
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        double salarioBruto;
        double prestacao;

        System.out.println("Digite o valor do Salário Bruto: ");
        salarioBruto = s.nextDouble();
        System.out.println("Digite o valor da Prestação pretendida: ");
        prestacao = s.nextDouble();

        if (prestacao > (0.3 * salarioBruto))
        {
            System.out.println("Valor da prestação Não Aprovado por ultrapassar valor máximo");
        }else
        {
            System.out.println("Valor da prestação Aprovado");
        }
    }
}
