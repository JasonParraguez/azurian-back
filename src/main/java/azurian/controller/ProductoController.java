package azurian.controller;

import azurian.modelo.Producto;
import azurian.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("Azurian-app/v1")
@CrossOrigin(value="http://localhost:4200")
public class ProductoController {

    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        try {
            List<Producto> productos = this.productoService.listarProductos();
            return productos;
        } catch (Exception e) {
           // cualquier error
            logger.error("Error al obtener la lista de productos: " + e.getMessage());
             return Collections.emptyList();
        }
    }
}
