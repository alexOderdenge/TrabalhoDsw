/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoDsw.service;

import TrabalhoDsw.TrabalhoDsw.Model.CriterioMissao;
import TrabalhoDsw.TrabalhoDsw.Model.CriterioMissaoRepositorio;
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
@RequestMapping("criterios")
public class CriterioMissaoResource {
    
    @Autowired
    private CriterioMissaoRepositorio criterios;
    @PostMapping
    public CriterioMissao salvar(@RequestBody CriterioMissao cri){
        return criterios.save(cri);
    }
    
    @GetMapping
    public List<CriterioMissao> listar(){
        return criterios.findAll();
    }
    
    @PutMapping
    public CriterioMissao editar(@RequestBody CriterioMissao cri){
        return criterios.save(cri);
    }
}
