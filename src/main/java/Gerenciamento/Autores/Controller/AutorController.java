package Gerenciamento.Autores.Controller;

import Gerenciamento.Autores.Models.AutorModel;
import Gerenciamento.Autores.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<AutorModel> Listar(){
        return autorService.Listar();
    }

    @GetMapping("/{id}")
    public AutorModel Buscar (@PathVariable long id){
        return autorService.Buscar(id);
    }

    @PostMapping
    public AutorModel Criar(AutorModel autorModel){
        return autorService.criar(autorModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){
        autorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
