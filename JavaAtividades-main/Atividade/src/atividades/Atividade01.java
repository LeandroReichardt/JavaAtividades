package atividades;
import java.util.Scanner;

public class Atividade01 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		int valor01 = sc.nextInt();
		System.out.println("Digite o primeiro valor : ");
		int valor02 = sc.nextInt();

		int resultado = valor01 +valor02;
		System.out.print("O resultado é : "+resultado);
		sc.close();
	}
}
