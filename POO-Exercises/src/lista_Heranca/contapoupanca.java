package lista_Heranca;

public class contapoupanca extends conta_Bancaria{
	private int diarendimento;
	
	
	public int getDiarendimento() {
		return diarendimento;
	}


	public void setDiarendimento(int diarendimento) {
		this.diarendimento = diarendimento;
	}


	public void atualizarsaldo(double taxa, int dia) {
			if(dia > this.diarendimento) {
				
				this.setSaldo(this.getSaldo() + ((this.getSaldo() * taxa) /100));
				
			}else{
				System.out.println("Rendimento s� ficar� dispon�vel ap�s o dia 10");
			}
		
			
	}
	

}
