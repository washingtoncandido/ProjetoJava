package defaults;

import java.util.List;

public class Biblioteca {
	List<Usuario>listUsuario;
	List<Item>listItem;
	
	public Biblioteca() {}
	public Biblioteca(List<Usuario> listUsuario, List<Item> listItem) {
		super();
		this.listUsuario = listUsuario;
		this.listItem = listItem;
	}
	@Override
	public String toString() {
		return "Bliclioteca [\n listUsuario=" + listUsuario+ 
				",\n listItem=" + listItem + "\n]";
	}

}
