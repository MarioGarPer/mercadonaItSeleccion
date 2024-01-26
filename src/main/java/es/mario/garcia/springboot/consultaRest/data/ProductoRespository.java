package es.mario.garcia.springboot.consultaRest.data;

import es.mario.garcia.springboot.consultaRest.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "productos")
public interface ProductoRespository  extends JpaRepository<Producto, Long> {
}
