package ssii.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ssii.entity.Participation;
import ssii.entity.Personne;

import java.util.List;

public interface ParticipationRepository extends JpaRepository<Participation, Integer> {

    @Query("SELECT p FROM Participation p WHERE p.personne.matricule = :personneId")
    List<Personne> findByPersonneId(int personneId);

}
