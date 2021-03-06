package lista_Heranca;

public class pessoaFisica extends Contribuinte{
	
		private int cpf;
		private double aliquota;
		private double parceladeduzir;
		private double imposto;
		
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public double getimposto() {
			return this.imposto;
		}
		public void setimposto(int imposto) {
			this.imposto = imposto;
		}
		
		public double calcularImposto() {
			if(this.getRendaBruta() <= 1400) {
				this.aliquota = 0;
				this.parceladeduzir = 0;
				return this.imposto = this.getRendaBruta() * aliquota - parceladeduzir;
				
			}else if(this.getRendaBruta() <= 2100) {
				this.aliquota = 0.1;
				this.parceladeduzir = 100.00;
				return this.imposto = (this.getRendaBruta() * aliquota) - parceladeduzir;
			
				
			}else if(this.getRendaBruta() <= 2800) {
				this.aliquota = 0.15;
				this.parceladeduzir = 270.00;
				return this.imposto = (this.getRendaBruta() * aliquota) - parceladeduzir;
				
			}else if(this.getRendaBruta() <= 3600 ) {
				this.aliquota = 0.25;
				this.parceladeduzir = 500;
				return this.imposto = (this.getRendaBruta() * aliquota) - parceladeduzir;
				
				
			}else {
				this.aliquota = 0.30;
				this.parceladeduzir = 700;
				return this.imposto = (this.getRendaBruta() * aliquota) - parceladeduzir;
				
				
			}
		}
		
}
