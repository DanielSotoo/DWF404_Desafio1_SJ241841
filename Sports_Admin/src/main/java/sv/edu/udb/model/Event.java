package sv.edu.udb.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "EVENT")

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombreEvento;

    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Column(nullable = false)
    private LocalDate fechaFin;

    @Column(nullable = false)
    private String rangoHoras;

    @Column(nullable = false)
    private String tipoEvento;

    @Column(nullable = false)
    private String rangoEdad;

    @Column(nullable = false)
    private Boolean requerimientoSalud;

    @Column(nullable = false)
    private Double costoTotal;
}