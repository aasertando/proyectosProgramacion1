/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicar;

/**
 *
 * @author aser
 */
public class cliente {
    
    int tamClientes;
    private String idCliente [];
    private String nombreCliente [];
    private String direccionCliente [];
    private String telefonoCliente [];

    //constructor
    public cliente(int n) {
        tamClientes = n;
        idCliente = new String [n];
        nombreCliente = new String [n];
        direccionCliente = new String [n];
        telefonoCliente = new String [n];
    }
    
    //getter del tamaño del array
    public int getTamClientes(){
        return tamClientes;
    }
    
    //setter de datos en paralelo
    public void setDatos(int pos, String id, String nombre, String direccion, String telefono){
        idCliente [pos] = id;
        nombreCliente [pos] = nombre;
        direccionCliente [pos] = direccion;
        telefonoCliente [pos] = telefono;
    }
    
    //getter de los array por posicion
    public String getIdCliente(int pos) {
        return idCliente [pos];
    }

    public String getNombreCliente(int pos) {
        return nombreCliente [pos];
    }

    public String getDireccionCliente(int pos) {
        return direccionCliente [pos];
    }

    public String getTelefonoCliente(int pos) {
        return telefonoCliente [pos];
    }
    
    
    
    
    
}
