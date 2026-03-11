package miproyect;
public class modelo {
    
    float nota1, nota2, nota3;
    float definitiva;
    float mayor = 0;
    
    
    
    //INICIO GETTERS Y SETTERS
    public float getNota1(){
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

    public float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(float definitiva) {
        this.definitiva = definitiva;
    }

    public float getMayor() {
        return mayor;
    }
    
    public void setMayor(float mayor) {    
        this.mayor = mayor;
    }
    //FIN GETTERS Y SETTERS
    
    
    
    public float cualDefinitiva() {
        definitiva = (nota1 * 0.25f) + (nota2 * 0.35f) + (nota3 * 0.40f);
        return definitiva;
    }
    
    
    public boolean estaAprobado(){
        if (definitiva >= 3.0f){
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public float notaMayor(){
        
        if (nota1 > nota2 && nota1 > nota3){
            mayor = nota1;
        }
        
        else if (nota2 > nota1 && nota2 > nota3){
            mayor = nota2;
        }
        
        else if (nota3 > nota1 && nota3 > nota2){
            mayor = nota3;
        }
        
        return mayor;
    }
}