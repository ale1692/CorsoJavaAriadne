package it.ariadne.test.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.shape.Canvas;
import it.ariadne.shape.Cerchio;
import it.ariadne.shape.Dodecagono;
import it.ariadne.shape.Punto;
import it.ariadne.shape.Quadrato;

public class TestCanvas {

	private Canvas canvas;
	private Quadrato q;
	private Cerchio c;
	private Dodecagono d12;
	
	@Before
	public void setup() {
	canvas = new Canvas();
	Punto p = new Punto(12, 31);
	int lato = 2;
	int raggio = 2;
	int latod = 4;
	int apot = 1;
	q = new Quadrato(p, lato);
	c = new Cerchio(p, raggio);
	d12 = new Dodecagono(p, latod, apot);
	
	canvas.add(q);
	canvas.add(c);
	canvas.add(d12);
	}
	
	@Test
	public void dimensionCanvas() {
		
		int canvasSize = canvas.getSize();
		Assert.assertEquals("Il canvas contiene tre forme", canvasSize, 3);
	}
	
	@Test
	public void controlloPerimetri(){
		
		double pquad = q.calcolaPerimetro();
		double pcerchio= c.calcolaPerimetro();
		double pdodec = d12.calcolaPerimetro();
		
		double perimetroTotale = canvas.calcolaPerimetro();
		
		Assert.assertEquals("La somma dei perimetri", perimetroTotale, pquad + pcerchio + pdodec, 0);
	}

	@Test
	public void controlloAree(){
		
		double aquad = q.calcolaArea();
		double acerchio= c.calcolaArea();
		double adodec = d12.calcolaArea();
		
		double areaTotale = canvas.calcolaArea();
		
		Assert.assertEquals("La somma delle aree", areaTotale, aquad + acerchio + adodec, 0);
	}
}
