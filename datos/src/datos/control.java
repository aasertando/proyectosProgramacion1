/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author aser
 */
public class control {
    
    public control (){
        a1 = new estudiante();
        a2 = new estudiante();
        a3 = new estudiante();
        a4 = new estudiante();
    }
    
    public estudiante a1;
    public estudiante a2;
    public estudiante a3;
    private estudiante a4;
    
    public void setDatosA4(String nombre, String direccion, String telefono, String barrio){
        a4.setNombre(nombre);
        a4.setDireccion(direccion);
        a4.setTelefono(telefono);
        a4.setBarrio(barrio);
    }
    
    public String getDatosA4(){
        String concatenacion;
        concatenacion = a4.getNombre() + " " + a4.getDireccion() + " " + a4.getTelefono() + " " + a4.getBarrio();
        return concatenacion;
    }
    
}
