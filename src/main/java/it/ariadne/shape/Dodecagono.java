package it.ariadne.shape;

public class Dodecagono implements Forma{
	Punto p;
	int lato;
	int apotema;
	
	public Dodecagono (Punto p, int lato, int apotema){
		this.p = p;
		this.lato = lato;
		this.apotema = apotema;
	}
	
	public double calcolaPerimetro (){
		return 12*this.lato;
	}

	public double calcolaArea(){
		return this.calcolaPerimetro()*this.apotema*0.5;
	}

}
