/***********************************
* Autor: Diego Salas
* Archivo: Algoritmos de ordenamiento
* Fecha creacion: 25/01/2014
* Última modificacion: 27/01/2014
***********************************/

package Seleccion;

/**
 *
 * @author ls60735
 */
public class Seleccion {
    
    public int [] OrdenamientoSeleccion(int [] pcantidadValores)
    {
        
    	for (int i = 0; i < pcantidadValores.length - 1; i++)
        {
                int min = i;
                for (int j = i + 1; j < pcantidadValores.length; j++)
                {
                        if (pcantidadValores[j] < pcantidadValores[min])
                        {
                                min = j;
                        }
                }
                if (i != min) 
                {
                        int aux= pcantidadValores[i];
                        pcantidadValores[i] = pcantidadValores[min];
                        pcantidadValores[min] = aux;
                }
        }
    	return pcantidadValores;
    }
    
    
}
