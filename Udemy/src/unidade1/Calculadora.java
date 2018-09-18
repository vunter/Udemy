package unidade1;

import java.util.Scanner;

public class Calculadora {

	public static void dividir(int n1, int n2) throws ArithmeticException {
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}

	public static void main(String[] args) throws DivisaoZeroException {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira n1 e n2");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		try {

			dividir(n1, n2);
		} catch (ArithmeticException e) {
			throw new DivisaoZeroException();
			
		}
	}

}
