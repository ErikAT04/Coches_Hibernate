package com.example.crud_hibernate_coches.Utils;

public class Validator {
    public static boolean validatePlate(String plate){
        return plate.matches("[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}") || plate.matches("[A-Z]{1,2}[0-9]{4}[A-Z]{1,2}");
        /*
        Traducción del regEx:
            1. Matricula actual:
                - 4 números
                - 3 consonantes en mayúscula de la B a la Z
            2. Matrícula antigua:
                - 1 o 2 letras al principio (A a la Z)
                - 4 números
                - 1 O 2 letras al final (A a la Z)
         */
    }
}
