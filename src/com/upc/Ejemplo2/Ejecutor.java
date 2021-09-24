package com.upc.Ejemplo2;

public class Ejecutor {
    public static void main(String[] args) {
        ProductoSimple anillo = new ProductoSimple("Anillo de esmeralda", 750, "Oro Rojo");
        ProductoSimple pulsera = new ProductoSimple("Pulsera de esmerada", 1000, "Oro Rojo");

        ProductoSimple collar = new ProductoSimple("Collar de Diamantes", 50000, "Platino");
        ProductoSimple aretes = new ProductoSimple("Aretes de Diamantes", 20000, "Platino");

        ConjuntoProducto esmeralda = new ConjuntoProducto("Conjunto de Esmeralda");
        esmeralda.addProduct(anillo);
        esmeralda.addProduct(pulsera);

        ConjuntoProducto diamante = new ConjuntoProducto("Conjunto de Diamantes");
        diamante.addProduct(collar);//
        diamante.addProduct(aretes);

        ConjuntoProducto joyero = new ConjuntoProducto("Lo mejor de la tienda");
        joyero.addProduct(diamante);
        joyero.addProduct(esmeralda);

        OrdenDeVenta ordenDiamante = new OrdenDeVenta("001", "Juan Perez");
        ordenDiamante.addProduct(diamante);
        ordenDiamante.printOrder();

        OrdenDeVenta ordenEsmeralda = new OrdenDeVenta("002", "Marcos Guerra");
        ordenEsmeralda.addProduct(esmeralda);
        ordenEsmeralda.printOrder();

        OrdenDeVenta locura = new OrdenDeVenta("003", "Gustavo Zevallos");
        locura.addProduct(joyero);
        locura.printOrder();

        OrdenDeVenta simple = new OrdenDeVenta("004", "Oscar Blancarte");
        simple.addProduct(anillo);
        simple.addProduct(collar);
        simple.printOrder();

    }
}
