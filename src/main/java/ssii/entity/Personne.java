package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer matricule;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;

    @NonNull
    private String poste;

    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "superieur")
    private List<Personne> subordonnees = new LinkedList<>();

    @ToString.Exclude
    @ManyToOne
    private Personne superieur;


    @ToString.Exclude
    @OneToMany(mappedBy = "personne")
    private List<Participation> participations = new LinkedList<>();

}
