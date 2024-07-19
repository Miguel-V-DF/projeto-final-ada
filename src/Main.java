import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
            double impostoRenda = aliquotaIR(salarioBruto);
            double salarioLiquido = salariosBruto[i] - inss - impostoRenda;

            System.out.printf("O salário bruto do(a) %dº funcionário(a) é: R$%.2f %n", (i + 1), salarioBruto);
            System.out.printf("A contribuição ao INSS do(a) %dº funcionário(a) será: R$%.2f %n", (i + 1), inss);
            System.out.printf("A contribuição ao Imposto de Renda do(a) %dº funcionário(a) será: R$%.2f %n", (i + 1), impostoRenda);
            System.out.printf("O salário líquido do(a) %dº funcionário(a) será: R$%.2f %n", (i + 1), salarioLiquido);
            System.out.println("--------------------------");
        }
    }

    private static double descontoINSS(double salarioPreINSS) {
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

    private static double aliquotaIR(double salarioPreIR) {
        if (salarioPreIR <= 1903.98) {
            return salarioPreIR * 0;
        } else if (salarioPreIR <= 2826.65) {
            return salarioPreIR * 0.075;
        } else if (salarioPreIR <= 3751.05) {
            return salarioPreIR * 0.15;
        } else if (salarioPreIR <= 4664.68) {
            return salarioPreIR * 0.225;
        } else {
            return salarioPreIR * 0.275;
        }
    }
}
