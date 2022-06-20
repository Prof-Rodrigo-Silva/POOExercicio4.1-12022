package classeexecutavel;

import model.ProfHorista;
import model.ProfRegime;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
		
		
		ProfHorista profHorista = new ProfHorista("Luffy","Sunny",17, 40, 20);
		
		System.out.println("Nome prof Horista: "+profHorista.getNome());
		System.out.println("Matricula prof Horista: "+profHorista.getMatricula());
		System.out.println("Idade prof Horista: "+profHorista.getIdade());
		System.out.println("Valor da hora: "+profHorista.getSalHora());
		System.out.println("Total de horas: "+profHorista.getTotalHoras());
		System.out.println("Salario prof Horista: "+profHorista.retornaSalario());
		System.out.println("###############################################################");
		ProfRegime profRegime = new ProfRegime("Zoro", "Namy", 18, 1000);
		System.out.println("Nome prof Regime: "+profRegime.getNome());
		System.out.println("Matricula prof Regime: "+profRegime.getMatricula());
		System.out.println("Idade prof Regime: "+profRegime.getIdade());
		System.out.println("Salario Bruto: "+profRegime.getSalarioBruto());
		System.out.println("Salario liquido: "+profRegime.getSalarioLiquido());
		System.out.println("Salario prof Regime: "+profRegime.retornaSalario());
	}

}
