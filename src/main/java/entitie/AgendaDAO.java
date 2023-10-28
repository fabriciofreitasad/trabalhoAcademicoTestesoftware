package entitie;

import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {

	List<Agenda> client = new ArrayList<>();

	
	public void exibirContatos() {
	    for (Agenda cliente : this.client) {
	        System.out.println(cliente);
	    }
	}
	
	

	public void adcionaContatos(Agenda client) {
		this.client.add(client);
	}

	public Agenda pesquisa(int id) {
		for (Agenda list : this.client) {
			if (list.getId() == id) {
				return list;
			}
		}
		return null;
	}
	
	public void pesquisarEExibir(int id) {
	    Agenda cliente = pesquisa(id);
	    if (cliente != null) {
	        System.out.println(cliente);
	    } else {
	        System.out.println("Cliente não encontrado.");
	    }
	}

	public boolean removeContatos(int id) {
		for (int i = 0; i < this.client.size(); i++) {
			if (this.client.get(i).getId() == id) {
				this.client.remove(i);
				return true;
			}
		}
		return false;
	}

	public int qtdContatos() {
		return this.client.size();
	}

	public void removeTodosContatos() {
		this.client.clear();
	}

}
