/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicar;

/**
 *
 * @author aser
 */
public class vehiculo {
    
    private int nroVehiculos;
    private String placaVehiculo [];
    private String marcaVehiculo [];
    private String modeloVehiculo [];
    private String cilindrajeVehiculo [];
    private String idPropietarioVehiculo [];
    
    public vehiculo(int n){
        nroVehiculos = n;
        placaVehiculo = new String [n];
        marcaVehiculo = new String [n];
        modeloVehiculo = new String [n];
        cilindrajeVehiculo = new String [n];
        idPropietarioVehiculo = new String [n];
    }
    
    public int getNroVehiculos(){
        return nroVehiculos;
    }
    
    public void setDatos(int pos, String placa, String marca, String modelo, String cilindraje, String idPropietario){
        placaVehiculo [pos] = placa;
        marcaVehiculo [pos] = marca;
        modeloVehiculo [pos] = modelo;
        cilindrajeVehiculo [pos] = cilindraje;
        idPropietarioVehiculo [pos] = idPropietario;
    }

    
    public String getPlacaVehiculo(int pos) {
        return placaVehiculo [pos];
    }

    public String getMarcaVehiculo(int pos) {
        return marcaVehiculo [pos];
    }

    public String getModeloVehiculo(int pos) {
        return modeloVehiculo [pos];
    }

    public String getCilindrajeVehiculo(int pos) {
        return cilindrajeVehiculo [pos];
    }

    public String getIdPropietarioVehiculo(int pos) {
        return idPropietarioVehiculo [pos];
    }
    
    
    
}
