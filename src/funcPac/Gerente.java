package funcPac;

public class Gerente extends Funcionario {
	private String setor;
	private String porcentagem;
	
	public String toString(){
		String s = "";
		s += this.getNome();
		s += "/"+this.getCpf();
		s += "/"+this.getCargo();
		s += "/"+this.getSalario();
		s += "/"+this.setor;
		s += "/"+this.porcentagem;
		
		return s;
	}
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(String porcentagem) {
		this.porcentagem = porcentagem;
	}
}
