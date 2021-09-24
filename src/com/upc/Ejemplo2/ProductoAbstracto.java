package com.upc.Ejemplo2;

public abstract class ProductoAbstracto {
    protected String nombre;
    protected double precio;

    public ProductoAbstracto(String name, double precio) {
        this.nombre = name;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

}
