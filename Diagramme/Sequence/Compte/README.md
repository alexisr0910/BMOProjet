> **Remarque :** UtilisateurSN -> Utilisateur système nominal UtilisateurSE -> Utilisateur système exceptionnel 

# Diagramme de Séquence Système Nominal pour Utilisateur

Le diagramme de séquence représente les interactions entre l'utilisateur et le site de paris en ligne lorsqu'il est encore qu'un simple spectateur.

## Explication du Diagramme

### Étape 1 : Inscription
- L'utilisateur demande à s'inscrire sur le site de paris en ligne en fournissant son adresse e-mail et son mot de passe.

### Étape 2 : Validation de l'Inscription
- Le site de paris traite la demande d'inscription et enregistre les informations de l'utilisateur.

### Étape 3 : Inscription Réussie
- Une fois l'inscription réussie, le site de paris confirme à l'utilisateur que l'inscription a été effectuée avec succès.

### Étape 4 : Déconnexion
- L'utilisateur demande à se déconnecter du site de paris en ligne.

### Étape 5 : Demande de Déconnexion
- Le site de paris déconnecte l'utilisateur.

### Étape 6 : Confirmation de la Déconnexion
- Le site de paris confirme à l'utilisateur que la déconnexion a été effectuée avec succès.
______

Dans cette seconde partie, nous suivons le processus standard qu'un utilisateur suit lorsqu'il veut se connecter à un paris en ligne.

### Étape 1 : Connexion
- L'utilisateur fournit ses informations de connexion (adresse e-mail et mot de passe) pour se connecter au site de paris en ligne.

### Étape 2 : Validation de la Connexion
- Le site de paris traite la demande de connexion et vérifie les informations fournies.

### Étape 3 : Connexion Réussie
- Une fois la connexion réussie, le site de paris confirme à l'utilisateur que la connexion a été établie avec succès.

> **Remarque :** Nous ne savions pas s'il était possible de représenter deux actions différentes dans le même système nominal malgré qu'elles soient reliées au même acteur. Cependant, nous avons décidé de présenter cela de la manière suivante, avec d'abord le côté "inscription", puis une déconnexion et enfin la connexion avec les mêmes identifiants utilisés pour l'inscription juste avant.

---
---
---

# Explication du Diagramme de Séquence Système Exceptionnel 1

Le diagramme de séquence représente une situation exceptionnelle où l'utilisateur tente de se connecter alors qu'il est déjà connecté.

## Description des Étapes

### Étape 1 : Connexion d'un Utilisateur 
- L'utilisateur tente de se connecter au site de paris en ligne en fournissant ses informations de connexion.

### Étape 2 : Traitement de la Connexion
- Le site de paris traite la demande de connexion et vérifie les informations fournies par l'utilisateur.

### Étape 3 : Erreur de Connexion
- Le système détecte que l'utilisateur est déjà connecté sous le même compte.

### Étape 4 : Gestion de l'Erreur 
- Le site de paris envoie un message d'erreur au parieur, indiquant qu'il est déjà connecté.

---
---
---
# Explication du Diagramme de Séquence Système Exceptionnel 2

Le diagramme de séquence représente une situation exceptionnelle où l'utilisateur tente de s'inscrire avec une adresse e-mail déjà existante sur le site de paris en ligne.

## Description des Étapes

### Étape 1 :Inscription 
- L'utilisateur tente de s'inscrire sur le site de paris en ligne.

### Étape 2 : Validation Inscription
- Le site de paris traite la demande d'inscription et vérifie si l'adresse e-mail fournie est déjà enregistrée dans la base de données.

### Étape 3 : Refusé : Email déja éxistant
- Le système détecte que l'adresse e-mail fournie par l'utilisateur est déjà associée à un compte existant.

### Étape 4 : Gestion de l'erreur
- Le site de paris envoie un message de refus au parieur, indiquant que l'inscription est refusée en raison de la présence d'un compte existant avec l'adresse e-mail fournie.

### Étape 6 : Inscription
- L'utilisateur tente une nouvelle inscription avec une adresse e-mail différente.

### Étape 7 : Validation Inscription
- Le site de paris traite à nouveau la demande d'inscription avec la nouvelle adresse e-mail et vérifie si elle est unique dans la base de données.

### Étape 8 : Accepté
- Le système accepte la demande d'inscription car l'adresse e-mail fournie est unique.

### Étape 9 : Confirmation de l'Inscription Réussie
- Le site de paris confirme à l'utilisateur que l'inscription a été effectuée avec succès.



