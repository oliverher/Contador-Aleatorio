package classes;

import java.util.ArrayList;

public class Contador {
	private ArrayList<Integer> numeros;
	private String num;

	public Contador() {
		popular();
	}

	private void popular() {
		numeros = new ArrayList<Integer>(10);
		num = "?";
		for (int i = 1; i <= 10; i=i+1) {
			getNumeros().add(i);
		}
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public void sortear() {
		if (numeros.size() > 0) {
			try {
				int i = (int) Math.round(Math.random() * 10);
				String numero = numeros.get(i).toString();
				numeros.remove(i);
				num = numero;
			} catch (IndexOutOfBoundsException e) {
				sortear();
			}
		} else {
			num = "!";
		}
	}

	public String sorteado() {
		return num;
	}

}
