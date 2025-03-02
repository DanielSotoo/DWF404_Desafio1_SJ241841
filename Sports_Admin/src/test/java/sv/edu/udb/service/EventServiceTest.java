package sv.edu.udb.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.model.Event;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class EventServiceTest {

    @Autowired
    private EventService eventService;

    @Test
    void shouldCreateEventSuccessfully() {
        Event event = Event.builder()
                .nombreEvento("Torneo de Fútbol")
                .fechaInicio(LocalDate.now())
                .fechaFin(LocalDate.now().plusDays(3))
                .rangoHoras("08:00-18:00")
                .tipoEvento("Deportivo")
                .rangoEdad("18-30")
                .requerimientoSalud(false)
                .costoTotal(100.0)
                .build();

        Event savedEvent = eventService.createEvent(event);
        assertNotNull(savedEvent);
        assertEquals("Torneo de Fútbol", savedEvent.getNombreEvento());
    }
}