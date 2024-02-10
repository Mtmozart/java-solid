package promocao;

import model.Cargo;
import model.Funcionario;
import validations.ValidacaoException;

public class promocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		
		if(cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException ("Gerente não pode ser promovido");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		}else {
			throw new ValidacaoException ("Não pode ser promovido porque a meta não foi alcançada.");
		}
	}
}
