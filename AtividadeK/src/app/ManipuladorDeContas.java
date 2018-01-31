package app;

import java.util.Collections;
import java.util.List;

import model.Conta;
import model.Evento;

public class ManipuladorDeContas {
	 public void ordenaLista(Evento evento) {
	       List<Conta> contas = evento.getLista("destino");
	       Collections.sort(contas);
	   }

}
