package br.com.nicolasnsc.cm;

import br.com.nicolasnsc.cm.modelo.Tabuleiro;
import br.com.nicolasnsc.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
		
		
	}
}
