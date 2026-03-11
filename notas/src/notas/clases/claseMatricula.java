package notas.clases;
public class claseMatricula {
    
    int id;
    int codMateria;
    int periodoAcademico;
    
    float nota1, nota2, nota3;

    //INICIO GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public int getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(int periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    //FIN GETTER Y SETTER
    
}
