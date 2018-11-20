package TrabalhoDsw.service;

import TrabalhoDsw.Model.Arena;
import TrabalhoDsw.Model.ArenaRepositorio;
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
@RequestMapping("arenas")
public class ArenaResource {
     
    @Autowired
    private ArenaRepositorio arenas;
    @PostMapping
    public Arena salvar(@RequestBody Arena are){
        return arenas.save(are);
    }
    
    @GetMapping
    public List<Arena> listar(){
        return arenas.findAll();
    }
    
    @PutMapping
    public Arena editar(@RequestBody Arena are){
        return arenas.save(are);
    }
}
 