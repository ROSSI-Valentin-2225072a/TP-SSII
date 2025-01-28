package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Participation {

    @NonNull
    private String role;

    @NonNull
    private Float pourcentage;

    @Id
    @JoinColumn(name = "matricule_participant", nullable = false)
    @ManyToOne(optional = false)
    private Personne personne;

    @Id
    @JoinColumn(name = "code_projet", nullable = false)
    @ManyToOne(optional = false)
    private Projet projet;
}
