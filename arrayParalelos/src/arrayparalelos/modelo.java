/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayparalelos;

/**
 *
 * @author aser
 */
public class modelo {
    
    private int noElementos;
    private String documento[];
    private String nombre[];
    private String asignatura[];
    private int nota1[];
    private int nota2[];
    private int nota3[];
    
    //constructor
    public modelo (int n){
        noElementos = n;
        documento = new String[n];
        nombre = new String[n];
        asignatura = new String[n];
        nota1 = new int[n];
        nota2 = new int[n];
        nota3 = new int[n];
    }
    
    //getter de noElementos
    public int getNoElementos(){
        return noElementos;
    }
    
    //setter de todo
    public void setDatos(int pos, String doc, String nom, String asign, int n1, int n2, int n3){
        documento [pos] = doc;
        nombre [pos] = nom;
        asignatura [pos] = asign;
        nota1 [pos] = n1;
        nota2 [pos] = n2;
        nota3 [pos] = n3;
    }
    
    //getters de todas las variables
    public String getDocumento(int pos){
        return documento [pos];
    }
    
    public String getNombree(int pos){
        return nombre [pos];
    }
    
    public String getAsignatura(int pos){
        return asignatura [pos];
    }
    
    public int getNota1(int pos){
        return nota1 [pos];
    }
    
    public int getNota2 (int pos){
        return nota2 [pos];
    }
    
    public int getNota3(int pos){
        return nota3 [pos];
    }
    
    //getter promedio nota final
    public int getNotaFinal(int pos){
        return (getNota1(pos) + getNota1(pos) + getNota1(pos))/3;
    }
    
    
}
