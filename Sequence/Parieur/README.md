> **Remarque :** ParieurSN ->Parieur système nominal ParieurSE -> Parieur système excetpionnel 
# Diagramme de Séquence Système Nominal pour Parieur

Le diagramme de séquence système nominal pour le parieur décrit, dans une première parti, le processus standard qu'un parieur suit lorsqu'il effectue un pari sur la plateforme de paris en ligne. Ce diagramme détaille les interactions entre le parieur et le système lors de la réalisation d'un pari.

## Explication du Diagramme

### Étape 1: Faire un Pari
- Le parieur initie le processus en exprimant son intention de faire un pari sur la plateforme.

### Étape 2: Sélectionner un Événement
- Le parieur sélectionne un événement sur lequel il souhaite parier parmi ceux proposés par la plateforme.

### Étape 3: Affichage des Paramètres de l'Événement
- Le système affiche les détails pertinents de l'événement sélectionné pour que le parieur puisse prendre une décision.

### Étape 4: Remplir le Formulaire de Pari
- Le parieur remplit le formulaire de pari en entrant les paramètres requis pour son pari, tels que le vainqueur prévu, le montant du pari, etc.

### Étape 5: Vérification du Montant Possible
- Le système vérifie si le montant du pari est conforme aux règles établies.

### Étape 6: Confirmation du Montant Possible
- Le système confirme au parieur que le montant est conforme aux attentes.

### Étape 7: Soumettre le Ticket du Pari
- Le parieur soumet son ticket de pari pour validation finale.

### Étape 8: Confirmation du Pari
- Le système confirme la prise en compte du pari et son enregistrement.
______

Dans cette seconde partie, nous suivons le processus standard qu'un parieur suit lorsqu'il effectue une recharge de jetons sur le site de paris en ligne.

### Étape 1: Recharger des Jetons
- Le parieur choisit de recharger ses jetons pour pouvoir continuer à parier.

### Étape 2: Quel Somme ?
- Le système demande au parieur quel montant il souhaite entrer.

### Étape 3: Entre la Somme à Recharger
- Le parieur entre le montant qu'il souhaite recharger pour ses jetons.

### Étape 4: Confirmation du Rechargement
- Le système confirme au parieur que le rechargement de jetons a été effectué avec succès.

> **Remarque :** Nous ne savions pas s'il était possible de représenter deux actions différentes dans le même système nominal malgré que c'était relié au même acteur. Cependant, nous avons décidé de présenter cela de la manière suivante, avec d'abord le côté "parier" en premier et ensuite l'action de recharger les jetons en second sur le diagramme.
____
____
____
____

# Processus de Paris d'un Parieur - Diagramme de Séquence Système Exceptionnel 1

Le diagramme de séquence représente les interactions entre le parieur et le système lors de ce processus avec un montant misé trop élevé dans les données rentré.

## Description des Étapes

### Étape 1,2,3,4
Les étapes sont équivalente au système nominal, nous allons donc pas nous répéter.

### Étape 5: Vérification du Montant Possible

- Le système vérifie si le montant saisi par le parieur est possible compte tenu de ses fonds disponibles.

### Étape 6: Confirmation du Montant: Montant Trop Élevé

- Si le montant saisi par le parieur est trop élevé, le système affiche un message de confirmation indiquant que le montant est trop élevé.

### Étape 7: Entrer le Montant du Paris à Nouveau

- Le parieur est invité à entrer à nouveau le montant de son pari, en choisissant un montant moins élevé.

### Étape 8: Confirmation du Montant Possible

- Une fois que le montant saisi est valide, le système confirme que le montant est possible et que le pari peut être placé.

### Étape 9,10,11: 
Idem au premier diagramme.

# Processus de Paris d'un Parieur - Diagramme de Séquence Système Exceptionnel 2


Le diagramme de séquence représente les interactions entre le parieur et le système lors de ce processus avec un solde insuffisant.

## Description des Étapes

### Étape 1,2,3,4
Les étapes sont équivalente au système nominal, nous allons donc pas nous répéter.

### Étape 5: Vérification du Montant Possible

- Le système vérifie si le montant saisi par le parieur est possible compte tenu de ses fonds disponibles.

### Étape 6: Confirmation du Montant: Solde insuffisant

- Le montant saisi par le parieur est supérieur au solde qu'il possède.

### Étape 7: Entrer le Montant du Paris à Nouveau

- Le parieur est invité à entrer à nouveau le montant de son pari, en choisissant un montant compatible avec son solde.

### Étape 8: Confirmation du Montant Possible

- Une fois que le montant saisi est valide, le système confirme que le montant est possible et que le pari peut être placé.

### Étape 9,10,11: 
Idem au premier diagramme.

# Processus de Paris d'un Parieur - Diagramme de Séquence Système Exceptionnel 3


Le diagramme de séquence représente les interactions entre le parieur et le système lors de ce processus avec un montant miser qui est dans les paramètres requis de l'événement mais une fois multiplié à la cote, le gain devient plus élever que le gain possible.

## Description des Étapes

### Étape 1,2,3,4
Les étapes sont équivalente au système nominal, nous allons donc pas nous répéter.

### Étape 5: Vérification du Montant Possible

- Le système vérifie si le montant saisi par le parieur est possible compte tenu de ses fonds disponibles.
### Étape 6: Confirmation du montant possible
- Le montant saisi par le parieur est conforme au paramètre 

### Étape 7: Montant trop élevé par rapport au gain possible

- Le montant une fois mutltiplier par la cote deviens supérieur au gain possible.

### Étape 8: Propose au parieur de mettre un montant plus faible
- Le parieur est invité à entrer à nouveau un montant plus faible si il le souhaite.

### Étape 9: Confirmation du Montant Possible

- Une fois que le montant saisi est valide, le système confirme que le montant est possible et que le pari peut être placé.

### Étape 10,11,12: 
Idem au premier diagramme.




