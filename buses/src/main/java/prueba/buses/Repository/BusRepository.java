package prueba.buses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.buses.Model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
