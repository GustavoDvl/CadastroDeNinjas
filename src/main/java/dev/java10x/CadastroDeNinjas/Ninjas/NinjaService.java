package dev.java10x.CadastroDeNinjas.Ninjas;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {


    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Cria um novo Ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Deleta ninja - Tem que ser um metodo void
    public void deletaNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }

    //Atualizar ou corrigir ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAlualizado) {
        if(ninjaRepository.existsById(id)){
            ninjaAlualizado.setId(id);
            return ninjaRepository.save(ninjaAlualizado);
        }
        return null;
    }
}

