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
public class AAEmpresa {

    public static void main(String[] args) {
        // Vector de tipo Persona (Polimorfismo de datos)
        Persona[] personal = new Persona[4];

        personal[0] = new CEO("Marta", 45, "CEO-001", 5000, 2000);
        personal[1] = new Cajero("Luis", 22, "CAJ-102", 1200);
        personal[2] = new Repartidor("Jorge", 30, "REP-505", 160, 10);
        personal[3] = new Encargado("Ana", 35, "ENC-201", 1800, 300);

        System.out.println("Personal de la empresa");
        for (Persona p : personal) {
            System.out.println(p.toString()); // Llama al toString de Empleado
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            System.out.println("Salario: " + p.calcularSalario() + "euros");
            System.out.println("----");
        }
    }
}
