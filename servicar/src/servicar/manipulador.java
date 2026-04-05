/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicar;

import java.io.ObjectInputStream;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aser
 */
public class manipulador {

    cliente cliente = new cliente(5);
    vehiculo vehiculo = new vehiculo(5);
    servicios servicios = new servicios(5);
    mantenimiento mantenimiento = new mantenimiento(5);
    
    public void setDatosClientes(int pos, String id, String nombre, String direccion, String telefono){
        cliente.setDatos(pos, id, nombre, direccion, telefono);
    }
    
    public void setDatosVehiculos(int pos, String placa, String cilindraje, String marca, String modelo, String idPropietario){
        vehiculo.setDatos(pos, placa, cilindraje, marca, modelo, idPropietario);
    }
    
    public void setDatosServicios(int pos, String id, String descripcion, int valor){
        servicios.setDatos(pos, id, descripcion, valor);
    }
    
    public void setDatosMantenimientos(int pos, String placa, String idServicio, String fecha){
        mantenimiento.setDatos(pos, placa, idServicio, fecha);
    }
    
    public String getIdCliente(int pos){
        return cliente.getIdCliente(pos);
    }
    
    public String getIdServicio(int pos){
        return servicios.getIdServicio(pos);
    }
    
    public String getPlacaVehiculo(int pos){
        return vehiculo.getPlacaVehiculo(pos);
    }
    
    public String getFechaMantenimiento(int pos){
        return mantenimiento.getFechaMantenimiento(pos);
    }
    
    public String pruebaDatosMantenimiento(int pos){
    
        String [] datos = new String[3];
        
        datos [0] = mantenimiento.getFechaMantenimiento(pos);
        datos [1] = mantenimiento.getIdServicioMantenimiento(pos);
        datos [2] = mantenimiento.getPlacaMantenimiento(pos);
//        datos [3] = cliente.getTelefonoCliente(pos-1);
        
        return Arrays.toString(datos);
    }
    
    //1. en una fecha dada a que vehiculos se les hizo mantenimiento
    public String [] consultarPlacaMantenimiento(String fecha){
        
        String[] datos = new String[6];
        String idPropietario;
        String marca;
        String modelo;
        String cilindraje;
        String placa;
        
        for (int i = 0; i < mantenimiento.getTamMantenimiento(); i++) {
            if(mantenimiento.getFechaMantenimiento(i) != null && mantenimiento.getFechaMantenimiento(i).equals(fecha)){
                 
                 placa = mantenimiento.getPlacaMantenimiento(i);
                 idPropietario = cliente.getIdCliente(i);
                 marca = vehiculo.getMarcaVehiculo(i);
                 modelo = vehiculo.getModeloVehiculo(i);
                 cilindraje = vehiculo.getCilindrajeVehiculo(i);
                 
                 datos [0] = fecha;
                 datos [1] = placa;
                 datos [2] = idPropietario;
                 datos [3] = marca;
                 datos [4] = modelo;
                 datos [5] = cilindraje;
                 
            }
        }
        return datos;
    }
    
    //2. Cuál es el costo total de mantenimientos en una fecha dada 
    public int consultarCostoMantenimiento (String fecha){

        int dinero = 0;
        for (int i = 0; i < mantenimiento.getTamMantenimiento(); i++){
            if (mantenimiento.getFechaMantenimiento(i) != null && mantenimiento.getFechaMantenimiento(i).equals(fecha)){
                
                String idServicio = mantenimiento.getIdServicioMantenimiento(i);
                
                for(int j = 0; j < servicios.getTamServicio(); j++){
                    if(idServicio.equals(servicios.getIdServicio(j))){
                        dinero += servicios.getValorServicio(j);
//                        break;
                    }
                }
                
            }
        }
        return dinero;
    }
}
