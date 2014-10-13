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

/**
 *
 * @author Kevin
 */
public class SplayTreeWord implements WordSet {
    private SplayTree base;
    private int i = 0;
    
    public SplayTreeWord( ) {
        base = new SplayTree();
    }

    @Override
    public void add(Word wordObject) {
        base.insert(wordObject);
        i++;
        
    }

    @Override
    public Word get(Word word) {
        return base.find(word);
    }
    
}
