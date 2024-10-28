package com.example.crud_hibernate_coches.Obj;

import com.example.crud_hibernate_coches.Utils.HibernateUtils;

import java.util.ArrayList;


public class CRUDCoche { //DAO de Coche en MongoDB

    public CRUDCoche(){
        //MongoDB
        try {

        }catch (NullPointerException e){ //Por si la base de datos es nula
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Coche> listarCoches(){ //Función que busca en la base de datos
        ArrayList<Coche> coches = new ArrayList<>();

        return coches; //Devuelve la lista
    }
    public Coche getCoche(String matricula){
        Coche coche = null; //Crea un objeto de tipo coche iniciado en nulo
        try{

        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
        return coche; //Devuelve el coche, tanto si es nulo como si no
    }

    public boolean insertarCoche(Coche coche) {
        try {

        }catch (Exception e){ //Si falla la base de datos devuelve falso
            return false;
        }
    }

    public boolean actualizarCoche(Coche coche) {
        try{

        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
    }

    public boolean borrarCoche(String coche) {
        try{

        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
    }
}
