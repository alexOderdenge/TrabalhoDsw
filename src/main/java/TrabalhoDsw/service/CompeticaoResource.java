package TrabalhoDsw.service;

import TrabalhoDsw.Model.Competicao;
import TrabalhoDsw.Model.CompeticaoRepositorio;
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
@RequestMapping("competicoes")
public class CompeticaoResource {
    
    @Autowired
    private CompeticaoRepositorio competicoes;
    @PostMapping
    public Competicao salvar(@RequestBody Competicao comp){
        return competicoes.save(comp);
    }
    
    @GetMapping
    public List<Competicao> listar(){
        return competicoes.findAll();
    }
    
    @PutMapping
    public Competicao editar(@RequestBody Competicao comp){
        return competicoes.save(comp);
    }
}
