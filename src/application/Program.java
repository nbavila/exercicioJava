package application;

import entities.Dados;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Configura a formatação de números para usar o padrão dos EUA (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Inicializa um objeto Scanner para ler entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Cria uma lista para armazenar dados de contribuintes
        List<Dados> list = new ArrayList<>();

        // Solicita o número de contribuintes ao usuário
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        // Loop para coletar informações de cada contribuinte
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            // Pergunta se o contribuinte é uma pessoa física ou jurídica
            System.out.print("Individual or company? (i/c)? ");
            char opcao = sc.next().charAt(0);

            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Annual income: ");
            double rendaAnual = sc.nextDouble();

            if (opcao == 'i') {
                // Se for pessoa física, solicita os gastos com saúde
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();

                // Cria um objeto PessoaFisica e adiciona à lista
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (opcao == 'c') {
                // Se for pessoa jurídica, solicita o número de funcionários
                System.out.print("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();

                // Cria um objeto PessoaJuridica e adiciona à lista
                list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        // Exibe o valor total dos impostos pagos por cada contribuinte
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Dados dados : list) {
            System.out.println(dados.getNome() + ": $ " + String.format("%.2f", dados.total()));
        }

        // Calcula e exibe o total de impostos pagos por todos os contribuintes
        double somaAcumulativa = 0.0;
        for (Dados dados : list) {
            somaAcumulativa += dados.total();
        }
        System.out.println();
        System.out.print("Total taxes:  $ " + String.format("%.2f", somaAcumulativa));

        // Fecha o Scanner
        sc.close();
    }
}
