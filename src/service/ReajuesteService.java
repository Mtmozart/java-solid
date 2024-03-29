package service;

import java.math.BigDecimal;
import java.util.List;

import model.Funcionario;

public class ReajuesteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	

	public ReajuesteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}



	public void reajusteSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));

	
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		
		funcionario.atualizarSalario(salarioReajustado);

	}

}
