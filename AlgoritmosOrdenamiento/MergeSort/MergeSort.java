package MergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static int [] listaOrdenada;
	
	public int [] OrdenamientoQuickSort (int [] pcantidadValores)
	{
		Ordenamiento(pcantidadValores);
		return listaOrdenada;
	}
	
	public void Ordenamiento(int [] pcantidadValores)
	{
		final int N = pcantidadValores.length;
		
        if(N<=1) 
        {
        	return;
        }
        
        int mitad=N/2;
        int[] izq = Arrays.copyOfRange(pcantidadValores, 0, mitad);
        int[] der = Arrays.copyOfRange(pcantidadValores, mitad, N);
        
        Ordenamiento(izq);
        Ordenamiento(der);
        CombinarMergeSort(pcantidadValores, izq, der);
        
	}
 
    public void CombinarMergeSort(int[] plistado, int[] pizq, int[] pder) {
        int i = 0;
        int j = 0;
        
        for(int k=0; k<plistado.length;k++) 
        {
            if(i>=pizq.length) 
            {
            	plistado[k]=pder[j++]; 
            	continue; 
            }
            
            if(j>=pder.length) 
            { 
            	plistado[k]=pizq[i++]; 
            	continue; 
        	}
            
            plistado[k]=(pizq[i]<pder[j])?pizq[i++]:pder[j++];
        }
        listaOrdenada = plistado;
    }
	
}
