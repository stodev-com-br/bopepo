package org.jrimum.bopepo.campolivre;

import static org.jrimum.utilix.Objects.exists;

import org.jrimum.domkee.financeiro.banco.febraban.Titulo;
import org.jrimum.vallia.digitoverificador.Modulo;

abstract class AbstractCLUnibanco extends AbstractCampoLivre {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6169577742706045367L;

	protected AbstractCLUnibanco(Integer fieldsLength) {
		super(fieldsLength);
	}

	static CampoLivre create(Titulo titulo)
			throws NotSupportedCampoLivreException {

		if (exists(titulo.getContaBancaria().getCarteira().getTipoCobranca())) {

			switch(titulo.getContaBancaria().getCarteira().getTipoCobranca()){
			case SEM_REGISTRO:
				return new CLUnibancoCobrancaNaoRegistrada(titulo);
			case COM_REGISTRO:
				return new CLUnibancoCobrancaRegistrada(titulo);
			default:
				return null;
			}

		} else {
			throw new NotSupportedCampoLivreException(
					"Campo livre indeterminado, defina o tipo de cobrança para a carteira usada.");
		}
	}

	/**
	 * <p>
	 * Calcula o dígito verificador para
	 * <em>referência do cliente (cobrança sem registro)</em> e base para
	 * cálculo do <em>super dígito do nosso numero (cobrança com registro)</em>.
	 * </p>
	 * 
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param numero
	 * @return String dígito
	 * 
	 * @since 0.2
	 */
	String calculeDigitoEmModulo11(String numero) {

		String dv = "";

		int soma = Modulo.calculeSomaSequencialMod11(numero, 2, 9);

		soma *= 10;

		final int resto = soma % 11;

		if (resto == 10 || resto == 0)
			dv = "0";
		else
			dv = "" + resto;

		return dv;

	}

}