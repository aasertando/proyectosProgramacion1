/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicar;

/**
 *
 * @author aser
 */
public class mantenimiento {
    
    private int tamMantenimiento;
    private String [] placaMantenimiento;
    private String [] idServicioMantenimiento;
    private String [] fechaMantenimiento;
    
    public mantenimiento(int n){
        tamMantenimiento = n;
        placaMantenimiento = new String [n];
        idServicioMantenimiento = new String [n];
        fechaMantenimiento = new String [n];
    }
    
    public int getTamMantenimiento(){
        return tamMantenimiento;
    }
    
    public void setDatos(int pos, String placa, String idServicio, String fecha){
        placaMantenimiento [pos] = placa;
        idServicioMantenimiento [pos] = idServicio;
        fechaMantenimiento [pos] = fecha;
    }

    public String getPlacaMantenimiento(int pos) {
        return placaMantenimiento [pos];
    }

    public String getIdServicioMantenimiento(int pos) {
        return idServicioMantenimiento [pos];
    }

    public String getFechaMantenimiento(int pos) {
        return fechaMantenimiento [pos];
    }
    
    
    
}
