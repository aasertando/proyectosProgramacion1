/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areglosmetodos;

/**
 *
 * @author aser
 */
public class clase1 {
    
    private int tamaño;
    private String lista[];
    
    public clase1 (int tam){
        tamaño = tam;
        lista = new String[tam];
    }
    
    public int getTamaño(){
        return tamaño;
    }

    public void setNombre(int posicion, String nombre) {
        lista [posicion] = nombre;
    }
    
    public String getArray(int pos){
        return lista [pos];
    }
    
    
}