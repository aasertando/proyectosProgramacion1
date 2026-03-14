package notas.clases;
public class claseMateria {
    
    int codigo;
    String nombre;
    int nCreditos;
    int semestre;
    String carrera;

    //INICIO GETTER Y SETTER
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCreditos() {
        return nCreditos;
    }

    public void setnCreditos(int nCreditos) {
        this.nCreditos = nCreditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    //FIN GETTER Y SETTER
    
}
