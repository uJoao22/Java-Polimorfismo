public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("222.333.444-55");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		System.out.println(nico.getSalario());
	}
}