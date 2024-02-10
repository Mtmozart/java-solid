package service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Funcionario;
import validations.ValidacaoException;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {

		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		Long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoReajuste  < 6) {
			throw new ValidacaoException("O intervalo entre reajustes deve ser de no mínimo 06 seis meses.");
		
		}
	}

}
