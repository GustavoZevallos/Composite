package com.upc.Ejemplo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Director implements Empleado {
    private String nombre;
    private double salario;

    public Director(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    List<Empleado> empleados = new ArrayList<Empleado>();
    public void add(Empleado empleado){
        empleados.add(empleado);
    }
    public Empleado getChild(int i){
        return empleados.get(i);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getSalario() {
        return salario;
    }
    public void print(){
        System.out.println();
        System.out.println("Nombre = " + getNombre());
        System.out.println("Salario = " + getSalario());

        Iterator<Empleado> empleadoIterator = empleados.iterator();
        while (empleadoIterator.hasNext()){
            Empleado empleado = empleadoIterator.next();
            empleado.print();
        }
    }

    public void remove(Empleado empleado){
        empleados.remove(empleado);
    }
}
