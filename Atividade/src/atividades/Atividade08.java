package atividades;
import java.util.Scanner;

public class Atividade08 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		float valor01 = sc.nextFloat();
		

		float resultado = (float) (valor01 *1.8+32);
		System.out.printf("O resultado é : %.2f",resultado);
		sc.close();
	}
}