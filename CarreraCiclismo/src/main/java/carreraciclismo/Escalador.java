package carreraciclismo;

public class Escalador extends Ciclista{
    private float aceleracionPromedio;
    private float gradoRampa;
    
    Escalador(int id, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }
    
    protected float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected float getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleracion promedio: " + this.aceleracionPromedio) ;
        System.out.println("Grado de rampa: " + this.gradoRampa) ;
}
    
    @Override
    protected String imprimirTipo() {
        return "Es un Escalador";
    }
}
