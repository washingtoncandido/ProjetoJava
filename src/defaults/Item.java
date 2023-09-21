package defaults;

import java.util.Date;
import java.util.List;

public class Item {
	Integer id;
	String nome;
	String autores;
	Date ano;
	Double penalidadeAtraso;
	Date tempoReserva;
	List<Emprestimo> listaEmprestimo;
	List<Reserva> listReversa;
	
	public Item(Integer id, String nome, String autores, Date ano, Double penalidadeAtraso, Date tempoReserva,
			List<Emprestimo> listaEmprestimo, List<Reserva> listReversa) {
		super();
		this.id = id;
		this.nome = nome;
		this.autores = autores;
		this.ano = ano;
		this.penalidadeAtraso = penalidadeAtraso;
		this.tempoReserva = tempoReserva;
		this.listaEmprestimo = listaEmprestimo;
		this.listReversa = listReversa;
	}
	@Override
	public String toString() {
		return "Item[ id=" + id + ", nome=" + nome + ", autores=" + autores + ", ano=" + ano + ", penalidadeAtraso="
				+ penalidadeAtraso + ", tempoReserva=" + tempoReserva +"]";
	}
	
	
	
}
