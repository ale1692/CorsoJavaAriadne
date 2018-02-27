package it.ariadne.shape;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	List <Forma> forme = new ArrayList<>();

	public void add(Forma f) {
		forme.add(f);
	}
	
	public int getSize() {
		//return 0;
		int totalNumber = 0;
		totalNumber += forme.size();
		return totalNumber;
	}

	public double calcolaPerimetro() {
		double perimetroTotale = 0d;
		for (Forma forma : forme){
			perimetroTotale += forma.calcolaPerimetro();
		}
		return perimetroTotale;
	}
	
	public double calcolaArea() {
		double areaTotale = 0d;
		for (Forma forma : forme){
			areaTotale += forma.calcolaArea();
		}
		return areaTotale;
	}
}