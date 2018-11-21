package TrabalhoDsw.service;

import TrabalhoDsw.Model.Arena;
import TrabalhoDsw.Model.ArenaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dênis
 */

@RestController
@RequestMapping("/arenas")
public class ArenaResource {

    @Autowired
    private ArenaRepositorio arenas;

    @GetMapping("/{id}")
    public Optional<Arena> buscar (@PathVariable Long id) {
        return arenas.findById(id);
    }

    @PostMapping
    public Arena salvar(@RequestBody Arena cli){
        return arenas.save(cli);
    }

    @GetMapping
    public List<Arena> listar(){
        return arenas.findAll();
    }

    @PutMapping
    public Arena editar(@RequestBody Arena cli){
        return arenas.save(cli);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        arenas.deleteById(id);
    }
}