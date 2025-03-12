package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa toda";
    }

    //Adicionar ninja(CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //Mostrar todos os ninjas(READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar ninja";
    }

    //Mostrar ninja por id(READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar ninja por ID";
    }

    //Alterar dados dos ninjas(UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorID(){
        return "Alterar ninja por ID";
    }

    //Deletar Ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "deletar ninja por id";
    }

}
