# Application de Paris en Ligne

Pour la création de l'application, nous avons décidé de la présenter du point de vue d'un parieur.

## Fonctionnalités

### Création d'événements
Avant de pouvoir effectuer un pari, nous avons du créer des événements sportif. Pour cela, nous avons mis en place les fonctionnalités suivantes :
- Création de la classe Événement pour représenter un événement sportif.
- Création des classes Sport et Cote, directement reliées à la classe Événement, pour gérer les détails spécifiques du sport et les cotes associées.

### Connexion et création de parieur
Pour participer aux paris, un utilisateur doit d'abord se connecter et devenir un parieur. Nous avons implémenté les fonctionnalités suivantes :
- Création de la classe Compte pour gérer l'authentification et la connexion des utilisateurs.
- Création de la classe Parieur pour représenter un utilisateur connecté et autorisé à effectuer des paris.

### Réalisation de paris
Une fois connecté, un parieur peut effectuer des paris sur les événements disponibles.
- Sélection de l'événement sur lequel parier.
- Choix des paramètres du pari. Dans les paramètres avancés, seuls les éléments des sports collectifs sont affichés. Par la suite, dans une futur mis à jour de l'application, lorsque l'événement sera un sport individuel, le paris avancé aura des paramètres lié au sport individuel.
___
___
___
___

## Utilisation des classes
Nous avons rencontré des difficultés pour utiliser les classes extends telles que Parieur ou Cote. Par conséquent, nous avons opté pour l'utilisation de relations ou de rien.

