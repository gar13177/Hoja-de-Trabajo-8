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

    public Word get(Word word)
    {
        Integer[] mapKeys = new Integer[base.size()];
        int pos = 0;
        for(Integer key : base.keySet()){
            mapKeys[pos++] = key;
        }
        int index = base.indexOf(word);
        if(index == -1) return null;
        return base.get(index);
    }

    public void add(Word wordObject)
    {
        base.add(wordObject);
    }
    
}
