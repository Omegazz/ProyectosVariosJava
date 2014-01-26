/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
