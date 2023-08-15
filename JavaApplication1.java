
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
       
           Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite o salário mensal do funcionário: ");
            double salarioMensal = scanner.nextDouble();

            System.out.print("Digite a quantidade de horas trabalhadas por mês: ");
            double horasTrabalhadas = scanner.nextDouble();

            double valorHora = salarioMensal / horasTrabalhadas;

            System.out.println("O valor da hora trabalhada é: " + valorHora);

            System.out.print("Digite 'sair' para encerrar o programa ou qualquer outra tecla para continuar: ");
            opcao = scanner.next().toLowerCase();
        } while (!opcao.equals("sair"));

        System.out.println("Programa encerrado.");
    }
    
}
