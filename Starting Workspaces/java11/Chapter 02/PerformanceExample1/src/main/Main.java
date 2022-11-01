package main;

public class Main {
	public static void main(String[] args) {
		long init = System.currentTimeMillis();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		System.out.println("Tiempo ejecución: " + (System.currentTimeMillis() - init));
	}
}
