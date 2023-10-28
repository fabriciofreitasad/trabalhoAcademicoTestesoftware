package application;

import java.util.Scanner;

import entitie.Agenda;
import entitie.AgendaDAO;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AgendaDAO clienteDAO = new AgendaDAO();
		
		Agenda p3 = new Agenda(3, "Evania", "evania@gmail.com", true);
		
		clienteDAO.adcionaContatos(p3);
		
		
		

		
		
		sc.close();

	}

}
