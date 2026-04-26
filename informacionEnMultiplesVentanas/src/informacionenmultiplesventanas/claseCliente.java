/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacionenmultiplesventanas;

/**
 *
 * @author aser
 */
public class claseCliente {

    int tamArrCliente;
    private String nombreCliente [];
    private String idCliente [];
    private int dineroCliente [];
    
    //se inicializan todos los arrays contenedores de la info
    public claseCliente(int n) {
        
        tamArrCliente = n;
        nombreCliente = new String[n];
        idCliente = new String[n];
        dineroCliente = new int[n];
        
    }
    
    //getter del tamaño del array
    public int getTamCliente (){
        return tamArrCliente;
    }
    
    //establecer los datos
    public void setDatosCliente (int pos, String nombre, String id, int dinero){
        
        nombreCliente [pos] = nombre;
        idCliente [pos] = id;
        dineroCliente [pos] = dinero;
        
    }
    
    //getter de todas las variables por posicion
    public String getNombreCliente (int pos){
        return nombreCliente[pos];
    }
    
    public String getIdCliente (int pos){
        return idCliente[pos];
    }
    
    public int getDineroCliente (int pos){
        return dineroCliente[pos];
    }
    
    
    
}
