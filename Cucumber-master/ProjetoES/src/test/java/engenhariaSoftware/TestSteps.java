package engenhariaSoftware;

import static org.junit.Assert.assertEquals;
import java.util.*;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import projeto.Principal;

public class TestSteps {
	
	@Dado("^Perfil$")
	public void perfil() throws Exception {
		System.out.println("\tCriando perfil ...");
	}

	@Quando("^obter informacoes do usuario$")
	public void obter_informacoes_do_usuario() throws Exception {
		System.out.println("\tObtendo informacoes do usuario ...");
	}

	@Quando("^utilizar essas informacoes em outras atividades do sistema$")
	public void utilizar_essas_informacoes_em_outras_atividades_do_sistema() throws Exception {
		System.out.println("\tObtendo informacoes do usuario ...");
	}

	@Entao("^visar melhor experiencia para o usuario$")
	public void visar_melhor_experiencia_para_o_usuario() throws Exception {
		System.out.println("\tMelhorando experiencia para o usuario ...");
	}
	
	@Dado("^Pagina$")
	public void pagina() throws Exception {
		System.out.println("\tCriando pagina ...");
	}

	@Quando("^oferecer informacoes sobre algo ou alguem$")
	public void oferecer_informacoes_sobre_algo_ou_alguem() throws Exception {
		System.out.println("\tObtendo informacoes da pagina ...");
	}

	@Entao("^utilizar dessas informacoes visando a divulgacao, propaganda ou influencia digital$")
	public void utilizar_dessas_informacoes_visando_a_divulgacao_propaganda_ou_influencia_digital() throws Exception {
		System.out.println("\tDivuldando informacoes ...");
	}
	
	@Dado("^Feed de noticias$")
	public void feed_de_noticias() throws Exception {
		System.out.println("\tCriando feed de noticias ...");
	}

	@Quando("^reunir noticias, eventos, pensamentos e acontecimentos de usuarios$")
	public void reunir_noticias_eventos_pensamentos_e_acontecimentos_de_usuarios() throws Exception {
		System.out.println("\tObtendo publicacoes ...");
	}

	@Entao("^promover a facilidade das divulgacoes$")
	public void promover_a_facilidade_das_divulgacoes() throws Exception {
		System.out.println("\tMostrando publicacoes ...");
	}
	
	@Dado("^Grupo$")
	public void grupo() throws Exception {
		System.out.println("\tCriando grupo ...");
	}

	@Quando("^reunir usuarios especificos com determinados objetivos$")
	public void reunir_usuarios_especificos_com_determinados_objetivos() throws Exception {
		System.out.println("\tExpandindo grupo ...");
	}

	@Entao("^promover rapidas discussoes dos temas abordados$")
	public void promover_rapidas_discussoes_dos_temas_abordados() throws Exception {
		System.out.println("\tCriando conteudo ...");
	}

	
}
