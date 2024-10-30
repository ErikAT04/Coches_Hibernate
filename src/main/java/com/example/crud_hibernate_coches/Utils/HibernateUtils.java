package com.example.crud_hibernate_coches.Utils;

import com.example.crud_hibernate_coches.Obj.Coche;
import javafx.scene.control.Alert;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    static SessionFactory factory = null;
    static {
        try {
            Configuration cfg = new Configuration(); //Creo un objeto de Configuración de Hibernate
            cfg.configure("config/hibernate.cfg.xml"); //Abrimos el archivo de configuración
            cfg.addAnnotatedClass(Coche.class);
            factory = cfg.buildSessionFactory(); //Crea la fábrica de sesiones
        }catch (Exception e) {
            AlertUtils.showAlert(Alert.AlertType.ERROR, "No se pudo abrir la session. Comprueba que la base de datos está creada correctamente", "Hybernate - Error");
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory; //Devuelve la fábrica
    }

    public static Session getSession() {
        return factory.openSession(); //Abre la sesión
    }

}
