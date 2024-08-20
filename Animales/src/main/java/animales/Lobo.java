package animales;

public class Lobo extends Canido{
    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
    
    @Override
    public String getSonidos() {
        return "Aullido";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }
}
