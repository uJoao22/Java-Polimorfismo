public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();

		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("222.333.444-55");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		System.out.println(nico.getSalario());
	}
}