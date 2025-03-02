package sv.edu.udb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Event;
import sv.edu.udb.model.Inscription;
import sv.edu.udb.repository.InscriptionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InscriptionService {
    private final InscriptionRepository inscriptionRepository;

    public Inscription createInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    public List<Inscription> listInscriptions() {
        return inscriptionRepository.findAll();
    }
}
