package com.example.crud_hibernate_coches.Obj;

import com.example.crud_hibernate_coches.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;


public class CRUDCoche { //DAO de Coche en MySQL Hibernate
    Session session;
    public CRUDCoche(){
        try {
            session = HibernateUtils.getSession();
        }catch (NullPointerException e){ //Por si la base de datos es nula
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Coche> listarCoches(){ //Función que busca en la base de datos
        ArrayList<Coche> coches = new ArrayList<>();
        try{
            coches = (ArrayList<Coche>) session.createQuery(" from Coche", Coche.class).list();
            session.clear();
        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
        return coches; //Devuelve la lista
    }
    public Coche getCoche(String matricula){
        Coche coche = null; //Crea un objeto de tipo coche iniciado en nulo
        try{
            Transaction getCoche = session.beginTransaction();
            coche = (Coche) session.get(Coche.class, matricula);
            getCoche.commit();
            session.clear();
        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
        return coche; //Devuelve el coche, tanto si es nulo como si no
    }

    public boolean insertarCoche(Coche coche) {
        try {
            Transaction insertCoche = session.beginTransaction();
            session.save(coche);
            insertCoche.commit();
            session.clear();
            return true;
        }catch (Exception e){ //Si falla la base de datos devuelve falso
            System.out.println("Error de base de datos");
        }
        return false;
    }

    public boolean actualizarCoche(Coche coche) {
        try{
            Transaction updateCoche = session.beginTransaction();
            session.update(coche);
            updateCoche.commit();
            session.clear();
            return true;
        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
        return false;
    }

    public boolean borrarCoche(Coche coche) {
        try{
            Transaction deleteCoche = session.beginTransaction();
            session.delete(coche);
            deleteCoche.commit();
            session.clear();
            return true;
        }catch (Exception e){
            System.out.println("Error de base de datos");
        }
        return false;
    }
}
