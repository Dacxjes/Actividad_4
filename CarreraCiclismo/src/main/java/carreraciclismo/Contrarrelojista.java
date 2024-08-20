package carreraciclismo;

public class Contrarrelojista extends Ciclista{
    private float velocidadMaxima;
    
    Contrarrelojista(int id, String nombre, float velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    protected float getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    protected void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected void imprimir() {
        super.imprimir();
        System.out.println("Velocidad maxima: " + this.velocidadMaxima) ;
}
    
    @Override
    protected String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
}
