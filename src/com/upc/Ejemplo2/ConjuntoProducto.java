package com.upc.Ejemplo2;
import java.util.ArrayList;
import java.util.List;

public class ConjuntoProducto extends ProductoAbstracto{
    private List<ProductoAbstracto> productos = new ArrayList<ProductoAbstracto>();

    public ConjuntoProducto(String nombre) {
        super(nombre, 0);
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (ProductoAbstracto child : productos) {
            precio += child.getPrecio();
        }
        return precio;
    }


    public void addProduct(ProductoAbstracto product) {
        this.productos.add(product);
    }

    public boolean removeProduct(ProductoAbstracto product) {
        return this.productos.remove(product);
    }
}
