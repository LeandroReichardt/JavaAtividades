package atividades;
import java.util.Scanner;

public class Atividade06 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		float valor01 = sc.nextFloat();


		float resultado = valor01*valor01;
		System.out.printf("O resultado é : %.2f",resultado);
		sc.close();
	}
}