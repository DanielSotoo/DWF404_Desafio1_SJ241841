package sv.edu.udb.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "INSCRIPTION")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreDeportista;

    @Column(nullable = false)
    private String documentoIdentificacion;

    @Column(nullable = false)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Event evento;

    @Column(nullable = false)
    private Integer edadDeportista;

    @Column(nullable = false)
    private Boolean condicionMedicaCronica;
}