package prueba.buses.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.buses.Model.Bus;
import prueba.buses.Repository.BusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;

    public List<Bus> getAllBuses(){
        return busRepository.findAll();
    }
    public Bus getBusById(Long id) {
        Optional<Bus> bus = busRepository.findById(id);
        if (bus.isPresent()){
            return bus.get();
        }
        else {
            throw new RuntimeException("Bus no encontrado");
        }
    }
}
