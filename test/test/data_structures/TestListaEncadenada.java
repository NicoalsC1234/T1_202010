package test.data_structures;

import model.data_structures.ListaEncadenada;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestListaEncadenada <T extends Comparable <T>>{

	private ListaEncadenada listaEncadenada;
	
	private static int TAMANO=100;	@Before
	public void setUp1() {
		listaEncadenada = new ListaEncadenada<T>();
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			listaEncadenada.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		setUp1();
		assertTrue(arreglo.darCapacidad() == TAMANO);
	}

	@Test
	public void testDarElemento() {
		setUp1();
		setUp2();
		for (int i = 0; i < TAMANO*2; i++) {
			assertEquals(i, arreglo.darElemento(i));
		}
		// TODO
		
	}

}
