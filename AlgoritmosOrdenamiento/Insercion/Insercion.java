/***********************************
* Autor: Diego Salas
* Archivo: Algoritmos de ordenamiento
* Fecha creacion: 25/01/2014
* Última modificacion: 27/01/2014
***********************************/

package Insercion;

/**
 *
 * @author ls60735
 */
public class Insercion {
    
    public int [] OrdenamientoInsercion(int [] pcantidadValores)
    {
        int key, i;
        
         for(int j=1 ; j<pcantidadValores.length ; j++)
         {
            key = pcantidadValores[j];
            i = j-1;
            //Inserta pcantidadValores[j] en la ya ordenada
            while(i >= 0 && pcantidadValores[i]>key)
            {
                pcantidadValores[i+1]= pcantidadValores[i];
                i--;
            }
            pcantidadValores[i+1] = key;
        }
         
        return pcantidadValores;
    }
}
