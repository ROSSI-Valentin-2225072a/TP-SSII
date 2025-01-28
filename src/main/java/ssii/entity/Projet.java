package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @NonNull
    private String nom;

    @NonNull
    private LocalDate debut;

    private LocalDate fin;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "projet", orphanRemoval = true)
    @ToString.Exclude
    private List<Participation> participation = new ArrayList<>();
}
