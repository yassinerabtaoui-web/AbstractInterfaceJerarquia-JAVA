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
public class Repartidor extends Empleado {
    private int horas;
    private double precioHora;

    public Repartidor(String nombre, int edad, String id, int horas, double precioHora) {
        super(nombre, edad, id);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    
    public double calcularSalario() { 
        return horas * precioHora; 
    }
}
