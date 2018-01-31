package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;


public class TestaPerfomace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }

	}


