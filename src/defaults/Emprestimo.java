package defaults;

import java.util.Date;

public class Emprestimo {
	
	Usuario usuario;
	Item item;
	Integer qtdRenovado;
	Date dataExpiracao;
	Boolean status;
	
	public Emprestimo(Usuario usuario, Item item, Integer qtdRenovado, Date dataExpiracao, Boolean status) {
		super();
		this.usuario = usuario;
		this.item = item;
		this.qtdRenovado = qtdRenovado;
		this.dataExpiracao = dataExpiracao;
		this.status = status;
	}

	@Override
	public String toString() {
		return " \nEmprestimo[item=" + item + ", qtdRenovado=" + qtdRenovado + ", dataExpiracao="
				+ dataExpiracao + ", status=" + status + "]";
	}




}
