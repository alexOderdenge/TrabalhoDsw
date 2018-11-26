package TrabalhoDsw.service;

import TrabalhoDsw.Model.Alternativa;
import TrabalhoDsw.Model.AlternativaRepositorio;
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
 * @author Alex Oderdenge
 */

@RestController
@RequestMapping("/alternativas")
public class AlternativaResource {

    @Autowired
    private AlternativaRepositorio alternativas;

    @GetMapping("/{id}")
    public Optional<Alternativa> buscar (@PathVariable Long id) {
        return alternativas.findById(id);
    }

    @PostMapping
    public Alternativa salvar(@RequestBody Alternativa cli){
        return alternativas.save(cli);
    }

    @GetMapping
    public List<Alternativa> listar(){
        return alternativas.findAll();
    }

    @PutMapping
    public Alternativa editar(@RequestBody Alternativa cli){
        return alternativas.save(cli);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alternativas.deleteById(id);
    }
}
