package cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*@Repository serves as a specialization of @Component, it also enables annotated classes to be discovered and
registered with the application context.
*/
@Repository
public interface IFruitaRepository extends JpaRepository<Fruita, Integer> {
}

//Now we can use JpaRepository’s methods without implementing these methods.
