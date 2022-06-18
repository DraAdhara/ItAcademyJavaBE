package cat.itacademy.barcelonactiva.Dominguez.Adhara.s04.t02.n02.model.repository;


import cat.itacademy.barcelonactiva.Dominguez.Adhara.s04.t02.n02.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*@Repository serves as a specialization of @Component, it also enables annotated classes to be discovered and
registered with the application context.

@Component is an annotation that allows Spring to automatically detect our custom beans.

In other words, without having to write any explicit code, Spring will:

Scan our application for classes annotated with @Component
Instantiate them and inject any specified dependencies into them
Inject them wherever needed
However, most developers prefer to use the more specialized stereotype annotations to serve this function.
*/
@Repository
public interface IFruitaRepository extends JpaRepository<Fruita, Integer> {
}

//Now we can use JpaRepository’s methods without implementing these methods.
