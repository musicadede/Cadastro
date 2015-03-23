package clientes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
	
	private static  List<Cliente> clientes = new ArrayList<Cliente>();

	public void salvarCliente(Cliente cliente){
		clientes.add(cliente);
	}
	
	public static List<Cliente> getClientes() {
		return clientes;
	}
	
	public void excluirCliente (String nome){
		
		for(Cliente c: clientes){
			if(c.getNome().toString().equals(nome)){
				clientes.remove(c);
			}
		}
	}
	
}
