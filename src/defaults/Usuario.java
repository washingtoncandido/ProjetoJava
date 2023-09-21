package defaults;

import java.util.List;

public class Usuario {
	String nome;
	String login;
	String senha;
	Integer maxEmprestimos;
	List<Emprestimo> listaEmprestimos;
	List<Reserva> listaReservas;
	
	public Usuario() {}
	
	public Usuario(String nome, String login, String senha, Integer maxEmprestimos) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.maxEmprestimos = maxEmprestimos;
	}
	public Usuario(String nome, String login, String senha, Integer maxEmprestimos, List<Emprestimo> listaEmprestimos,
			List<Reserva> listaReservas) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.maxEmprestimos = maxEmprestimos;
		this.listaEmprestimos = listaEmprestimos;
		this.listaReservas = listaReservas;
	}
	@Override
	public String toString() {
		return " \n Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + ", maxEmprestimos=" + maxEmprestimos
				+ ", listaEmprestimoss=" + listaEmprestimos + ", listaReservas=" + listaReservas + "]";
	}
	

}
