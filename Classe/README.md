> **Remarque :** Lorsque j'ai conçu le diagramme de classe, j'ai eu des difficultés avec DotUml qui ne permettait pas l'utilisation de listes. J'ai donc utilisé des tableaux à la place, même s'ils représentent en fait des listes.

---
<h1 style="color: #AADA9A">Classe Compte</h1>

## Description
La classe `Compte` permet à un utilisateur de se connecter en tant que parieur ou bookmaker.

## Attributs
- `idUtilisateur` : (Type : `int`) - L'identifiant utilisateur permet d'avoir un identifiant unique pour chaque utilisateur.
- `email` : (Type : `string`) - L'adresse e-mail associée au compte.
- `motDePasse` : (Type : `string`) - Le mot de passe associé au compte.

## Méthodes
- `connexion(email: string, motDePasse: string) : void` : Cette fonction permet à un utilisateur de se connecter en fournissant son adresse e-mail et son mot de passe, qui permettra de le reconnaître lors de chaque connexion.
- `inscription(email: string, motDePasse: string) : void` : Cette fonction permet à un nouvel utilisateur de s'inscrire en fournissant une adresse e-mail et un mot de passe (et fournira un nomBookmaker ou un nomUtilisateur en fonction de ce qu'il est).
- `deconnexion() : void` : Cette fonction permet à l'utilisateur actuellement connecté de se déconnecter.

---
<h1 style="color: #AADA9A">Classe Bookmaker</h1>

## Description
La classe `Bookmaker` étend la classe `Compte` et représente un utilisateur qui agit en tant que bookmaker.

## Attributs
- `nomBookmaker` : (Type : `string`) - Le nom du bookmaker.
- `evenements` : (Type : `List<Evenement>`) - Liste des événements que le bookmaker a créés.

## Méthodes
- `creerEvenement(evenement: Evenement) : void` : Cette fonction permet au bookmaker de créer un nouvel événement.
- `modifierEvenement(evenement: Evenement) : void` : Cette fonction permet au bookmaker de modifier un événement existant.
- `supprimerEvenement(evenement: Evenement) : void` : Cette fonction permet au bookmaker de supprimer un événement existant.

---
<h1 style="color: #AADA9A">Classe Parieur</h1>

## Description
La classe `Parieur` étend la classe `Compte` et représente un utilisateur agissant en tant que parieur.

## Attributs
- `nomParieur` : (Type : `string`) - Le nom du parieur.
- `jetonSolde` : (Type : `int`) - Le solde de jetons du parieur.
- `paris` : (Type : `List<Paris>`) - Liste des paris soumis par le parieur.

## Méthodes
- `recharger(montantJeton: int) : void` : Cette fonction permet au parieur de recharger son solde de jetons avec un montant spécifié. Il peut recharger autant de jetons qu'il le souhaite, mais il ne peut pas les retirer.
- `soumettreTicket(paris: Paris) : Paris` : Cette fonction permet au parieur de soumettre un ticket de paris, c'est-à-dire que le parieur peut effectuer un pari qu'il soumettra par la suite.

---
<h1 style="color: #AADA9A">Classe Evenement</h1>

## Description
La classe `Evenement` représente un événement sportif.

## Attributs
- `nomEvenement` : (Type : `string`) - Le nom de l'événement décidé par le bookmaker.
- `debutEvenement` : (Type : `date`) - La date de début de l'événement, utilisée pour déterminer si l'événement a commencé et si les paris peuvent être placés.
- `equipes` : (Type : `List<Sport>`) - Les équipes participant à l'événement. Par exemple, dans un match de football, deux équipes seront sélectionnées.
- `limiteDeGain` : (Type : `int`) - La limite de gain pour l'événement.
- `limiteDeParis` : (Type : `int`) - La limite de paris pour l'événement.
- `cotes` : (Type : `Cote`) - Les cotes associées à l'événement, définies dans la classe `Cote`.
- `ecartsDeScore` : (Type : `int`) - Les écarts de score de l'événement. Cet attribut est optionnel selon le sport.

## Méthodes
- `verifierDateDebutEvenement(debutEvenement: date) : boolean` : Cette fonction vérifie si la date de début de l'événement est valide et si les paris peuvent être placés.
- `verifierLimiteDeGain(limiteDeGain: int, cotes : Cote) : boolean` : Cette fonction vérifie si la limite de gain de l'événement est valide en fonction des différentes cotes.
- `verifierLimiteDeParis(limiteDeParis: int) : boolean` : Cette fonction vérifie si la limite de paris de l'événement est valide.
- `calculerEcartsScore(equipes: List<Sport>) : int` : Cette fonction calcule les écarts de score pour un sport donné. La liste `Sport` sera celle utilisée ci-dessus, et les scores de chaque équipe seront pris en compte.
- `setEcartsDeScore(ecartsDeScore: int) : void` : Cette fonction permet de définir les écarts de score de l'événement, qui seront mis à jour au fur et à mesure du match.

---
<h1 style="color: #AADA9A">Classe Cote</h1>

## Description
La classe `Cote` étend la classe `Evenement` et représente les cotes associées à un événement. Des cotes sont rajoutées si le bookmaker le souhaite.

## Attributs
- `coteVictoire` : (Type : `double`) - La cote associée à la victoire.
- `coteNul` : (Type : `double`) - La cote associée au match nul.
- `coteDefaite` : (Type : `double`) - La cote associée à la défaite.
- `coteEcartsDeScore` : (Type : `double`) - La cote associée aux écarts de score.
- Autres cotes que l'on pourrait décider. Par exemple, si la personne décide de faire un paris avancer, de nouvelle cote seront définis pour ce paris avancer car le parieur prend plus de risque.

---
<h1 style="color: #AADA9A">Classe Sport</h1>

## Description
La classe `Sport` représente un sport spécifique associé à un événement.

## Attributs
- `nomSport` : (Type : `string`) - Le nom du sport.
- `equipe` : (Type : `string`) - Le nom de l'équipe.
- `scoreEquipe` : (Type : `int`) - Le score de l'équipe.

## Méthodes
- `calculerIntervalle(interval: int) : string` : Cette méthode permet de calculer un intervalle spécifié. Exemple : Première mi-temps.
- `getNomEquipe() : string` : Cette méthode permet d'obtenir le nom de l'équipe.
- `getNomSport() : string` : Cette méthode permet d'obtenir le nom du sport.
- `getScoreEquipe() : string` : Cette méthode permet d'obtenir le score de l'équipe.
- `setScore(score: int) : void` : Cette méthode permet de définir le score de l'équipe, qui sera mis à jour au fur et à mesure de l'événement.

---
<h1 style="color: #AADA9A">Classe SportCollectif</h1>

## Description
La classe abstraite `SportCollectif` étend la classe `Sport` et représente un type de sport collectif. Elle contient différentes règles propres à tous les sports collectifs.

## Attributs
- `participants` : (Type : `int`) - Le nombre de participants dans le sport. Exemple : Une équipe de football possède 22 joueurs. Une équipe de tennis peut avoir une équipe de 2.

## Méthodes
- `getParticipants() : int` : Cette méthode permet d'obtenir le nombre de participants dans le sport.

---
<h1 style="color: #AADA9A">Classe SportIndividuel</h1>

## Description
La classe abstraite `SportIndividuel` étend la classe `Sport` et représente un type de sport individuel. Elle contient différentes règles propres à tous les sports individuels.

---
<h1 style="color: #AADA9A">Classe Football</h1>

## Description
La classe `Football` représente un match de football avec les différentes règles spécifiques au football.

## Attributs
- `miTemps1` : (Type : `int`) - Temps de la première mi-temps.
- `miTemps2` : (Type : `int`) - Temps de la deuxième mi-temps.

---

<h1 style="color: #AADA9A">Classe Basket</h1>

## Description
La classe `Basket` représente un match de basket-ball avec les différentes règles spécifiques au basket-ball.

## Attributs
- `quartTemps1` : (Type : `int`) - Temps du premier quart-temps.
- `quartTemps2` : (Type : `int`) - Temps du deuxième quart-temps.
- `quartTemps3` : (Type : `int`) - Temps du troisième quart-temps.
- `quartTemps4` : (Type : `int`) - Temps du quatrième quart-temps.

---

<h1 style="color: #AADA9A">Classe Tennis</h1>

## Description
La classe `Tennis` représente un match de tennis avec les différentes règles spécifiques au tennis.

## Attributs
- `setMin` : (Type : `int`) - Le nombre minimum de jeux dans un set.
- `setMax` : (Type : `int`) - Le nombre maximum de jeux dans un set.
- `jeuMin` : (Type : `int`) - Le nombre de jeux minimum pour gagner.
- `jeuMax` : (Type : `int`) - Le nombre de jeux maximum qui peuvent être joués.

---

<h1 style="color: #AADA9A">Classe Chevaux</h1>

## Description
La classe `Chevaux` représente une course hippique.

<h1 style="color: #AADA9A">Classe Paris</h1>

## Description
La classe `Paris` représente un pari associé à un événement sportif. Un pari est effectué par un parieur.

## Attributs
- `evenement` : (Type : `Evenement`) - L'événement sur lequel le pari est placé.
- `nomVainqueur` : (Type : `string`) - Le nom du vainqueur prévu dans le pari.
- `nul` : (Type : `boolean`) - Indique si le match est nul. Cet attribut est optionnel. Si l'utilisateur décide qu'il y aura une équipe gagnante et une équipe perdante, dans ce cas, il ne prendra pas en compte le match nul et vice-versa.
- `montantParis` : (Type : `int`) - Le montant du pari.
- `gain` : (Type : `double`) - Le gain potentiel du pari. Plusieurs gains pourront être affichés en fonction du nombre de cotes décidées.
- `ecartsDeScore` : (Type : `int`) - Les écarts de score dans le pari. Cette attribut est optionnel

## Méthodes
- `gainPossible(cote: Cote, montantParis: int) : double` : Cette méthode calcule les gains potentiels du pari en fonction des différentes cotes.

---
<h1 style="color: #AADA9A">Classe Avancer</h1>

## Description
La classe `Avancer` représente un type spécifique de pari avancé, qui offre des fonctionnalités supplémentaires en plus des paris traditionnels. Ce type de pari n'est pas obligatoire et permet aux parieurs de spécifier des détails plus précis sur le déroulement d'un événement sportif.

## Attributs
- `sportEquipe` : (Type : `Sport`) - Permet de spécifier les scores de l'équipe sélectionnée dans l'événement sportif. Il offre la possibilité de définir un score pour une équipe à un intervalle donné.
- `interval` : (Type : `int`) - Représente l'intervalle de temps ou de jeu auquel le parieur souhaite placer son pari sur le score d'un match. Si le parieur décide de remplir ce champs, cela veut dire que les données rentré dans sportEquipe seront comptabilisé seulement dans l'interval et cela sera la source du paris. 


## Relation Classe Compte
La classe `Compte` est une classe abstraite.

## Relation Classe Bookmaker
La classe `Bookmaker` étend la classe `Compte`. Un Bookmaker peut définir plusieurs événements.

## Relation Classe Parieur
La classe `Parieur` étend également la classe `Compte`. Un parieur peut soumettre plusieurs paris.

## Relation Classe Evenement
La classe `Evenement` est une classe abstraite. Un événement peut être associé à un ou plusieurs `Sport`, c'est-à-dire plusieurs équipes. De plus, un événement peut être associé à plusieurs paris.

## Relation Classe Cote
La classe `Cote` étend la classe `Evenement` et permet de spécifier les différentes cotes.

## Relation Classe Sport
La classe `Sport` est une classe abstraite. Un sport, donc une équipe, peut être choisi par plusieurs événements.

## Relation Classe SportCollectif et SportIndividuel
Les classes `SportCollectif` et `SportIndividuel` sont abstraites et étendent la classe `Sport`.

## Relation Classe Paris
La classe `Paris` est associée à un seul événement à la fois. De plus, un pari est soumis par un parieur.

## Relation Classe Avancer
La classe `Avancer` est associée à un seul pari à la fois. Si le pari est supprimé, le pari avancé est également supprimé automatiquement car il s'agit d'une composition.
