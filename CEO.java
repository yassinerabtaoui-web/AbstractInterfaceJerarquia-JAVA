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
public class CEO extends Empleado implements Remoto, Gestion {
    private double fijo;
    private double bono;

    public CEO(String nombre, int edad, String id, double fijo, double bono) {
        super(nombre, edad, id);
        this.fijo = fijo;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() { return fijo + bono; }

    @Override
    public void trabajarDesdeCasa() { System.out.println(nombre + " está en reunión por Zoom."); }

    @Override
    public void dirigirEquipo() { System.out.println(nombre + " define la visión de la empresa."); }
}
