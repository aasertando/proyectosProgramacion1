package piscinas;
    public class CalculadoraPiscina {

    private int Largo;
    private int Ancho;
    private int Profundidad;
    private float PrecioMExcavacion;
    private float PrecioMconcretoParedes;
    private float PrecioMconcretoPisos;
    private float PrecioMEnchape;

    public CalculadoraPiscina() {
        Largo = 0;
        Ancho = 0;
        Profundidad = 0;
        PrecioMExcavacion = 0;
        PrecioMconcretoParedes = 0;
        PrecioMconcretoPisos = 0;
        PrecioMEnchape = 0;
    }

    //inicio setter y getter
    public void SetLargo(int l) {
        Largo = l;
    }

    public void SetAncho(int a) {
        Ancho = a;
    }

    public void SetProfundidad(int p) {
        Profundidad = p;
    }

    public void SetPrecioMExcavacion(float pexcava) {
        PrecioMExcavacion = pexcava;
    }

    public void SetPrecioMconcretoParedes(float ppared) {
        PrecioMconcretoParedes = ppared;
    }

    public void SetPrecioMconcretoPisos(float ppisos) {
        PrecioMconcretoPisos = ppisos;
    }

    public void SetPrecioMEnchape(float penchape) {
        PrecioMEnchape = penchape;
    }

    public int GetLargo() {
        return Largo;
    }

    public int GetAncho() {
        return Ancho;
    }

    public int GetProfundidad() {
        return Profundidad;
    }

    public float GetPrecioMExcavacion() {
        return PrecioMExcavacion;
    }

    public float GetPrecioMconcretoParedes() {
        return PrecioMconcretoParedes;
    }

    public float GetPrecioMconcretoPisos() {
        return PrecioMconcretoPisos;
    }

    public float GetPrecioMEnchape() {
        return PrecioMEnchape;
    }
    //fin setter y getter
    
    
    public float CalcularMtsCubicos() {
        float calcular;
        calcular = GetLargo() * GetProfundidad() * GetAncho();
        return calcular;
    }

    public float CalcularMtsParedesLargo() {
        float calcular;
        calcular = (GetLargo() * GetProfundidad()) * 2;
        return calcular;
    }

    public float CalcularMtsParedesAncho() {
        float calcular;
        calcular = (GetAncho() * GetProfundidad()) * 2;
        return calcular;
    }

    public float CalcularMtsPisos() {
        float calcular;
        calcular = GetLargo() * GetAncho();
        return calcular;
    }

    public float CalcularEnchapes() {
        float calcular;
        calcular = CalcularMtsParedesLargo() + CalcularMtsParedesAncho() +
                CalcularMtsPisos();
        return calcular;
    }

    public float CalcularVolumenAgua() {
        float calcular;
        calcular = CalcularMtsCubicos() * 1000;
        return calcular;
    }

    public float CalcularCostosParedes() {
        float calcular;
        calcular = (CalcularMtsParedesLargo() + CalcularMtsParedesAncho()) * GetPrecioMconcretoParedes();
        return calcular;
    }

    public float CalcularCostosPisos() {
        float calcular;
        calcular = CalcularMtsPisos() * GetPrecioMconcretoPisos();
        return calcular;
    }

    public float CalcularCostosExcavacion() {
        float calcular;
        calcular = GetPrecioMExcavacion() * CalcularMtsCubicos();
        return calcular;
    }

    public float CalcularCostosEnchape() {
        float calcular;
        calcular = (CalcularMtsPisos() + CalcularMtsParedesLargo() + 
                CalcularMtsParedesAncho()) * GetPrecioMEnchape();
        return calcular;
    }

    public float CalcularcostoAgua() {
        float calcular;
        calcular = CalcularVolumenAgua() * 50;
        return calcular;
    }

    public float CalcularCostosQuimicos() {
        float calcular;
        calcular = (CalcularVolumenAgua() / 1000) * 400;
        return calcular;
    }

    public float TotalCostoPiscina() {
        float calcular;
        calcular = CalcularCostosParedes()
                + CalcularCostosPisos()
                + CalcularCostosExcavacion()
                + CalcularCostosExcavacion()
                + CalcularCostosEnchape()
                + CalcularcostoAgua()
                + CalcularCostosQuimicos();
        return calcular;
    }
}