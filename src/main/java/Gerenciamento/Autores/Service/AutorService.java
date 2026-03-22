package Gerenciamento.Autores.Service;

import Gerenciamento.Autores.Models.AutorModel;
import Gerenciamento.Autores.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<AutorModel> Listar(){
        return autorRepository.findAll();
    }

    public AutorModel Buscar(long id){
        return autorRepository.findById(id).get();
    }

    public AutorModel criar(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public void deletar(long id){
        autorRepository.deleteById(id);
    }

}
