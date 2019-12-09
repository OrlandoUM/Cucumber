package engenhariaSoftware;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import projeto.Principal;

public class TestSteps {
	
	Principal c;
	int x, y;

	@Dado("^que eu escolha somar$")
	public void que_eu_escolha_somar() throws Exception {
		 c = new Principal();
	}

	@Quando("^eu preencho o primeiro numero com o valor '(\\d+)'$")
	public void eu_preencho_o_primeiro_numero_com_o_valor(int arg1) throws Exception {
		x = arg1;
	}

	@Quando("^eu preencho o segundo numero com '(\\d+)'$")
	public void eu_preencho_o_segundo_numero_com(int arg1) throws Exception {
		y = arg1;
	}

	@Entao("^eu devo ver o resultado como '(\\d+)'$")
	public void eu_devo_ver_o_resultado_como(int arg1) throws Exception {
		assertEquals(arg1, c.somar(x, y));
	}
	
}
