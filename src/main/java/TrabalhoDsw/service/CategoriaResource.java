package TrabalhoDsw.service;

import TrabalhoDsw.Model.Categoria;
import TrabalhoDsw.Model.CategoriaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Dênis
 */
@RestController
@RequestMapping("categorias")
public class CategoriaResource {
   
    @Autowired
    private CategoriaRepositorio categorias;
    @PostMapping
    public Categoria salvar(@RequestBody Categoria cat){
        return categorias.save(cat);
    }
    
    @GetMapping
    public List<Categoria> listar(){
        return categorias.findAll();
    }
    
    @PutMapping
    public Categoria editar(@RequestBody Categoria cat){
        return categorias.save(cat);
    }
}
