package Gerenciamento.Autores.Repository;

import Gerenciamento.Autores.Models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {

}
