/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author aser
 */
public class inventario {
    
    private int tam;
    private producto listaProducto [];
    private cliente listaCliente [];
    private item listaItem [];
    private factura listaFactura [];

    public inventario(int t) {  
        tam = t;
        listaProducto = new producto[tam];  
    }
    

    
    
    public void setDatosProducto(int pos, String cod, String desc, int cant, int val){
        //se debe garantizar que existe el objeto
        producto x = new producto();
        x.setCodProducto(cod);
        x.setDescripcion(desc);
        x.setCantidad(cant);
        x.setValor(val);
        
        listaProducto [pos] = x;
        
    }
    
    public void setDatosCliente(int pos, String direccion, String id, String nombre, String sexo, String telefono){
        cliente x = new cliente();
        
        x.setDireccion(direccion);
        x.setId(id);
        x.setNombre(nombre);
        x.setSexo(sexo);
        x.setTelefono(telefono);
        
        listaCliente [pos] = x;
        
    }
    
    public String getIdCliente(int pos, String id){
        
        return listaCliente [pos].getId();
        
    }
    
    
//    public boolean idClienteRepetido(String id){
//        int tamArray = listaCliente.length;
//        
//        for (int i = 0; i < tamArray; i++){
//            if (listaCliente [i].equals(id)) {
//                return true;
//            }
//        }
//        return false;
//    }
    
    public int getTam(){
        return tam;
    }
    
    public producto getProducto (int pos){
        return listaProducto[pos];
    }
}
