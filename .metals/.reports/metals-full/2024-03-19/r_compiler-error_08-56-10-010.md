file://<WORKSPACE>/GenerateurCode/generateurcode.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 41
uri: file://<WORKSPACE>/GenerateurCode/generateurcode.java
text:
```scala
class ClassDiagramGenerator:
    def __in@@it__(self, class_diagram):
        self.class_diagram = class_diagram

    def generate_code(self):
        code = ""
        for class_name, attributes in self.class_diagram.items():
            code += f"class {class_name}:\n"
            for attribute in attributes:
                code += f"    {attribute}\n"
            code += "\n"
        return code

class_diagram = {
    "Compte": [
        "idUtilisateur : int",
        "email : string",
        "motDePasse : string",
        "public connexion(email: string, motDePasse:string) : void",
        "public inscription(email: string, motDePasse : string) : void",
        "public deconnexion(): void"
    ],
    "Bookmaker": [
        "nomBookmaker : string",
        "- evenement : Evenement []",
        "public creerEvenement(evenement : Evenement) : void",
        "public modifierEvenement(evenement : Evenement) : void",
        "public supprimerEvenement(evenement : Evenement) : void"
    ],
    "Parieur": [
        "nomParieur : string",
        "jetonSolde : int",
        "- paris : Paris []",
        "public recharger(montantJeton : int) : void",
        "public soumettreTicket(paris : Paris) : Paris"
    ],
    "Evenement": [
        "nomEvenement : string",
        "debutEvenement : date",
        "- equipes : Sport []",
        "limiteDeGain : int",
        "limiteDeParis : int",
        "cotes : Cote",
        "ecartsDeScore : int",
        "public verifierDateDebutEvenement(debutEvenement : date):boolean",
        "public verifierLimiteDeGain(limiteDeGain : int):boolean",
        "public verifierLimiteDeParis(limiteDeParis : int):boolean",
        "public calculerEcartsScore(sport : ListSport):int",
        "public setEcartsDeScore(ecartsDeScore : int):void"
    ],
    "Cote": [
        "coteVictoire : double",
        "coteNul : double",
        "coteDefaite : double",
        "coteEcartsDeScore : double"
    ],
    "Sport": [
        "nomSport : string",
        "equipe : string",
        "scoreEquipe : int",
        "public calculIntervalle(interval : int): string",
        "public getNomEquipe() : string",
        "public getNomSport() : string",
        "public getScoreEquipe() : string",
        "public setScore(score : int) : void"
    ],
    "SportCollectif": [
        "participants : int",
        "public getParticipants() : int"
    ],
    "SportIndividuel": [],
    "Football": [
        "miTemps1 : int",
        "miTemps2 : int"
    ],
    "Basket": [
        "quartTemps1 : int",
        "quartTemps2 : int",
        "quartTemps3 : int",
        "quartTemps4: int"
    ],
    "Tennis": [
        "setMin: int",
        "setMax : int",
        "jeuxMin: int",
        "jeuxMax : int"
    ],
    "Chevaux": [],
    "Paris": [
        "evenement : Evenement",
        "nomVainqueur : string",
        "nul : boolean",
        "montantParis : int",
        "gain : double",
        "ecartsDeScore : int",
        "public gainPossible(cotes: Cote, montantParis: int) : double"
    ],
    "Avancer": [
        "sportEquipe : Sport",
        "interval : int"
    ]
}

generator = ClassDiagramGenerator(class_diagram)
generated_code = generator.generate_code()

# Écrire le code généré dans un fichier
with open("generated_code.py", "w") as file:
    file.write(generated_code)

print("Code généré avec succès dans le fichier generated_code.py")

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:368)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator