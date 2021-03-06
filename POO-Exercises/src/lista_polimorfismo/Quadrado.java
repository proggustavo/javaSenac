package lista_polimorfismo;

public class Quadrado extends FormaGeometrica{
	
	private double lado;

	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	

	public Quadrado() {
		super();
		
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcArea() {
		
		return this.lado * this.lado;
	}

	@Override
	public double calcPerimetro() {
		return 4 * this.lado;
	}
	
	
	

}
