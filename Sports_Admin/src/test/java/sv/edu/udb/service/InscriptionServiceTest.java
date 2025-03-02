package sv.edu.udb.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.model.Event;
import sv.edu.udb.model.Inscription;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class InscriptionServiceTest {

    @Autowired
    private InscriptionService inscriptionService;

    @Autowired
    private EventService eventService;

    @Test
    void shouldCreateInscriptionSuccessfully() {
        Event event = eventService.createEvent(Event.builder()
                .nombreEvento("Carrera 10K")
                .fechaInicio(LocalDate.now())
                .fechaFin(LocalDate.now().plusDays(1))
                .rangoHoras("06:00-12:00")
                .tipoEvento("Atletismo")
                .rangoEdad("18-40")
                .requerimientoSalud(false)
                .costoTotal(50.0)
                .build());

        Inscription inscription = Inscription.builder()
                .nombreDeportista("Juan Pérez")
                .documentoIdentificacion("12345678-9")
                .telefono("+50312345678")
                .evento(event)
                .edadDeportista(25)
                .condicionMedicaCronica(false)
                .build();

        Inscription savedInscription = inscriptionService.createInscription(inscription);
        assertNotNull(savedInscription);
        assertEquals("Juan Pérez", savedInscription.getNombreDeportista());
    }
}