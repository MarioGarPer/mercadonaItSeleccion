package es.mario.garcia.springboot.consultaRest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    private String idEan;
    private long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;
    @ManyToOne()
    @JoinColumn(name = "destino_id")
    private Destino destino;

    public Producto() {
    }

    public Producto(long id, String nombre, Proveedor proveedor, Destino destino) {
        this.id = id;
        this.idEan = String.valueOf(proveedor.getId()).concat(String.valueOf(id)).concat(String.valueOf(destino.getId())) ;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.destino = destino;
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getIdEan() {
        return idEan;
    }

    public void setIdEan(String idEan) {
        this.idEan = idEan;
    }
}
