package com.upc.Ejemplo2;

public class ProductoSimple extends ProductoAbstracto{
    private String material;
    public ProductoSimple(String nombre, double precio,String material) {
        super(nombre, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
