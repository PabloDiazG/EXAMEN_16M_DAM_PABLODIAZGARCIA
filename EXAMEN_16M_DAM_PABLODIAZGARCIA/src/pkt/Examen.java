package pkt;

import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num=0;
		
		System.out.println("Hola Marta soy Pablo, Introduce un n�mero para saber si es par o no");
		num=ent.nextInt();
		
		if(num/2==0) {
			System.out.println("Tu n�mero " + num + " es par" );
		}else {
			System.out.println("Tu n�mero " + num + " es impar" );
		}
		
	}

}