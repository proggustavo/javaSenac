package lista_polimorfismo;

import java.text.DecimalFormat;
import java.util.Random;

public class Executavel {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		Random valor = new Random();
		
		// não consigo instanciar objeto de classe abstrata
		// mas um array é possível 
		
		
		FormaGeometrica[] formas = new FormaGeometrica[7];
		
		for(int i = 0; i < formas.length; i ++) {
			int tipo = valor.nextInt(7);
				switch(tipo) {
					case 0: {
						Quadrado quadrado = new Quadrado("Quadrado", valor.nextInt(9) + 1);
						formas[i] = quadrado;
						break;
					}
					case 1: {
						Circulo circulo = new Circulo("Circulo", (valor.nextInt(9) + 1));
						formas[i] = circulo;
						break;
					}
					case 2: {
						Retangulo retangulo = new Retangulo("Retangulo", valor.nextInt(9) + 1, valor.nextInt(9) + 1);
						formas[i] = retangulo;
						break;
					}
					case 3: {
						Losango losango = new Losango("Losango", (valor.nextInt(9) + 1), 
								(valor.nextInt(9) + 1), (valor.nextInt(9) + 1), (valor.nextInt(9) + 1));
						formas[i] = losango;
						break;
					}
					case 4: {
						TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo("Triangulo Retângulo", (valor.nextInt(9) + 1), (valor.nextInt(9) + 1));
						formas[i] = trianguloRetangulo;
						break;
					}
					case 5: {
						TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero("Triangulo Equilatero", (valor.nextInt(9) + 1));
						formas[i] = trianguloEquilatero;
						break;
					} 
					case 6: {
						TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles("Triangulo Isosceles", (valor.nextInt(9) + 1), valor.nextInt(9) + 1);
						formas[i] = trianguloIsosceles;
						break;
					} 
				}
		}
				
				for(int i = 0; i < formas.length; i ++) {
					System.out.println("Nome da figura: " + formas[i].getNome());
					System.out.println("Perímetro: " + df.format(formas[i].calcPerimetro()));
					System.out.println("Área: " + df.format(formas[i].calcArea()));
				
				
				}
		
		
		
	}

}
