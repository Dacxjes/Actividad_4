package animales;

import java.util.List;
import java.util.ArrayList;

public class Animales {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<Animal>();
        animales.add(new Perro());
        animales.add(new Lobo());
        animales.add(new Gato());
        animales.add(new Leon());
        
        for(Animal animal: animales) {
            System.out.println(animal.getNombreCientifico());
            System.out.println(animal.getHabitat());
            System.out.println(animal.getSonidos());
            System.out.println(animal.getAlimentos());
            System.out.println("");
        }
        
    }
}
