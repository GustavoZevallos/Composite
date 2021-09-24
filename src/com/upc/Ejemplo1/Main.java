package com.upc.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Desarrollador("Pedro Perez",1200);
        Empleado empleado2 = new Desarrollador("Juan Lopez", 1200);
        Empleado director1 = new Director("Karla Matos",2500);
        director1.add(empleado1);
        director1.add(empleado2);
        Empleado empleado3 = new Desarrollador("Esteban Fernandez",2000);
        Empleado directorGeneral = new Director("Carlos Valencia", 5000);
        directorGeneral.add(empleado3);
        directorGeneral.add(director1);
        directorGeneral.print();
    }
}
