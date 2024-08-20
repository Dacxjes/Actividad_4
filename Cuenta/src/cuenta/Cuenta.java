/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author Juanda
 */
public class Cuenta {

protected float saldo;
protected int numeroConsignaciones = 0;
protected int numeroRetiros = 0;
protected float tasaAnual;
protected float comisionMensual = 0;

public Cuenta(float saldo, float tasaAnual) {
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
}

public void consignar(float cantidad) {
    saldo = saldo + cantidad;
    numeroConsignaciones = numeroConsignaciones + 1;
}

public void retirar(float cantidad) {
    float nuevoSaldo = saldo - cantidad;
    if (nuevoSaldo >= 0) {
        saldo -= cantidad;
        numeroRetiros = numeroRetiros + 1;
    } else {
        System.out.println("La cantidad a retirar excede el saldo actual.");
    }
}

public void calcularInteres() {
    float tasaMensual = tasaAnual / 12;
    float interesMensual = saldo * tasaMensual;
    saldo += interesMensual;
}

public void extractoMensual() {
    saldo -= comisionMensual;
    calcularInteres();
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
