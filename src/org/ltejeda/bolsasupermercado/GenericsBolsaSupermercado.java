package org.ltejeda.bolsasupermercado;

import org.ltejeda.bolsasupermercado.dominio.*;

public class GenericsBolsaSupermercado {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecedero> bolsaNoPerecedero = new BolsaSupermercado<>();

        bolsaFrutas.addProducto(new Fruta("manzana", 1000, 250d, "roja"));
        bolsaFrutas.addProducto(new Fruta("durazno", 3000, 500, "amarillos"));
        bolsaFrutas.addProducto(new Fruta("uvas", 8000,1000,"verdes"));
        bolsaFrutas.addProducto(new Fruta("limones", 800, 2500, "amarillos"));

        bolsaLacteos.addProducto(new Lacteo("Lecherita", 1500, 4,7));
        bolsaLacteos.addProducto(new Lacteo("Leche entera", 15000,6,6));
        bolsaLacteos.addProducto(new Lacteo("Yogurth", 6000, 2, 12));
        bolsaLacteos.addProducto(new Lacteo("Mantequilla",4000, 3, 3));

        bolsaLimpieza.addProducto(new Limpieza("antibacterial", 4000, "triclosan", 1));
        bolsaLimpieza.addProducto(new Limpieza("lavaloza", 6000, "limones",2));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 8000, "HCl",4));
        bolsaLimpieza.addProducto(new Limpieza("detergente", 15000, "tensoactivos", 4));

        bolsaNoPerecedero.addProducto(new NoPerecedero("atun", 9000, 960, 370));
        bolsaNoPerecedero.addProducto(new NoPerecedero("Frijoles", 1500, 500, 350));
        bolsaNoPerecedero.addProducto(new NoPerecedero("Arroz", 2500, 7500, 1000));
        bolsaNoPerecedero.addProducto(new NoPerecedero("Lentejas", 2500, 1000, 500));

        System.out.println("===============Frutas==================");
        for(Fruta prod: bolsaFrutas.getProductos()){
            System.out.println("----------" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Peso: " + prod.getPeso() + " g");
            System.out.println("Color: " + prod.getColor());
        }

        System.out.println("===============Limpieza==================");
        for(Limpieza prod: bolsaLimpieza.getProductos()){
            System.out.println("----------" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros() + " L");
        }

        System.out.println("===============Lacteos==================");
        for(Lacteo prod: bolsaLacteos.getProductos()) {
            System.out.println("----------" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad: " + prod.getCantidad() + " g o L");
            System.out.println("Proteinas: " + prod.getProteinas() + " g");
        }

        System.out.println("===============No perecederos==================");
        for(NoPerecedero prod: bolsaNoPerecedero.getProductos()) {
            System.out.println("----------" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias: " + prod.getCalorias() + " cal");
            System.out.println("Contenido: " + prod.getContenido() + " g");
        }
    }
}
