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
    
    //constructor en donde se hacen las intancias
    public manipulador(){
    }
    
    //en una fecha dada a que vehiculos se les hizo mantenimiento
    public String consultarPlacaMantenimiento(String fecha){
        String[] concordados = new String[5];
        int indexDeConcordados = -1;
        
        for (int i = 0; i < mantenimiento.getTamMantenimiento(); i++) {
            if(mantenimiento.getFechaMantenimiento(i).equals(fecha)){
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
        
        return 67;
    }
    
}
