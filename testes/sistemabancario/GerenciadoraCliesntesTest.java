package sistemabancario;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


/**
 * Classe de teste para testar operacoes de {@link GerenciadoraClientes}
 * @author 36124872021.2N
 *
 */
public class GerenciadoraCliesntesTest {
	
	private GerenciadoraClientes gerCliente;
	/**
	 * Teste unitario basico de pesquisa cliente a partir do seu ID
	 */
	@Test
	public void testPesquisaCliente() {
		//Criacao do cenario
		Cliente cliente01 = new Cliente(1, "Joao", 46, "joa@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Maria", 11, "maria@gmail.com", 2, true);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		gerCliente = new GerenciadoraClientes(clientes);
		
		//execucao do teste
		Cliente cliente =gerCliente.pesquisaCliente(1);
		
		//verificao do resultado
		assertThat(cliente.getId(), is(1));
		
		
	}
}
