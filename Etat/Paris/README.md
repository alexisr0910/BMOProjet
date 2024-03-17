# Diagramme d'État - Processus d'Événement

Ce diagramme d'état représente le processus d'un paris en ligne.
### États

- **Attente (attente)** : État initial où l'événement est en attente de démarrage.
- **En Cours (enCours)** : L'événement est en cours.
- **Fini (fini)** : L'événement est terminé.
- **Gagné (gagne)** : Le paris est gagné.
- **Perdu (perdu)** : Le paris est perdu.

### Transitions

- **Attente -> En Cours** : L'événement commence.
- **En Cours -> Fini** : L'événement est terminé.
- **Fini -> Gagné** : Le paris est considéré comme réussi.
- **Fini -> Perdu** : Le paris est considéré comme échoué.
- **Gagné -> État Final** : Le paris réussi amène à l'état final.
- **Perdu -> État Final** : Le paris échoué amène également à l'état final.

