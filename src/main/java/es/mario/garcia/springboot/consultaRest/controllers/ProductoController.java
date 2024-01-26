package es.mario.garcia.springboot.consultaRest.controllers;

import es.mario.garcia.springboot.consultaRest.models.Producto;
import es.mario.garcia.springboot.consultaRest.services.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@Tag(name = "ProductoController", description = "Consulta de productos")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @Operation(summary = "Productos almacenados", description = "Listado de todos los productos almacenados", tags = {"ProductoController"})
    @GetMapping("/productos")
    public @ResponseBody ResponseEntity<List<Producto>> getAllProductos(){
        List<Producto> productos = productoService.getAllProductos();
        return ResponseEntity.ok(productos);
    }
}
