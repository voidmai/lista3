package activity;


public class Calculo {
	private float totalSalario;

	public Calculo(float totalSalario) {
		super();
		this.totalSalario = totalSalario;
	}

	public float getTotalSalario() {
		return totalSalario;
	}

	public void setTotalSalario(float totalSalario) {
		this.totalSalario = totalSalario;
	}
	
	
	public void calculaSalario(float salarioBase, int horasTrabalhadas) {
		float salario = 0;
		salario = (salarioBase * horasTrabalhadas);
		setTotalSalario(salario);
	}

}	
