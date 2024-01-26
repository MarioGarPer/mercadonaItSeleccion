package es.mario.garcia.springboot.consultaRest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "destino")
public class Destino {
    @Id
    private long id;
    private String nombre;

    public Destino() {
    }

    public Destino(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
