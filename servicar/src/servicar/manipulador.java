/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicar;

import java.io.ObjectInputStream;
import java.util.Arrays;

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
    
    //en una fecha dada a que vehiculos se les hizo mantenimiento
    public String consultarPlacaMantenimiento(String fecha){
        String[] concordados = new String[5];
        int indexDeConcordados = 0;
        
        for (int i = 0; i < mantenimiento.getTamMantenimiento(); i++) {
            if(mantenimiento.getFechaMantenimiento(i) != null && mantenimiento.getFechaMantenimiento(i).equals(fecha)){
                 concordados [indexDeConcordados] = mantenimiento.getPlacaMantenimiento(i);
                 indexDeConcordados++;
            }
        }
        return Arrays.toString(concordados);
    }
    
    //Cuál es el costo total de mantenimientos en una fecha dada 
    public int consultarCostoMantenimiento (String fecha){
        
        String [] fechasConcordadas = new String [5];
        int indexDeConcordadas = -1;
        
        for (int i = 0; i < mantenimiento.getTamMantenimiento(); i++){
            if (mantenimiento.getFechaMantenimiento(i).equals(fecha)){
                fechasConcordadas [indexDeConcordadas] = mantenimiento.getIdServicioMantenimiento(i);
                        indexDeConcordadas++;
            }
        }
        
        String [] idConcordados = new String [5];
        int indexConcordados = -1;
        for (int i = 0; i < fechasConcordadas.length; i++){
            
        }
        
        return 7;
    }
    
}
