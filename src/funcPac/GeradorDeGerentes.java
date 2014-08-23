package funcPac;

public class GeradorDeGerentes implements GeradorDeFuncionario {

	@Override
	public Funcionario gerarFuncionario(String info) {
		Gerente f = new Gerente();
		String[] s = info.split("/");
		f.setNome(s[0]);
		f.setCpf(s[1]);
		f.setCargo(s[2]);
		f.setSalario(s[3]);
		f.setSetor(s[4]);
		f.setPorcentagem(s[5]);
		return f;
		
	}

}
