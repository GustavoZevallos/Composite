package com.upc.Ejemplo2;
import java.util.ArrayList;
import java.util.List;

public class OrdenDeVenta {
    private String numeroDeOrden;
    private String cliente;
    private List< ProductoAbstracto > productos = new ArrayList< >();

    public OrdenDeVenta(String numeroDeOrden, String customer) {
        this.numeroDeOrden = numeroDeOrden;
        this.cliente = customer;

    }

    public String getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(String numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List getProducts() {
        return productos;
    }

    public void setProducts(List productos) {
        this.productos = productos;
    }

    public double getPrecio() {
        double precio = 0;
        for (ProductoAbstracto child : productos) {
            precio += child.getPrecio();
        }
        return precio;
    }

    public void addProduct(ProductoAbstracto product) {
        productos.add(product);
    }

    public void removeProduct(ProductoAbstracto product) {
        productos.remove(product);
    }

    public void printOrder() {
        System.out.println("\n=============================================\nOrden: " + numeroDeOrden + "\nCliente: " + cliente + "\nProductos:");
        for (ProductoAbstracto prod : productos) {
            System.out.println(prod.getNombre() + " " + prod.getPrecio());

        }
        System.out.println("Total: " + getPrecio() + "\n=============================================");
    }
}
