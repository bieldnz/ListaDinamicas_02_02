package view;

import ControllerLista.Lista;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		
		Lista<Integer> lista = new Lista<Integer>();
		
		lista.addLast(10);
		lista.addLast(5);
		lista.addLast(8);
		lista.addLast(1);
		lista.addLast(9);
		lista.addLast(2);
		lista.addLast(4);
		lista.addLast(7);
		lista.addLast(3);
		lista.addLast(6);
		
		for(int x = 0; x < lista.size(); x++) {
			for(int y = x + 1; y < lista.size(); y++) {
				if(lista.get(x) > lista.get(y)) {
					int aux = lista.get(y);
					lista.add(lista.get(x), y);
					lista.remove(y + 1);
					lista.add(aux, x + 1);
					lista.remove(x);
				}
			}
		}
		
		for(int x = 0; x < lista.size(); x++) {
			System.out.println(lista.get(x));
		}
		
	}
	
}
