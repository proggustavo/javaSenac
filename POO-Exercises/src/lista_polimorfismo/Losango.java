package lista_polimorfismo;

public class Losango extends FormaGeometrica {
	
	private double ladoA;
	private double ladoB;
	private double diagonalMaior;
	private double diagonalMenor;
	
	public Losango(String nome, double ladoA, double ladoB, double diagonalMaior, double diagonalMenor) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	
	public Losango() {
		super();
		
	}
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getDiagonalMaior() {
		return diagonalMaior;
	}
	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	@Override
	public double calcArea() {
		
		return (this.diagonalMaior * this.diagonalMenor) / 2;
	}
	
	@Override
	public double calcPerimetro() {
		return this.ladoA * 4;
	}
	
	
	
	
	
	

}
