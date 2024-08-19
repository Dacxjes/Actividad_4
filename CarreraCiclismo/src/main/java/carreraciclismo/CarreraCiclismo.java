/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carreraciclismo;

/**
 *
 * @author Juan
 */
public class CarreraCiclismo {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Ciclistas lomudos", "Alemania");
        Equipo equipo2 = new Equipo("Ciclistas planos", "Chile");
        
        Velocista velocista1 = new Velocista(10001, "Julio Cesar Carreritas", 120, 90);
        Escalador escalador1 = new Escalador(10002, "Escarlitos Escaleno", 15, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(10003, "Timotheo Temporalis", 80);
        
        velocista1.setTiempoAcumulado(200);
        escalador1.setTiempoAcumulado(360);
        contrarrelojista1.setTiempoAcumulado(160);
        
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        
        Velocista velocista2 = new Velocista(10004, "Pablito Veloz", 140, 70);
        Escalador escalador2 = new Escalador(10005, "Estefan Bajadas", 25, 12);
        Contrarrelojista contrarrelojista2 = new Contrarrelojista(10006, "Aquiles Voy", 60);
        
        velocista2.setTiempoAcumulado(190);
        escalador2.setTiempoAcumulado(375);
        contrarrelojista2.setTiempoAcumulado(120);
        
        equipo2.añadirCiclista(velocista2);
        equipo2.añadirCiclista(escalador2);
        equipo2.añadirCiclista(contrarrelojista2);
        
        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
        
        equipo2.calcularTotalTiempo();
        equipo2.imprimir();
        equipo2.listarEquipo();
        

    }
}
