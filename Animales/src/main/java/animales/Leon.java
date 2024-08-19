package animales;

public class Leon extends Felino{
    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
    
    @Override
    public String getSonidos() {
        return "Rugido";
    }

    @Override
    public String getHabitat() {
        return "Pradera";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }
}
