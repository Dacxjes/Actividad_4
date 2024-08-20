package carreraciclismo;

public abstract class Ciclista {
    
    private int id;
    private String nombre;
    private int tiempoAcumulado = 0;
    
    Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    protected int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNombre() {
        return this.nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getTiempoAcumulado() {
        return this.tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
    
    protected int getPosicionGeneral(int posicionGeneral) {
        return posicionGeneral;
    }

    protected void setposicionGeneral(int posicionGeneral) {
        posicionGeneral = posicionGeneral;
    }
    
    protected void imprimir() {
        System.out.println("Nombre del ciclista: " + this.nombre);
        System.out.println("ID: " + this.id);
        System.out.println("Tiempo acumulado: " + this.tiempoAcumulado);   
    }
    
    protected abstract String imprimirTipo();
  
}
