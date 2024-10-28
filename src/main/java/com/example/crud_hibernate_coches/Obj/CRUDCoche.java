package com.example.crud_hibernate_coches.Obj;

import java.util.ArrayList;

public interface CRUDCoche {
    public ArrayList<Coche> listarCoches();
    public Coche getCoche(String matricula);
    public boolean insertarCoche(Coche coche);
    public boolean actualizarCoche(Coche coche);
    public boolean borrarCoche(Coche coche);
}
