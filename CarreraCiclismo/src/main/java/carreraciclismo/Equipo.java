package carreraciclismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private String pais;
    private static double totalTiempo;
    public List<Ciclista> listaCiclistas;
    
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.totalTiempo = 0;
        this.listaCiclistas = new ArrayList<Ciclista>();
    }
    
    protected String getNombre() {
        return this.nombre;
    }
    
    protected void setNombre(String newnombre) {
        this.nombre = newnombre;
    }
    
    protected String getPais() {
        return pais;
    }
    
    protected void setPais(String pais) {
        this.pais = pais;
    }
    
    protected void añadirCiclista(Ciclista ciclista) {
        this.listaCiclistas.add(ciclista);
    }
    
    protected void calcularTotalTiempo() {
        double tiempo = 0;
        
        for(Ciclista ciclista : listaCiclistas) {
            tiempo += ciclista.getTiempoAcumulado();
        }
        
        this.totalTiempo = tiempo;
    }
    
    protected void listarEquipo() {
        System.out.println("");
        System.out.println("Integrantes del equipo " + this.nombre + ":");
        for (Ciclista ciclista : listaCiclistas) {
            System.out.println(ciclista.getNombre());
        }
    }
    
    protected void imprimir() {
        System.out.println("");
        System.out.println("Nombre del equipo: " + this.nombre);
        System.out.println("Pais: " + this.pais);
        System.out.println("Total tiempo del equipo: " + this.totalTiempo);
    }
    
    protected void buscarCiclista() {
        Scanner sc = new Scanner(System.in); 
        int id = sc.nextInt();
        
        Ciclista ciclistaEncontrado = null;
        
        for(Ciclista ciclista: listaCiclistas) {
            if (ciclista.getId() == id) {
                ciclistaEncontrado = ciclista;
            }
        }
        
        if (ciclistaEncontrado == null) {
            System.out.println("Ciclista no encontrado");
            return;
        }
        
        System.out.println("Nombre del ciclista: " + ciclistaEncontrado.getNombre());
        System.out.println("ID: " + ciclistaEncontrado.getId());
        System.out.println("Tiempo acumulado: " + ciclistaEncontrado.getTiempoAcumulado());
        
    }
    
}
