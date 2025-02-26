package atividades2;
import java.util.Scanner;


public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial: R$ ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (em %): ");
        double taxaJurosAnual = scanner.nextDouble();

        System.out.print("Digite o número de anos: ");
        int numeroAnos = scanner.nextInt();

        double montanteFinal = calcularMontante(capitalInicial, taxaJurosAnual, numeroAnos);

        System.out.printf("O montante final do investimento é: R$ %.2f%n", montanteFinal);
        scanner.close();
    }

    public static double calcularMontante(double capitalInicial, double taxaJurosAnual, int numeroAnos) {
        double taxaJurosDecimal = taxaJurosAnual / 100.0;
        return capitalInicial * Math.pow(1 + taxaJurosDecimal, numeroAnos);
    }
}