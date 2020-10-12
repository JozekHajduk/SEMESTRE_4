package Model;

import java.util.ArrayList;

public class Poblacion {

	private ArrayList<Individuo> individuos;
	private int tamanoPoblacion;
	private int numeroHijos;

	public Poblacion(ArrayList<Individuo> individuos, int tamnoPoblacion, int numeroHijos) {
		this.individuos = individuos;
		this.tamanoPoblacion = tamnoPoblacion;
		this.numeroHijos = numeroHijos;
	}

	public Poblacion() {

	}

	public ArrayList<Individuo> getIndividuos() {
		return individuos;
	}

	public void setIndividuos(ArrayList<Individuo> individuos) {
		this.individuos = individuos;
	}

	public int getTamanoPoblacion() {
		return tamanoPoblacion;
	}

	public void setTamanoPoblacion(int tamanoPoblacion) {
		this.tamanoPoblacion = tamanoPoblacion;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
}
