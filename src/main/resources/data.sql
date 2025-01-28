INSERT INTO Personne (nom, prenom, poste) VALUES
    ('Dupont', 'Jean', 'DRH'),
    ('Ize', 'Jean-Charles', 'Athlete'),
    ('Prevel', 'Arthur', 'Dev'),
    ('Pelissou', 'Jules', 'Dev'),
    ('Nogues', 'Camille', 'ASV'),
    ('Bonnefous', 'Barnabe', 'RSSI');

INSERT INTO Projet (nom, debut, fin) VALUES
    ('Gitoube', '2021-01-01', '2021-02-01'),
    ('Cookie, le chat de la voisine', '2021-02-01', '2021-03-01'),
    ('Cartographie des SI', '2021-03-01', '2021-04-01'),
    ('Archivage', '2021-04-01', '2021-05-01'),
    ('Les pims framboise absolument délicieux ces gateaux', '2021-05-01', null);

INSERT INTO Participation (role, pourcentage, matricule_participant, code_projet) VALUES
    ('Chef de projet', 100, 1, 1),
    ('Developpeur', 50, 3, 1),
    ('Developpeur', 50, 4, 1),
    ('Responsable chat', 100, 6, 2),
    ('Chef de carto des SI', 75, 6, 3),
    ('Aide carto des SI', 25, 3, 3);
