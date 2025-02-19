package atividades;
import java.util.Scanner;

public class Atividade09 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a Largura : ");
		float valor01 = sc.nextFloat();
		System.out.println("Digite a Altura : ");
		float valor02 = sc.nextFloat();

		float resultado = valor01*valor02;
		System.out.printf("O resultado é : %.2f",resultado);
		sc.close();
	}
}
