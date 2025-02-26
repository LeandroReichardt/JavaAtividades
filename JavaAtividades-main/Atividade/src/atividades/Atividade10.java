package atividades;
import java.util.Scanner;

public class Atividade10 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a area : ");
		float valor01 = sc.nextFloat();
	

		float resultado = (float) (2*3.14*valor01);
		System.out.printf("O resultado é : %.2f",resultado);
		sc.close();
	}
}