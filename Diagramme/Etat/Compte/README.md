# Diagramme d'État - Processus Utilisateur

Ce diagramme d'état représente le processus suivi par un utilisateur sur notre plateforme de paris en ligne.

### États

- **Attente Utilisateur (AttenteUtilisateur)** : État initial où l'utilisateur attend avant de choisir entre l'inscription et la connexion. C'est, à ce stade, un simple visiteur.
- **Inscription (Inscription)** : L'utilisateur choisit de s'inscrire sur la plateforme.
- **Authentifié (Authentifié)** : L'utilisateur saisit ses informations d'identification pour se connecter à son compte.
- **Connexion (Connexion)** : L'utilisateur choisit de se connecter à son compte existant.
- **Déconnexion (Deconnexion)** : L'utilisateur connecté choisit de se déconnecter.
- **État Final (finalState)** : État final indiquant la fin du processus.

### Transitions

- **Attente Utilisateur -> Inscription** : L'utilisateur choisit de s'inscrire sur la plateforme.
- **Attente Utilisateur -> Connexion** : L'utilisateur choisit de se connecter à son compte existant.
- **Inscription -> Attente Utilisateur** : En cas d'échec de l'inscription, l'utilisateur revient à l'état initial.
- **Connexion -> Attente Utilisateur** : En cas d'échec de la connexion, l'utilisateur revient à l'état initial.
- **Inscription -> Authentification** : L'inscription réussie entraîne le passage à Authentifié.
- **Connexion -> Authentification** : La connexion réussie entraîne également le passage à Authentifié.
- **Authentification -> Déconnexion** : L'utilisateur connecté choisit de se déconnecter.
- **Déconnexion -> État Final** : La déconnexion réussie amène à l'état final, marquant la fin du processus.
