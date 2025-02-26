package atividades2;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);		
			System.out.println("Digite o primeiro valor : ");
				float valor01 = sc.nextFloat();
					System.out.println("Digite o segundo valor : ");
						float valor02 = sc.nextFloat();
							System.out.println("Digite o terceiro valor : ");
								float valor03 = sc.nextFloat();
									float resultado = (valor01*2)+(valor02*3)+(valor03*4)/9;
									
									System.out.print("O resultado é : "+resultado);
									sc.close();
}
	
}