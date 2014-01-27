/***********************************
* Autor: Diego Salas
* Archivo: Algoritmos de ordenamiento
* Fecha creacion: 25/01/2014
* Última modificacion: 27/01/2014
***********************************/

package QuickSort;

public class QuickSort {
	
	
	public int [] OrdenamientoQuickSort(int [] pcantidadValores)
	{
		return OrdenamientoQuickSort(pcantidadValores,0,pcantidadValores.length-1);
	}
	
	public int [] OrdenamientoQuickSort(int [] pcantidadValores, int pizq, int pder)
	{
		if(pizq>=pder)
		{
			return pcantidadValores;
		}
			
			
		int i=pizq,d=pder;
		if(pizq!=pder)
		{
			
			//Pivote Centro de pila
			int pivote;
			int aux;
			pivote = pizq;
			
			while(pizq!=pder)
			{
				while(pcantidadValores[pder]>=pcantidadValores[pivote] && pizq<pder)
				pder--;
				while(pcantidadValores[pizq]<pcantidadValores[pivote] && pizq<pder)
	
				pizq++;
				if(pder!=pizq) 
				{
					aux = pcantidadValores[pder];
					pcantidadValores[pder]= pcantidadValores[pizq];
					pcantidadValores[pizq]=aux;
				}
			}
			if(pizq==pder)
			{
				OrdenamientoQuickSort(pcantidadValores,i,pizq-1);
				OrdenamientoQuickSort(pcantidadValores,pizq+1,d);
			}
		}
		else
		{
			return pcantidadValores;
		}
		
		return pcantidadValores;

	}
	
	
}
