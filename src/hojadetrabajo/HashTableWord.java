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

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Kevin
 */
public class HashTableWord implements WordSet{
    private Hashtable<Integer,Word> base;
    private int i = 0;
	
    public HashTableWord()
    {
        base = new Hashtable<>();
    }    

    @Override
    public void add(Word wordObject) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        base.put(i,wordObject);
        i++;
    }

    @Override
    public Word get(Word word) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Iterator<Integer> it = base.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            if (base.get(key).equals(word)) return base.get(key);
        }
        return null;        
    }
    
}
