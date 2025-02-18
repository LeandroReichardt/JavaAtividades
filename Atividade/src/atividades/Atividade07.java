package atividades;
import java.util.Scanner;

public class Atividade07 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		float valor01 = sc.nextFloat();
		System.out.println("Digite o primeiro valor : ");
		float valor02 = sc.nextFloat();
		System.out.println("Digite o primeiro valor : ");
		float valor03 = sc.nextFloat();

		float resultado = (valor01+valor02+valor03)/3;
		System.out.printf("O resultado é : %.2f",resultado);
		sc.close();
	}
}