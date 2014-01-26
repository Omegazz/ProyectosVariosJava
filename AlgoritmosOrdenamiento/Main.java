/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ls60735
 */

//Imports de Java necesarios
import java.io.*;

//Paquetes necesarios
import Burbuja.Burbuja;
import Insercion.Insercion;
import Seleccion.Seleccion;
import QuickSort.QuickSort;
import MergeSort.MergeSort;

public class Main {
    
    /***
     * 
     * @param args 
     */
    //Input y output
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out; 
    
    //Objetos a utilizar
    public static Burbuja b;
    public static Insercion ins;
    public static Seleccion sel;
    public static QuickSort qui;
    public static MergeSort mer;
    
    public static void main(String args[]) throws IOException
    {
        //Inicializacion de las variables
        b= new Burbuja();
        ins= new Insercion();
        sel= new Seleccion();
        qui= new QuickSort();
        mer= new MergeSort();
        
        int opc;
        boolean noSalir = true;
        String[] listaMenu={"1. Ordenamiento Burbuja",
                            "2. Ordenamiento Insercion",
                            "3. Ordenamiento Seleccion",
                            "4. Ordenamiento QuickSort",
                            "5. Ordenamiento MergeSort",
                            "6. Salir"
                            };

        do{
            mostrarMenu(listaMenu);
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        }while (noSalir);
    }
    
    static void mostrarMenu(String[] plista)
    {

        out.println();

        for(int i=0;i<plista.length;i++){
                out.println(plista[i]);
        }
        out.println();
    }
    
    static int leerOpcion()throws java.io.IOException
    {

        int opcion;

        out.print("Seleccione su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
	
    }
    
    /***
     * 
     * @param popcion
     * @return
     * @throws java.io.IOException 
     */
    static boolean ejecutarAccion(int popcion)throws java.io.IOException
    {
        boolean noSalir = true;
        
        //Arreglo con valores predefinidos
        //Nota: Se puede crear un método donde el usuario manualmente ingrese
        //los valores
        int [] valores = {4,5,6,1,1,2,4,56,6,45,1,2,10,100,45,2,31,7};
        
        //Arreglo que me almacena el listado de valores ordenados
        int [] lista;
        
        switch(popcion)
        {
        	//Burbuja
            case 1:
                lista = b.OrdenamientoBurbuja(valores);
                imprimirResul(lista);
                break;
            //Insercion    
            case 2:
                lista = ins.OrdenamientoInsercion(valores);
                imprimirResul(lista);
                break;
            //Seleccion    
            case 3:
            	lista = sel.OrdenamientoSeleccion(valores);
            	imprimirResul(lista);
            	break;
            //QuickSort	
            case 4:
            	lista = qui.OrdenamientoQuickSort(valores);
            	imprimirResul(lista);
            	break;
            //MergeSort	
            case 5:
            	lista = mer.OrdenamientoQuickSort(valores);
            	imprimirResul(lista);
            	break;
            	
            //Salir	
            case 6:
                noSalir=false;
                break;
        }
        
        return noSalir;
        
    }
    
    /***
     * 
     * @param plistado 
     */
    public static void imprimirResul(int [] plistado)
    {
        out.println("Listado de forma ordenada");
        out.println("++++++++++++++++++++++++++");
        for(int i= 0; i< plistado.length; i++)
        {
            out.println(plistado[i]);
        }
    }
    
}



