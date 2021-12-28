public class TesteReferencias {
	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1); //Gerente
		controle.registra(f1); //Funcionário
		controle.registra(ev); //Editor de vídeo
		
		System.out.println(controle.getSoma());
	}
}