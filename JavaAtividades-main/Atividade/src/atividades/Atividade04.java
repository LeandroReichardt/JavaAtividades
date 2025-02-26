package atividades;
import java.util.Scanner;

public class Atividade04 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		int valor01 = sc.nextInt();
		System.out.println("Digite o primeiro valor : ");
		int valor02 = sc.nextInt();

		float resultado = valor01/valor02;
		System.out.printf("O resultado é : %.2f",resultado);
		sc.close();
	}
}
