package animales;

public class Perro extends Canido {
    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
    
    @Override
    public String getSonidos() {
        return "Ladrido";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }
}
