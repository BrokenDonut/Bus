package prueba.buses.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numeroBus;

    @Column(nullable = false, unique = true)
    private String placa;

    @Column(nullable = false, updatable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Column(columnDefinition = "TEXT")
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private MarcaBus marcaBus;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;

    public enum Estado {
        Activo, Inactivo
    }
}
