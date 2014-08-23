package funcPac;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class FuncTest {
	private GerenteFunc GF;
	@Before
	public void criarGerenteFunc(){
		GF = new GerenteFunc();
	}
	
	@Test
	public void CadastrarFuncionarioNormal() {
		String informs = "josé sharlles/11111111111/analista/1500";
		GF.cadastrarFuncionario(informs,new GeradorDeFuncionarioSimples());
		Assert.assertEquals(1, GF.getFuncionarios().size());
		Assert.assertEquals(informs, GF.getFuncionarios().get(0).toString());
		
		String informs2 = "joana/3333333333/faxineira/724";
		GF.cadastrarFuncionario(informs2,new GeradorDeFuncionarioSimples());
		Assert.assertEquals(2, GF.getFuncionarios().size());
		Assert.assertEquals(informs2, GF.getFuncionarios().get(1).toString());
	}
	@Test
	public void CadastrarGerente(){
		String informs = "joão silva/00000000000/gerente/5000/informática/2";
		GF.cadastrarFuncionario(informs, new GeradorDeGerentes());
		Assert.assertEquals(1, GF.getFuncionarios().size());
		Assert.assertEquals(informs, GF.getFuncionarios().get(0).toString());
		
		String informs2 = "maria/22222222222/gerente/7000/RH/3";
		GF.cadastrarFuncionario(informs2, new GeradorDeGerentes());
		Assert.assertEquals(2, GF.getFuncionarios().size());
		Assert.assertEquals(informs2, GF.getFuncionarios().get(1).toString());
	}

}
