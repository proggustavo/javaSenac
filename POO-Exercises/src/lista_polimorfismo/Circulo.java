package lista_polimorfismo;

public class Circulo extends FormaGeometrica {
	
	private double raio;
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public Circulo() {
		super();
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcArea() {
		return Math.PI * this.getRaio() * this.getRaio();
	}

	@Override
	public double calcPerimetro() {
		return 2 * Math.PI * this.getRaio();
	
	}

}
