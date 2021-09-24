package com.upc.Ejemplo1;

public interface Empleado {
    void add(Empleado empleado);
    void remove(Empleado empleado);
    Empleado getChild(int i);

    String getNombre();
    double getSalario();
    void print();
}
