package sv.edu.udb.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Inscription;
import sv.edu.udb.service.InscriptionService;

import java.util.List;

@RestController
@RequestMapping("/api/inscriptions")
@RequiredArgsConstructor
public class InscriptionConfig {

    private final InscriptionService inscriptionService;

    @PostMapping
    public Inscription createInscription(@RequestBody Inscription inscription) {
        return inscriptionService.createInscription(inscription);
    }

    @GetMapping
    public List<Inscription> listInscriptions() {
        return inscriptionService.listInscriptions();
    }
}
