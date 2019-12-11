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

	@Entao("^promover a facilidade e a propagacao das divulgacoes$")
	public void promover_a_facilidade_e_a_propagacao_das_divulgacoes() throws Exception {
		System.out.println("\tDivulgar publicacoes ...");
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
	
	@Dado("^Postagem$")
	public void postagem() throws Exception {
		System.out.println("\tCriando Postagem ...");
	}

	@Quando("^divulgar noticias, eventos, marcas, acontecimentos ou ideias dos usuarios$")
	public void divulgar_noticias_eventos_marcas_acontecimentos_ou_ideias_dos_usuarios() throws Exception {
		System.out.println("\tDivulgando conteudo ...");
	}
	
	@Entao("^promover os objetivos dos usuarios$")
	public void promover_os_objetivos_dos_usuarios() throws Exception {
		System.out.println("\tRecebendo feedback ...");
	}
	
	@Dado("^Mensagem Direta$")
	public void mensagem_Direta() throws Exception {
		System.out.println("\tCriando Mensagem Direta ...");
	}

	@Quando("^oferecer uma maneira com que usuarios troquem mensagens$")
	public void oferecer_uma_maneira_com_que_usuarios_troquem_mensagens() throws Exception {
		System.out.println("\tEnviar Mensagem Direta ...");
	}

	@Entao("^garantir total privatizacao nas conversas$")
	public void garantir_total_privatizacao_nas_conversas() throws Exception {
		System.out.println("\tPromover uma conversa privada ...");
	}
	
	@Dado("^Amigo$")
	public void amigo() throws Exception {
		System.out.println("\tExplorando novos amigos ...");
	}

	@Quando("^conectar com varios perfis$")
	public void conectar_com_varios_perfis() throws Exception {
		System.out.println("\tConectando a um novo amigo ...");
	}

	@Entao("^promover o alcance de novas conexoes$")
	public void promover_o_alcance_de_novas_conexoes() throws Exception {
		System.out.println("\tObtendo nova conexao ...");
	}
	
	@Dado("^Notificacao$")
	public void notificacao() throws Exception {
		System.out.println("\tCriar notificacao ...");
	}

	@Quando("^quaisquer acoes ou eventos de interesse do usuario$")
	public void quaisquer_acoes_ou_eventos_de_interesse_do_usuario() throws Exception {
		System.out.println("\tPreencher notificacao ...");
	}

	@Entao("^alertar$")
	public void alertar() throws Exception {
		System.out.println("\tMostrar notificacao ...");
	}
	
}
