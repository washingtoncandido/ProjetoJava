package defaults;

public class Reserva {
 Usuario usuario;
 Item livro;
 boolean status;
 
public Reserva(Usuario usuario, Item livro, boolean status) {
	super();
	this.usuario = usuario;
	this.livro = livro;
	this.status = status;
}

@Override
public String toString() {
	return " \n Reserva[ livro=" + livro + ", status=" + status + "]\n";
}

//
//@Override
//public String toString() {
//	return "\n Reserva [status=" + status + "]";
//}

}
