package prueba.buses.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MarcaBus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;
}
