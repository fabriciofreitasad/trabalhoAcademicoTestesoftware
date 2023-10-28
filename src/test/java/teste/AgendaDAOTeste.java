package teste;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entitie.Agenda;
import entitie.AgendaDAO;

public class AgendaDAOTeste {
	Agenda agenda = new Agenda();
	AgendaDAO agendaDAO = new AgendaDAO();

	@Before
	public void todosClientes() {

		// Criacao de cenarios
		System.out.println("Todos clientes:");
		Agenda p1 = new Agenda(1, "Fabricio", "fabricio@gmail.com", true);
		Agenda p2 = new Agenda(2, "Matheus", "matheus@gmail.com", true);
		Agenda p3 = new Agenda(3, "Guilherme", "guilherme@gmail.com", true);

		agendaDAO.adcionaContatos(p1);
		agendaDAO.adcionaContatos(p2);
		agendaDAO.adcionaContatos(p3);
		
		agendaDAO.exibirContatos();
		System.out.println("\n");

	}
	
	@After
	public void deposCenario() {
		this.agendaDAO.removeTodosContatos();
		System.out.println("Remove todos client");
	}

	@Test
	public void testPesquisa() {

		// Executar teste

		Agenda agenda = agendaDAO.pesquisa(1);
		System.out.println("Cliente pesquisado");
		agendaDAO.pesquisarEExibir(1);

		Agenda contatosNull = agendaDAO.pesquisa(5);

		// Avaliar os resultados do teste (asserções)
		assertThat("Cliente não localizado",agenda.getId(), is(1));
		assertThat("Nome não encontrado na base de DADOS",agenda.getName(), is("Fabricio"));
		assertThat("Email não encontrado na base de DADOS",agenda.getEmail(), is("fabricio@gmail.com"));
		assertNull(contatosNull);
		System.out.println("\n");
		
	}

	@Test
	public void testRemove() {

		// Executar teste
		Agenda contatosAntesRemover = agendaDAO.pesquisa(2);
		int qtdAntesRemover = agendaDAO.qtdContatos();

		boolean removido = agendaDAO.removeContatos(2);
		int qtdDepoisRemover = agendaDAO.qtdContatos();

		Agenda contatosDepoisRemover = agendaDAO.pesquisa(2);

		// Avaliar os resultados do teste (asserções)
		assertThat(contatosAntesRemover.getId(), is(2));
		assertThat(removido, is(true));
		assertThat(qtdAntesRemover, is(2));
		assertThat(qtdDepoisRemover, is(1));
		assertNull(contatosDepoisRemover);

		System.out.println("testRemove" );
		
	}

}
