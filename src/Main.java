import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Faça um programa que receba 5 salários brutos de funcionários, sabendo-se que são descontados Imposto de Renda e INSS, calcule e mostre o total do salário líquido no referido mês.
//
//                Obs.: Salário Bruto - Descontos = Salário Líquido.
//
//                A saída do programa deve fornecer as seguintes informações:
//
//        Salário bruto.
//        Quanto pagou ao INSS.
//        Quanto pagou de Imposto de Renda.
//        Salário líquido.
//        Calcule os descontos e o salário líquido com base nas tabelas abaixo:
//
//        Salário	% Desconto INSS
//                até 1.212,00	7,5%
//                de 1212,01 até 2.427,35	9%
//                de 2.427,36 até 3.641,03	12%
//                maior que  3.641,04	14%
//                Salário	% Desconto Imposto de Renda
//
//                até 1.903,98	0%
//                de 1.903,99 até 2.826,65	7,5%
//                de 2.826,66 até 3.751,05	15%
//                de 3.751,06 até 4.664,68	22,50%
//                Acima de 4.664,68	27,50%

        Scanner scanner = new Scanner(System.in);
        double[] salariosBruto = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o salário do(a) " + (i + 1) + "º funcionário(a): ");
            salariosBruto[i] = scanner.nextDouble();
        }

        scanner.close();

        for (int i = 0; i < 5; i++) {
            double salarioBruto = salariosBruto[i];
            double inss = descontoINSS(salarioBruto);

            System.out.printf("O salário bruto do(a) %dº funcionário(a) é: R$%.2f %n", (i + 1), salarioBruto);
            System.out.printf("A contribuição ao INSS do %dº funcionário(a) será: R$%.2f %n", (i + 1), inss);
        }
    }

    public static double descontoINSS(double salarioPreINSS) {
        if (salarioPreINSS <= 1212.00) {
            return salarioPreINSS * 0.075;
        } else if (salarioPreINSS <= 2427.35) {
            return salarioPreINSS * 0.09;
        } else if (salarioPreINSS <= 3641.03) {
            return salarioPreINSS * 0.12;
        } else {
            return salarioPreINSS * 0.14;
        }
    }

}
