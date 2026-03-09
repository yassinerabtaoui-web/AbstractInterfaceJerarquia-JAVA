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
 abstract class Empleado extends Persona {

    protected String idEmpleado;

    public Empleado(String nombre, int edad, String idEmpleado) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
    }

  abstract double calcularSalario();

    @Override
    public String toString() {
        return "ID: " + idEmpleado + "  Nombre: " + nombre + "  Edad: " + edad;
    }
}
