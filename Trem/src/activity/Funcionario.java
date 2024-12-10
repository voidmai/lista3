package activity;

public class Funcionario {
	String nome;
	String cpf;
	String rg;
	int matricula;
	float salario;
	private String dataContratacao;
	private float salarioBase;
	private int horaTrabalhada;
	static int geraMatricula = 0;
	
	public Funcionario(String nome, float salarioBase, int horaTrabalhada) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.horaTrabalhada = horaTrabalhada;
		this.dataContratacao = "10/12/2024";
		this.matricula =  this.geraMatricula +=1;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getDataContratacao() {
		return dataContratacao;
	}
	
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}
	
	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = horaTrabalhada;
	}
	
	public float calculaSalario() {
		Calculo calculo = new Calculo(0);
		calculo.calculaSalario(this.salarioBase, this.horaTrabalhada);
		setSalario(calculo.getTotalSalario());
		return calculo.getTotalSalario();
	}

	public String imprimeDados() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + ", salario="
				+ salario + ", dataContratacao=" + dataContratacao + ", salarioBase=" + salarioBase
				+ ", horaTrabalhada=" + horaTrabalhada + "]";
	}
	
	
	
	
	
	
	
	
}
