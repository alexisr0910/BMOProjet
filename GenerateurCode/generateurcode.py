class Classgenerateurcode:
    def __init__(self, class_diagram):
        self.class_diagram = class_diagram

    def generateurcode(self, class_name, attributes):
        code = ""
        code += "import javax.persistence.*;\n"
        code += "import javax.persistence.Entity;\n"
        code += "import org.hibernate.annotations.*;\n"
        code += "import org.openxava.annotations.*;\n"
        code += "import lombok.*;\n\n"
        code += f"@Entity\n@Getter @Setter\npublic class {class_name} " + "{\n"
        for attribute in attributes:
            code += f"    @Column(length=50)\n"
            code += f"    {attribute};\n"
        code += "}\n"
        return code

class_diagram = {
    "Compte": [
        "int idUtilisateur;",
        "String email;",
        "String motDePasse;",
        "public void connexion(String email, String motDePasse) {}",
        "public void inscription(String email, String motDePasse) {}",
        "public void deconnexion() {}"
    ],
    "Bookmaker": [
        "String nomBookmaker;",
        "Evenement[] evenement;",
        "public void creerEvenement(Evenement evenement) {}",
        "public void modifierEvenement(Evenement evenement) {}",
        "public void supprimerEvenement(Evenement evenement) {}"
    ],
    "Parieur": [
        "String nomParieur;",
        "int jetonSolde;",
        "Paris[] paris;",
        "public void recharger(int montantJeton) {}",
        "public Paris soumettreTicket(Paris paris) { return paris; }"
    ],
    "Evenement": [
        "String nomEvenement;",
        "Date debutEvenement;",
        "Sport[] equipes;",
        "int limiteDeGain;",
        "int limiteDeParis;",
        "Cote cotes;",
        "int ecartsDeScore;",
        "public boolean verifierDateDebutEvenement(Date debutEvenement) { return true; }",
        "public boolean verifierLimiteDeGain(int limiteDeGain) { return true; }",
        "public boolean verifierLimiteDeParis(int limiteDeParis) { return true; }",
        "public int calculerEcartsScore(List<Sport> sport) { return 0; }",
        "public void setEcartsDeScore(int ecartsDeScore) {}"
    ],
    "Cote": [
        "double coteVictoire;",
        "double coteNul;",
        "double coteDefaite;",
        "double coteEcartsDeScore;"
    ],
    "Sport": [
        "String nomSport;",
        "String equipe;",
        "int scoreEquipe;",
        "public String calculIntervalle(int interval) { return null; }",
        "public String getNomEquipe() { return null; }",
        "public String getNomSport() { return null; }",
        "public int getScoreEquipe() { return 0; }",
        "public void setScore(int score) {}"
    ],
    "SportCollectif": [
        "int participants;",
        "public int getParticipants() { return 0; }"
    ],
    "SportIndividuel": [],
    "Football": [
        "int miTemps1;",
        "int miTemps2;"
    ],
    "Basket": [
        "int quartTemps1;",
        "int quartTemps2;",
        "int quartTemps3;",
        "int quartTemps4;"
    ],
    "Tennis": [
        "int setMin;",
        "int setMax;",
        "int jeuxMin;",
        "int jeuxMax;"
    ],
    "Chevaux": [],
    "Paris": [
        "Evenement evenement;",
        "String nomVainqueur;",
        "boolean nul;",
        "int montantParis;",
        "double gain;",
        "int ecartsDeScore;",
        "public double gainPossible(Cote cotes, int montantParis) { return 0; }"
    ],
    "Avancer": [
        "Sport sportEquipe;",
        "int interval;"
    ]
}

generator = Classgenerateurcode(class_diagram)

for class_name, attributes in class_diagram.items():
    generated_code = generator.generateurcode(class_name, attributes)
    file_name = f"{class_name}.java"
    with open(file_name, "w") as file:
        file.write(generated_code)

