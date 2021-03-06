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

public class RedBlackBST implements WordSet {
    /**
     * Construct the tree.
     */
    private RBTree<Integer,Word> base;
    private int i = 0;
    
    public RedBlackBST( ) {
        base = new RBTree<Integer,Word>();
    }

    @Override
    public void add(Word wordObject) {
        base.insert(i,wordObject);
        i++;
        
    }

    @Override
    public Word get(Word word) {
        for (int j=0;j<i;j++){
            Word temp = base.lookup(j);
            if (temp.equals(word)) return temp;
        }
        return null; 
    }
      
}