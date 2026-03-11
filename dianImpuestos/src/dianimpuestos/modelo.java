package dianimpuestos;
public class modelo {
    int ingresosBrutosAnuales,
            gastosDeducibles,
            dependientes;

    
    //INICIO GETTERS Y SETTERS
    public int getIngresosBrutosAnuales() {
        return ingresosBrutosAnuales;
    }

    public void setIngresosBrutosAnuales(int ingresosBrutosAnuales) {
        this.ingresosBrutosAnuales = ingresosBrutosAnuales;
    }

    public int getGastosDeducibles() {
        return gastosDeducibles;
    }

    public void setGastosDeducibles(int gastosDeducibles) {
        this.gastosDeducibles = gastosDeducibles;
    }

    public int getDependientes() {
        return dependientes;
    }

    public void setDependientes(int dependientes) {
        this.dependientes = dependientes;
    }
    //FIN GETTERS Y SETTERS
    
    public float calcularImpuesto(){
        float impuesto = 0;
        
        //< 50
        if (ingresosBrutosAnuales < 50){
           impuesto = 0;
        }
        
        //>= 50m && <100m
        else if (ingresosBrutosAnuales >= 50000000 && ingresosBrutosAnuales < 100000000){
            impuesto = (ingresosBrutosAnuales - 50000000) * 0.10f;
        }
        
        //>= 100m && <= 200m
        else if (ingresosBrutosAnuales >= 100000000 && ingresosBrutosAnuales <= 200000000){
            impuesto = ((ingresosBrutosAnuales - 100000000) * 0.20f) + (50000000 * 0.10f);
        }
        
        //>200m
        else if (ingresosBrutosAnuales > 200000000){
            impuesto = ((ingresosBrutosAnuales - 200000000) * 0.30f) + (100000000 * 0.20f) + (50000000 * 0.10f);
        }
        
        return impuesto;
    }
    
    public float calcularDescuentoDependiente(){
        
        float descuentoDependiente = 0;
        descuentoDependiente = (calcularImpuesto() * 0.05f) * (dependientes);
        return descuentoDependiente;
    }
    
    public float calcularImpuestoTotal(){
        float impuestoTotal = 0;
        impuestoTotal = (calcularImpuesto() - calcularDescuentoDependiente()) - gastosDeducibles;
        return impuestoTotal;
    }
    
}
