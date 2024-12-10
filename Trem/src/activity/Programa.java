package activity;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario("Zé", 25, 44);
		f1.rg = "12345678";
		f1.cpf= "123456789101";
		f1.salario = 380;
		f1.matricula = 123;
		f1.calculaSalario();
		System.out.println(f1.imprimeDados());
		
		
		Funcionario f2 = new Funcionario("Maria", 25, 40);
		f2.rg = "12345678";
		f2.cpf= "123456789101";
		f2.salario = 380;
		f2.matricula = 123;
		f2.calculaSalario();
		System.out.println(f2.imprimeDados());
		
	}

}
