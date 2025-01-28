package ssii.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ssii.dao.*;
import ssii.entity.Participation;

@Service
@Validated
public class ParticipationService {
    private final ProjetRepository projetDao;
    private final PersonneRepository personneDao;
    private final ParticipationRepository participationDao;

    @Autowired
    public ParticipationService(ProjetRepository projetRepository, PersonneRepository personneRepository, ParticipationRepository participationRepository) {
        this.projetDao = projetRepository;
        this.personneDao = personneRepository;
        this.participationDao = participationRepository;
    }

    @Transactional
    public Participation createParticipation(int projetId, int personneId, String role, float pourcentage) {
        var listeProjet = participationDao.findByPersonneId(personneId);

        if (listeProjet.size() > 2) {
            throw new IllegalArgumentException("La personne ne peut pas participer à plus de 3 projets");
        } else {
            var  nouvelleParticipation = new Participation();
            nouvelleParticipation.setPersonne(personneDao.findById(personneId).get());
            nouvelleParticipation.setRole(role);
            nouvelleParticipation.setProjet(projetDao.findById(projetId).get());
            nouvelleParticipation.setPourcentage(pourcentage);

            participationDao.save(nouvelleParticipation);

            return nouvelleParticipation;
        }
    }
}
