/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jerarquia;

/**
 * @version 1.0
 * @mail yassine@gmail.com
 * @compay IESABASTOS
 * @author Yassine
 */
public class Cajero extends Empleado implements GestionInventario {

    private double salarioMensual;

    public Cajero(String nombre, int edad, String id, double salario) {
        super(nombre, edad, id);
        this.salarioMensual = salario;
    }

    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public void sincronizarStock() {
        System.out.println(nombre + " está contando productos en caja.");
    }
}
