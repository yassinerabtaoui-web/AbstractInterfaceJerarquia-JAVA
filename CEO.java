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
public  class CEO extends Empleado implements Remoto, Gestion {

    private double sueldo;
    

    public CEO(String nombre, int edad, String id,double sueldo) {
        super(nombre, edad, id);
        this.sueldo=sueldo;
    }

    @Override
    public void trabajarDesdeCasa() {
        System.out.println(nombre + " Esta en reunion.");
    }

    @Override
    public void dirigirEquipo() {
        System.out.println(nombre + " Se dispone a dirigir al equipo");
    }

    @Override
    public double calcularSalario() {
        return 0; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
