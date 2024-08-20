package carreraciclismo;

public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;
    
    Velocista(int id, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    
    protected double getPotenciaPromedio() {
        return this.potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getVelocidadPromedio() {
        return this.velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + this.potenciaPromedio) ;
        System.out.println("Velocidad promedio: " + this.velocidadPromedio) ;
}
    
    @Override
    protected String imprimirTipo() {
        return "Es un Velocista";
    }
}
