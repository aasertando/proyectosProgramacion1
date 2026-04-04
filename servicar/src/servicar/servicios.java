/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicar;

/**
 *
 * @author aser
 */
public class servicios {
    
    private int tamServicio;
    private String [] idServicio;
    private String [] descripcionServicio;
    private int [] valorServicio;
    
    public servicios(int n){
        tamServicio = n;
        idServicio = new String [n];
        descripcionServicio = new String [n];
        valorServicio = new int [n];
    }
    
    public int getTamServicio(){
        return tamServicio;
    }
    
    public void setDatos(int pos, String id, String descripcion, int valor){
        idServicio [pos] = id;
        descripcionServicio [pos] = descripcion;
        valorServicio [pos] = valor;
    }

    public String getIdServicio(int pos) {
        return idServicio [pos];
    }

    public String getDescripcionServicio(int pos) {
        return descripcionServicio [pos];
    }

    public int getValorServicio(int pos) {
        return valorServicio [pos];
    }
    
}
