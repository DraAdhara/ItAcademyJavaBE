package cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFruitaRepository extends JpaRepository<Fruita, Integer> {
}
