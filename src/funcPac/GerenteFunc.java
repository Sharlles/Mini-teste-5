package funcPac;

import java.util.ArrayList;
import java.util.List;

public class GerenteFunc {
	private List<Funcionario> funcionarios;
	public GerenteFunc() {
		funcionarios = new ArrayList<Funcionario>();
	}
	public void cadastrarFuncionario(String inf, GeradorDeFuncionario GF) {
		funcionarios.add(GF.gerarFuncionario(inf));
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
