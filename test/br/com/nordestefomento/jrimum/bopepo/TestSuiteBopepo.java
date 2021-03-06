/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 18:12:28
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 18:12:28
 * 
 */


package br.com.nordestefomento.jrimum.bopepo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.nordestefomento.jrimum.bopepo.campolivre.TestAbstractCLBancoSafra;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBancoDoBrasilNN11;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBancoDoBrasilNN17;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBancoReal;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBanestes;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBanrisulCobrancaNaoRegistrada;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBanrisulCobrancaRegistrada;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLBradesco;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLCaixaEconomicaFederalSINCO;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLItauComCarteirasEspeciais;
import br.com.nordestefomento.jrimum.bopepo.campolivre.TestCLItauPadrao;


@RunWith(Suite.class)
@Suite.SuiteClasses
( 
		{ 
			TestBoleto.class,
			TestViewPDF.class,
			TestCodigoDeBarras.class,
			TestBancoSuportado.class,
			TestLinhaDigitavel.class,
			TestAbstractCLBancoSafra.class,
			TestCLBancoDoBrasilNN11.class,
			TestCLBancoDoBrasilNN17.class,
			TestCLBancoReal.class,
			TestCLBradesco.class,
			TestCLCaixaEconomicaFederalSINCO.class,
			TestCLItauPadrao.class,
			TestCLItauComCarteirasEspeciais.class,
			TestCLBanrisulCobrancaRegistrada.class,
			TestCLBanrisulCobrancaNaoRegistrada.class,
			TestCLBanestes.class
		}
)
public class TestSuiteBopepo {

	/*
	 * The class remains completely empty, being used only as a holder for the
	 * above annotations
	 */
}
