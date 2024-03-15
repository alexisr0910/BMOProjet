> **Remarque :** Lorsque j'ai conçu le diagramme de classe, j'ai eu des difficultés avec DotUml qui ne permettait pas l'utilisation de listes. J'ai donc utilisé des tableaux à la place, même s'ils représentent en fait des listes.

---
<h1 style="color: #AADA9A  ">Classe Compte</h1>

## Description
La classe `Compte` permet à un utilisateur de se connecter en tant que parieur ou bookmaker. Elle gère les fonctionnalités de connexion, inscription et déconnexion.

## Attributs
- `idUtilisateur` : (Type : `int`) - L'identifiant utilisateur permet d'avoir un identifiant unique pour chaque utilisateur.
- `email` : (Type : `string`) - L'adresse e-mail associée au compte.
- `motDePasse` : (Type : `string`) - Le mot de passe associé au compte.

## Méthodes
- `connexion(email: string, motDePasse: string) : void` : Cette fonction permet à un utilisateur de se connecter en fournissant son adresse e-mail et son mot de passe.
- `inscription(email: string, motDePasse: string) : void` : Cette fonction permet à un nouvel utilisateur de s'inscrire en fournissant une adresse e-mail et un mot de passe.
- `deconnexion() : void` : Cette fonction permet à l'utilisateur actuellement connecté de se déconnecter.



---
<h1 style="color: #AADA9A">Classe Bookmaker</h1>

## Description
La classe `Bookmaker` étend la classe `Compte` et représente un utilisateur qui agit en tant que bookmaker. Elle permet de créer, modifier et supprimer des événements associés aux paris.

## Attributs
- `nomBookmaker` : (Type : `string`) - Le nom du bookmaker.
- `evenement` : (Type : `List<Evenement>`) - Liste des événements que le bookmaker a créés.

## Méthodes
- `creerEvenement(evenement: Evenement) : void` : Cette fonction permet au bookmaker de créer un nouvel événement.
- `modifierEvenement(evenement: Evenement) : void` : Cette fonction permet au bookmaker de modifier un événement existant.
- `supprimerEvenement(evenement: Evenement) : void` : Cette fonction permet au bookmaker de supprimer un événement existant.

---
<h1 style="color: #AADA9A">Classe Parieur</h1>

## Description
La classe `Parieur` étend la classe `Compte` et représente un utilisateur agissant en tant que parieur. Elle permet de recharger son solde de jetons et de soumettre des tickets de paris c'est à dire d'effectuer des paris.

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
La classe `Evenement` représente un événement sportif. Elle contient des informations telles que le nom de l'événement, sa date de début, les équipes participant à l'événement, les limites de gain et de paris, les cotes, les écarts de score, ainsi que des méthodes pour vérifier et définir ces paramètres.

## Attributs
- `nomEvenement` : (Type : `string`) - Le nom de l'événement décidé par le bookmaker.
- `debutEvenement` : (Type : `date`) - La date de début de l'événement, utilisée pour déterminer si l'événement a commencé et si les paris peuvent être placés.
- `Equipe` : (Type : `List<Sport>`) - Les équipes participant à l'événement. Par exemple, dans un match de football, deux équipes seront sélectionnées.
- `limiteDeGain` : (Type : `int`) - La limite de gain pour l'événement.
- `limiteDeParis` : (Type : `int`) - La limite de paris pour l'événement.
- `cote` : (Type : `Cote`) - Les cotes associées à l'événement, définies dans la classe `Cote`.
- `ecartsDeScore` : (Type : `int`) - Les écarts de score de l'événement. Cet attribut est optionnel.

## Méthodes
- `verifierDateDebutEvenement(debutEvenement: date) : boolean` : Cette fonction vérifie si la date de début de l'événement est valide et si les paris peuvent être placés.
- `verifierLimiteDeGain(limiteDeGain: int) : boolean` : Cette fonction vérifie si la limite de gain de l'événement est valide.
- `verifierLimiteDeParis(limiteDeParis: int) : boolean` : Cette fonction vérifie si la limite de paris de l'événement est valide.
- `ecartsScore(sport: List<Sport>) : int` : Cette fonction calcule les écarts de score pour un sport donné. La liste `Sport` sera celle utilisée ci-dessus, et les scores de chaque équipe seront pris en compte.
- `setEcartsDeScore(ecartsDeScore: int) : void` : Cette fonction permet de définir les écarts de score de l'événement, qui seront mis à jour au fur et à mesure du match.




<!-- dire que evnt correspond au match !-->
