//Implementando a interface Autenticavel
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	//Instanciando a AutentificacaoUtil
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	} 
	
	@Override
	public void setSenha(int senha) {
		//Chamando a instancia de AUtenticacaoUtil e invocando o método setSenha envindo a senha por parametro 
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		//Chamando a instancia de AUtenticacaoUtil e invocando o método autentica enviando a senha por parametro 
		return this.autenticador.autentica(senha);
	}

}