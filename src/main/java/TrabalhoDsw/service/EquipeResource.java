/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoDsw.service;

import TrabalhoDsw.TrabalhoDsw.Model.Equipe;
import TrabalhoDsw.TrabalhoDsw.Model.EquipeRepositorio;
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
@RequestMapping("equipes")
public class EquipeResource {
    
    @Autowired
    private EquipeRepositorio equipes;
    @PostMapping
    public Equipe salvar(@RequestBody Equipe equip){
        return equipes.save(equip);
    }
    
    @GetMapping
    public List<Equipe> listar(){
        return equipes.findAll();
    }
    
    @PutMapping
    public Equipe editar(@RequestBody Equipe comp){
        return equipes.save(comp);
    }
}
