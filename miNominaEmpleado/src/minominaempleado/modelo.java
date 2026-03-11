package minominaempleado;
public class modelo {
    
    int sm = 1800000;
    float horasTrabajadas;
    float precioHora;
    float neto = 0;
    float horasExtra;
    float retencion = 0;
    float nominaTotal = 0;
    
    
    
    // INICIO GETTERS Y SETTERS
    public int getSm(){
        return sm;
    }

    public void setSm(int sm) {
        this.sm = sm;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public float getNeto() {
        return neto;
    }

    public void setNeto(float neto) {
        this.neto = neto;
    }

    public float getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(float horasExtra) {
        this.horasExtra = horasExtra;
    }

    public float getRetencion() {
        return retencion;
    }

    public void setRetencion(float retencion) {
        this.retencion = retencion;
    }

    public float getNominaTotal() {
        return nominaTotal;
    }
    
    public void setNominaTotal(float nominaTotal) {
        this.nominaTotal = nominaTotal;
    }
    //FIN DE GETTERS Y SETTERS
    
    
    
    public float cuantasHorasExtra() {
        if (horasTrabajadas <= 48){
            horasExtra = 0;
        }
        else if(horasTrabajadas > 48){
            horasExtra = horasTrabajadas - 48;
        }
        return horasExtra;
    }
    
    
    
    
    public float cuantoNeto(){
        neto = (horasTrabajadas * precioHora) + (horasExtra * (precioHora*2));
        return neto;
    }
    
    
    
    
        public float cuantaRetencion(){
        
        //1 salario minimo
        if (neto == sm){
            retencion = (sm * 0.01f);
        }
        
        //1-3 salarios minimos
        else if (neto > sm && neto <= (3*sm)){
            retencion = (sm * 0.03f);
        }
        
        //3-5 salarios minimos
        else if (neto > (2*sm) && neto <= (5*sm)){
            retencion = (sm * 0.07f);
        }
        
        else{
            retencion = 0;
        }
    
        return retencion;
        
    }

    
    

        
//        //seccion retención        
//        //1 salario minimo
//        if (neto == sm){
//            this.retencion = (sm * 0.01f);
//        }
//        
//        //1-3 salarios minimos
//        else if (neto > sm && neto <= (3*sm)){
//            this.retencion = (sm * 0.03f);
//        }
//        
//        //3-5 salarios minimos
//        else if (neto > (2*sm) && neto <= (5*sm)){
//            this.retencion = (sm * 0.07f);
//        }
//        
//        //devolver resultado
//        this.nominaTotal = neto - retencion;
//        return nominaTotal;


        public float cuantaNominaTotal(){
            nominaTotal = neto-retencion;
            return nominaTotal;
        }

}