package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFruitaRepository extends JpaRepository<Fruita, Integer> {
}
