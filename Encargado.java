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
public class Encargado extends Empleado implements Remoto, Gestion, GestionInventario {
    private double base;
    private double plusResponsabilidad;

    public Encargado(String nombre, int edad, String id, double base, double plus) {
        super(nombre, edad, id);
        this.base = base;
        this.plusResponsabilidad = plus;
    }

    @Override
    public double calcularSalario() { return base + plusResponsabilidad; }

    @Override
    public void trabajarDesdeCasa() { System.out.println(nombre + " gestiona turnos desde su laptop."); }

    @Override
    public void dirigirEquipo() { System.out.println(nombre + " supervisa el local."); }

    @Override
    public void sincronizarStock() { System.out.println(nombre + " revisa el inventario general."); }
}