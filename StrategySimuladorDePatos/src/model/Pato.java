package model;

import IComportamentoVoo.ComportamentoVoo;
import IcomportamentoSom.ComportamentoSom;

public class Pato {
	public ComportamentoSom cS;
	public ComportamentoVoo cV;
	
	public void nadar( ) {
		System.out.println("Nadando...");
	}
	
	public void exibir() {
		System.out.println("Sou um pato...");
	}
}
