/*
 * Universidad del Valle de Guatemala 2014
 * Algoritmos y Estructuras de Datos
 * Seccion No. 10
 * 
 * Hoja de Trabajo No. 8
 * 
 * Implementacion de mapeo
 * 
 * Integrantes:
 * 13023 Vidal Villegaz Zabala
 * 13077 Luis Eduardo Avila Cruz
 * 13177 Kevin Estuardo Garcia Guerra
 */
package hojadetrabajo;

import java.util.TreeMap;

/**
 *
 * @author Kevin
 */
public class TreeMapWord implements WordSet {
    private TreeMap<Integer,Word> base;
	
    public TreeMapWord()
    {
        base = new TreeMap<>();
    }    

    @Override
    public void add(Word wordObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Word get(Word word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
