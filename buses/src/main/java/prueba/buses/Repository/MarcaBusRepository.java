package prueba.buses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.buses.Model.MarcaBus;

public interface MarcaBusRepository extends JpaRepository<MarcaBus, Long> {
}
