package defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Date tempoRerva = new Date();
		Date ano = new Date();
		Date dataExpiracao = new Date();
		List<Emprestimo> listEmprestimoWashington = new ArrayList();
		List<Emprestimo> listEmprestimoCaio = new ArrayList();
		List<Usuario> listUser = new ArrayList();
		List<Item> listItem = new ArrayList();
		List<Reserva> listaReservas =  new ArrayList();
		
		
		
		Usuario washington = new Usuario("Washington candido dos santos da silva", "Sthig", "Washignton@", 0,listEmprestimoWashington,listaReservas);
		Usuario caio = new Usuario("Caio santos da silva", "Sthig", "Washignton@", 0,listEmprestimoCaio,listaReservas);
		

		Item harryPotter = new Item(1,"Harry Potter e a Pedra Filosofal"," J. K. Rowling",ano,12.2,tempoRerva,listEmprestimoWashington,listaReservas);
		Item harryPotter2 = new Item(2,"Harry Potter e o baselisco"," J. K. Rowling",ano,100.2,tempoRerva,listEmprestimoWashington,listaReservas);
		
		Reserva washingtonReserva = new Reserva(washington,harryPotter,true);
		listaReservas.add(washingtonReserva);
		
		Emprestimo washingtonEmprestimo = new Emprestimo(washington, harryPotter2, 1, dataExpiracao, true);
		Emprestimo emprestimoDeWashington = new Emprestimo(washington,harryPotter,1,dataExpiracao,true);
		
		Emprestimo emprestimoDeCaio = new Emprestimo(caio,harryPotter,1,dataExpiracao,true);
	
		listEmprestimoWashington.add(emprestimoDeWashington);
		listEmprestimoWashington.add(washingtonEmprestimo);
		
		listEmprestimoCaio.add(emprestimoDeCaio);
		
		listItem.add(harryPotter);
		listUser.add(washington);
		listUser.add(caio);
		listItem.add(harryPotter2);
		
		Biblioteca FicrBlibioteca = new Biblioteca(listUser,listItem);
		
		System.out.println(FicrBlibioteca);
	
	
	}

}
