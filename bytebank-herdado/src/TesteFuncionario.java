public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("222.333.444-55");
		nico.setSalario(2600.00);
		
		System.out.println("O funcionario, "+nico.getNome()+", ganhou um bônus de 10%, esse mês ele irá receber: "+nico.getBonificacao()+" a mais em seu sálario");
	}
}