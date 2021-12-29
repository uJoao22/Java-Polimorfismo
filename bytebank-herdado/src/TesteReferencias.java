public class TesteReferencias {
	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d1 = new Designer();
		d1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1); //Gerente
		controle.registra(ev); //Editor de vídeo
		controle.registra(d1); //Desginer
		
		System.out.println(controle.getSoma());
	}
}