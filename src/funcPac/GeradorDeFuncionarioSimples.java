package funcPac;

public class GeradorDeFuncionarioSimples implements GeradorDeFuncionario {

	@Override
	public Funcionario gerarFuncionario(String info) {
		Funcionario f = new Funcionario();
		String[] s = info.split("/");
		f.setNome(s[0]);
		f.setCpf(s[1]);
		f.setCargo(s[2]);
		f.setSalario(s[3]);
		return f;
	}

}
