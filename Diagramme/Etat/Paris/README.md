# Diagramme d'État - Processus d'Événement

Ce diagramme d'état représente le processus d'un pari en ligne.

## États

- **Parier (parier)** : État initial où le parieur sélectionne un événement.
- **Evenement (Evenement)** : Le parieur a sélectionné un événement et choisit les paramètres du pari.
- **Parametre (Parametre)** : Le parieur a sélectionné les paramètres du pari, mais ils sont incorrects.
- **Final (finalState)** : Le pari est fait.

## Transitions

- **Parier -> Evenement** : Le parieur sélectionne un événement.
- **Evenement -> Parametre** : Le parieur choisit les paramètres du pari.
- **Parametre -> Evenement** : Les paramètres du pari sont incorrects.
- **Parametre -> Final** : Le pari est effectué avec succès.

