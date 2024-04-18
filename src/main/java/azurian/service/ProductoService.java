package azurian.service;

import azurian.modelo.Producto;
import azurian.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

   @Autowired
   private ProductoRepositorio productoRepositorio;



    @Override
    public List<Producto> listarProductos() {
     return   this.productoRepositorio.findAll();
    }
}
