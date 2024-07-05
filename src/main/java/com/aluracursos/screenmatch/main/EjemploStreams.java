package com.aluracursos.screenmatch.main;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda","Luisa","Maria", "Fernanrda","Eric","Genesys");
        nombres.stream().sorted().filter(n-> n.startsWith("B")).map(n-> n.toUpperCase()).limit(4).forEach(System.out::println);
    }
}
