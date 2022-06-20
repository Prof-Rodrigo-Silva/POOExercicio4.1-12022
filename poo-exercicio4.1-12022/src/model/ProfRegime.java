package model;

public class ProfRegime extends Professor{

	private float salarioBruto;
	private float salarioLiquido;
	
	public ProfRegime() {
		super();
	}
	
	public ProfRegime(String nome, String matricula, int idade, float salario) {
		super(nome, matricula, idade);
		this.salarioBruto = salario;
	}
	
	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public float getSalarioLiquido() {
		if(this.salarioLiquido == 0.0f) {
			return this.retornaSalario();
		}else {
			return salarioLiquido;
		}
		
	}

	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	@Override
	public float retornaSalario() {
		return this.salarioLiquido = this.salarioBruto - (this.salarioBruto * 0.12f);
	}

}
