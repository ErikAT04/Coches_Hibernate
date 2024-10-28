package com.example.crud_hibernate_coches.Utils;

import com.example.crud_hibernate_coches.Obj.Coche;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    static SessionFactory factory = null;
    static {
        Configuration cfg = new Configuration(); //Creo un objeto de Configuración de Hibernate
        cfg.configure("hibernate.cfg.xml"); //Abrimos el archivo de configuración
        cfg.addAnnotatedClass(Coche.class);
        factory = cfg.buildSessionFactory(); //Crea la fábrica de sesiones
    }

    public static SessionFactory getSessionFactory() {
        return factory; //Devuelve la fábrica
    }

    public static Session getSession() {
        return factory.openSession(); //Abre la sesión
    }

}
