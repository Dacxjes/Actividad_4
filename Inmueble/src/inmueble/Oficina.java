/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmueble;

/**
 *
 * @author Juanda
 */
public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    public Oficina(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}

