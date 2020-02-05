package model.logic;

import model.data_structures.ListaEncadenada;
import model.data_structures.Nodo;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo<T extends Comparable<T>> {
	/**
	 * Atributos del modelo del mundo
	 */
	private ListaEncadenada <T> datos;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ListaEncadenada();
	}
	

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(T dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public T buscar(Integer i)
	{
		return datos.buscar(i);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public T eliminar(Integer i)
	{
		return datos.eliminar(i);
	}


}
