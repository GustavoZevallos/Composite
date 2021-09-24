package com.upc.Ejemplo1;

public class Desarrollador implements Empleado{
    private String nombre;
    private double salario;

    public Desarrollador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void add(Empleado empleado) {
        // esta es una hoja este metodo no aplica
    }

    @Override
    public Empleado getChild(int i) {
        // esta es una hoja este metodo no aplica
        return null;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Nombre = " + getNombre());
        System.out.println("Salario = " + getSalario());
    }

    @Override
   public void remove(Empleado empleado) {
        // esta es una hoja este metodo no se aplica
    }
}
