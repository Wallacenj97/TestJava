package br.com.senactestes.mockitoclass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
	
	@Mock
	private ApiDosCorreios apiDosCorreios;
	
	@InjectMocks
	private CadastrarPessoaTeste cadastrarPessoa;
	
	@Test
	void cadastrarPessoa(){
		
		//Dados ficticios do objeto que eu estou mocando
		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP","Atibaia","Rua Antoni Massoni","Casa");
		
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);
		
	}
	
	
	
	
	

}
