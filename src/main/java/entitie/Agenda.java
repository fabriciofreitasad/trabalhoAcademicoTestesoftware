package entitie;

public class Agenda {
	private Integer id;
	private String name;
	private String email;
	private boolean ativo;

	public Agenda() {

	}

	public Agenda(Integer id, String name, String email, boolean ativo) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Cliente: " 
				+ id 
				+ " name: " 
				+ name 
				+ "\t email: " 
				+ email 
				+ "\t ativo: " 
				+ ativo ;
	}
	
	

}
