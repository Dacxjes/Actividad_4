package animales;

public class Gato extends Felino{
    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
    
    @Override
    public String getSonidos() {
        return "Maullido";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getAlimentos() {
        return "Ratones";
    }
}
