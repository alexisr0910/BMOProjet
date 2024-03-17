> **Remarque :** Les fichiers sont simplement nommés Compte, Paris ou Evenement pour une meilleure clarté. Dans un même diagramme UML, on peut trouver deux diagrammes UML distincts. S'ils ne sont pas reliés, cela signifie qu'il s'agit de deux diagrammes séparés. Nous les avons créés dans le même fichier .dotuml pour éviter de créer trop de fichiers.


# Evenement.dotuml

Dans le fichier Evenement.dotuml, nous présentons un diagramme d'objet représentant un événement sportif sur notre plateforme de paris en ligne. 

---

### Description
Ce diagramme illustre les différentes caractéristiques d'un événement sportif disponible pour les paris.

- **Evenement :**
  - Chaque événement est identifié par un nom spécifique, tel que "Match Europa League".
  - La date de début de l'événement est également enregistrée, dans cet exemple le 15 avril 2024.
  - La limite de gain et la limite de paris définissent respectivement le montant maximum que les parieurs peuvent gagner et le montant maximum total des paris acceptés pour cet événement.
  - L'écart de score représente la différence maximale de score entre les équipes participantes à cet événement.

- **Cote :**
  - Les cotes associées à l'événement sont enregistrées, comprenant la cote de la victoire, la cote du match nul, la cote de la défaite et la cote de l'écart de score.

- **Sport1 et Sport2 :**
  - Ces classes représentent les équipes participant à l'événement. Chaque équipe est associée à un sport spécifique et dispose d'un nom d'équipe, telles que "Rennes" et "PSG". De plus, le score initial de chaque équipe est défini à 0 et sera mis à jours au fur et à mesure du match.

- **SportCollectif1 et SportCollectif2 :**
  - Ces classes représentent le nombre de participants pour chaque équipe. Dans cet exemple, l'équipe associée à Sport1 a 22 participants, tandis que l'équipe associée à Sport2 a 21 participants.

---



---
# Paris.dotuml

Dans le fichier Paris.dotuml, nous présentons deux diagrammes d'objets :

---

### Description
Ces diagrammes représentent des instances de paris sur notre plateforme de paris en ligne.

- ### Diagramme Paris1
Ce diagramme illustre un exemple de paris sur un match de l'Europa League. Dans ce cas, le parieur a misé sur la victoire de l'équipe Rennes avec un montant de 1000 jetons. En cas de victoire de Rennes, le parieur remporterait 1200 unités, tandis qu'en cas de défaite, il remporterait 700 unités. De plus, le parieur à fais un paris avancé et à décider que Rennes à un score de 3 et PSG 2.
Les différentes cotes du paris sont affiche en fonction du choix du parieur. Si il décide de parier sur un match nul, il verra s'afficher que la cote du match nul.

- ### Diagramme Paris2
Ce diagramme représente un exemple de paris sur un match de l'Europa League avec une possibilité de match nul. Le parieur a misé un montant de 1000 unités sur le résultat nul du match. En cas de match nul, le parieur remporterait 1900 unités.

---

# Compte.dotuml

Nous présentons trois diagrammes d'objets :

---

### Description
Ces diagrammes représentent le profil d'un utilisateur.

- ### Diagramme Compte1
Ce diagramme représente l'état d'un compte utilisateur. Chaque compte est identifié par une adresse e-mail et est associé à un mot de passe sécurisé. Dans cet exemple, nous avons utilisé un compte fictif avec l'adresse e-mail "email@email.com" et un mot de passe hashé.

- ### Diagramme Parieur
Ce diagramme illustre le profil d'un parieur sur notre plateforme de paris en ligne. Chaque parieur possède un nom d'utilisateur spécifique, ici "AlexisAmaury", ainsi qu'un solde de jetons qui représente la quantité de monnaie virtuelle qu'il a à sa disposition pour placer des paris. Dans cet exemple, notre parieur fictif dispose de 100 jetons. De plus, nous montrons qu'il a déjà placé un pari sur un match de l'Europa League.



### Diagramme Compte2 
Ce diagramme illustre l'état d'un compte utilisateur au moment de la connexion. L'utilisateur entre son adresse e-mail et son mot de passe, qui sont alors vérifiés par le système. 

---