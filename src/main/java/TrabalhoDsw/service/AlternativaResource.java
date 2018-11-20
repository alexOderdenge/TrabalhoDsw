package TrabalhoDsw.service;

import TrabalhoDsw.Model.Altenativa;
import TrabalhoDsw.Model.AlternativaRepositorio;
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
@RequestMapping("alternativas")
public class AlternativaResource {
    
    @Autowired
    private AlternativaRepositorio alternativas;
    @PostMapping
    public Altenativa salvar(@RequestBody Altenativa alter){
        return alternativas.save(alter);
    }
    
    @GetMapping
    public List<Altenativa> listar(){
        return alternativas.findAll();
    }
    
    @PutMapping
    public Altenativa editar(@RequestBody Altenativa alter){
        return alternativas.save(alter);
    }
}
