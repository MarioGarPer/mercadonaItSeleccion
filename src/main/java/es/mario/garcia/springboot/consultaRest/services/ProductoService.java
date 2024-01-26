package es.mario.garcia.springboot.consultaRest.services;

import es.mario.garcia.springboot.consultaRest.data.ProductoRespository;
import es.mario.garcia.springboot.consultaRest.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRespository productoRespository;

    public ProductoService(ProductoRespository productoRespository) {
        this.productoRespository = productoRespository;
    }

    public List<Producto> getAllProductos(){
        return productoRespository.findAll();
    }
}
