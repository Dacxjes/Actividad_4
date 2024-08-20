/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmueble;

/**
 *
 * @author Juanda
 */
public class Local extends Inmueble {
    enum Tipo {INTERNO, CALLE};
    protected Tipo tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}

