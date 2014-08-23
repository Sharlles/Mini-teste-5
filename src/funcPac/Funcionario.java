package funcPac;

public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private String salario;
	
	public boolean equals(Funcionario f2){
		if(
				this.nome.equalsIgnoreCase(f2.getNome()) &&
				this.cpf.equalsIgnoreCase(f2.getCpf()) &&
				this.cargo.equalsIgnoreCase(f2.getCargo()) &&
				this.salario.equalsIgnoreCase(f2.getSalario())
				){
			return true;
		}
		return false;
	}
	public String toString(){
		String s = "";
		s += this.nome;
		s += "/"+this.cpf;
		s += "/"+this.cargo;
		s += "/"+this.salario;
		return s;
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}

}
