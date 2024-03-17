# Explication du Diagramme de Séquence Système Nominal pour le Bookmaker

Le diagramme de séquence système nominal pour le bookmaker décrit le processus standard suivi par le bookmaker lors de la création d'un nouvel événement sportif sur la plateforme de paris en ligne.

## Explication du Diagramme

### Étape 1 : Création d'un Événement 
   - Le processus démarre lorsque le bookmaker décide de créer un nouvel événement sur la plateforme.

### Étape 2 : Sélection d'un Sport 
   - Le bookmaker commence par sélectionner le sport correspondant à l'événement qu'il souhaite créer. 

### Étape 3 : Affichage des Paramètres du Sport 
   - Une fois le sport sélectionné, le système affiche les paramètres spécifiques associés à ce sport.

### Étape 4 : Événement non créé
   - Le site de paris en ligne renvoie un message au bookmaker pour lui dire que l'événement n'existe pas.

### Étape 5 : Saisie des Informations de l'Événement 
   - Le bookmaker entre les détails de l'événement, tels que le nom de l'événement, la date, les équipes ou participants impliqués, ainsi que d'autres informations pertinentes pour les parieurs.

### Étape 6 : Définition des Cotes 
   - Le bookmaker définit les cotes pour les différents résultats possibles de l'événement. 

### Étape 7 : Confirmation de l'Événement 
   - Le bookmaker confirme la création de l'événement. Cette étape finalise le processus de création et soumet l'événement pour qu'il soit rendu disponible aux parieurs sur la plateforme.

### Étape 8 : Confirmation de l'Événement par le Système 
   - Le système confirme la création réussie de l'événement. Cette confirmation assure au bookmaker que l'événement a été correctement enregistré dans le système et est prêt à être proposé aux parieurs.

---
---
---
# Explication du Diagramme de Séquence Système Exceptionnel 1 pour le Bookmaker

Le diagramme de séquence système exceptionnel pour le bookmaker décrit le processus standard suivi par le bookmaker lors de la création d'un nouvel événement sportif mais cette fois, avec la création d'un doublon d'un événement.

## Explication du Diagramme

### Étapes 1,2,3 : 
   - Identique au diagramme nominal.

### Étape 4 : Saisie du Nom de l'Événement
   - Le bookmaker saisit le nom de l'événement.

### Étape 5 : Événement déjà existant 
   - Le système lui renvoie un message d'erreur pour lui dire qu'un événement avec le même nom existe déjà.
  
### Étape 6 : Saisie d'un Nouveau Nom de l'Événement
   - Le bookmaker saisit un nouveau nom d'événement.

### Étapes 7, 8, 9: 
   - Identiques au système nominal.

# Explication du Diagramme de Séquence Système Exceptionnel 2 pour le Bookmaker

Le diagramme de séquence système exceptionnel pour le bookmaker décrit le processus standard suivi par le bookmaker lors de la création d'un nouvel événement sportif mais cette fois, avec la création d'un doublon d'un événement.

## Explication du Diagramme

### Étapes 1,2,3,4 : 
   - Identique au diagramme nominal.

### Étape 5 : Date non valide
   - Le système lui renvoie un message d'erreur pour lui dire que la date est non valide, c'est à dire que la date est passée.
  
### Étape 6 : Saisie d'une nouvelle date
   - Le bookmaker saisit une nouvelle date.

### Étapes 7, 8, 9: 
   - Identiques au système nominal.

