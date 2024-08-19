package animales;

public abstract class Animal {
    protected String sonidos;
    protected String habitat;
    protected String alimentos;
    protected String nombreCientifico;

    public abstract String getSonidos();
    public abstract String getHabitat();
    public abstract String getAlimentos();
    public abstract String getNombreCientifico();
}
