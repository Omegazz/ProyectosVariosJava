/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Burbuja;

/**
 *
 * @author ls60735
 */
public class Burbuja {
    
    /***
     * 
     * @param pcantidadValores
     * @return pcantidadValores
     */
    public int [] OrdenamientoBurbuja (int [] pcantidadValores)
    {
        int aux;
        
        for(int i = 0; i< pcantidadValores.length - 1; i++)
        {
            for(int j=i+1; j< pcantidadValores.length; j++)
            {
                if(pcantidadValores[j] > pcantidadValores[i])
                {
                    aux = pcantidadValores[j];
                    pcantidadValores[j] = pcantidadValores[i];
                    pcantidadValores[i] = aux;
                }
            }
        }
        
        return pcantidadValores;
       
    }
        
}
