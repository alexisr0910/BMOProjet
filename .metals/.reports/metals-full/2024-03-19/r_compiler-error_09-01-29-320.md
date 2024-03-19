file://<WORKSPACE>/GenerateurCode/generated_code.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 538
uri: file://<WORKSPACE>/GenerateurCode/generated_code.java
text:
```scala
public class Compte {
    private int idUtilisateur;;
    private String email;;
    private String motDePasse;;
    public void connexion(String email, String motDePasse) {};
    public void inscription(String email, String motDePasse) {};
    public void deconnexion() {};
}

public class Bookmaker {
    private String nomBookmaker;;
    private Evenement[] evenement;;
    public void creerEvenement(Evenement evenement) {};
    public void modifierEvenement(Evenement evenement) {};
    public void supprimerEvenement(Evenement evene@@ment) {};
}

public class Parieur {
    private String nomParieur;;
    private int jetonSolde;;
    private Paris[] paris;;
    public void recharger(int montantJeton) {};
    public Paris soumettreTicket(Paris paris) { return paris; };
}

public class Evenement {
    private String nomEvenement;;
    private Date debutEvenement;;
    private Sport[] equipes;;
    private int limiteDeGain;;
    private int limiteDeParis;;
    private Cote cotes;;
    private int ecartsDeScore;;
    public boolean verifierDateDebutEvenement(Date debutEvenement) { return true; };
    public boolean verifierLimiteDeGain(int limiteDeGain) { return true; };
    public boolean verifierLimiteDeParis(int limiteDeParis) { return true; };
    public int calculerEcartsScore(List<Sport> sport) { return 0; };
    public void setEcartsDeScore(int ecartsDeScore) {};
}

public class Cote {
    private double coteVictoire;;
    private double coteNul;;
    private double coteDefaite;;
    private double coteEcartsDeScore;;
}

public class Sport {
    private String nomSport;;
    private String equipe;;
    private int scoreEquipe;;
    public String calculIntervalle(int interval) { return null; };
    public String getNomEquipe() { return null; };
    public String getNomSport() { return null; };
    public int getScoreEquipe() { return 0; };
    public void setScore(int score) {};
}

public class SportCollectif {
    private int participants;;
    public int getParticipants() { return 0; };
}

public class SportIndividuel {
}

public class Football {
    private int miTemps1;;
    private int miTemps2;;
}

public class Basket {
    private int quartTemps1;;
    private int quartTemps2;;
    private int quartTemps3;;
    private int quartTemps4;;
}

public class Tennis {
    private int setMin;;
    private int setMax;;
    private int jeuxMin;;
    private int jeuxMax;;
}

public class Chevaux {
}

public class Paris {
    private Evenement evenement;;
    private String nomVainqueur;;
    private boolean nul;;
    private int montantParis;;
    private double gain;;
    private int ecartsDeScore;;
    public double gainPossible(Cote cotes, int montantParis) { return 0; };
}

public class Avancer {
    private Sport sportEquipe;;
    private int interval;;
}


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