package lista_Heranca;

public class pessoaJuridica extends Contribuinte{
		
	private int cnpj;
	private double imposto;
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularImposto(){
		
		return this.imposto = (this.getRendaBruta() * 0.1);
	}
	

}
