/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Empleado> ListaEmp = new ArrayList<Empleado>();

        Empleado em1 = new JefesDeProyectos("Luis ", "Gilarte ", 1000, 7);

        Empleado em2 = new TrabajadoresPorHoras("Javier ", "Barrios ", 70, 16);

        Empleado em3 = new Montador("Jorge ", "Castilla ", 5, 300);

        Empleado em4 = new Vendedores("Diego ", "Vicario ", 5, 30, 600);

        ListaEmp.add(em1);
        ListaEmp.add(em2);
        ListaEmp.add(em3);
        ListaEmp.add(em4);

        for (Empleado em : ListaEmp) {
            System.out.println(em.toString());
            System.out.println(em.salario());

        }
    }
}
