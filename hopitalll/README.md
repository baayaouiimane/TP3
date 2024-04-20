
# Hopitallll
Vocation principale:
Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :
•	Afficher les patients
•	Faire la pagination
•	Chercher les patients
•	Supprimer un patient
•	Faire des améliorations supplémentaires
Dans cette partie on va effectuer la création du projet nommée hopitall et en faisant par la suite le choix des différentes dépendances dont on aura besoin pour travailler
Premièrement on a créé un package nomme entities et à l’intérieur de ce dernier on a créé une classe appelée Patient qui comporte les attributs ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/fb48f66a-7ed6-41c3-aa51-3cd57b0e71e2)
Ensuite on a créé un package nomme  repository et à l’intérieur de ce dernier on a créé une interface PatientRepository :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/66867138-d8dd-4c18-96a8-58f22fdf3535)
Par la suite on passe pour tester dans  le fichier application .properties comme il est affiché ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/1fe6f531-2760-4840-aba1-8742d3f9a855)
Et on exécute notre application ou on a fait des modications bien concise :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/3e0d955b-6239-4d52-9f22-cb64abae9702)
Et d’après l’affichage ci-dessous on remarque que l’application est bien démarrée.
![image](https://github.com/baayaouiimane/TP3/assets/167249908/832b3720-7ba7-413e-b9ae-865dae6f227d)
Par la suite on lance le browser :localhost:8084/h2-console
Et aura un affichage qui est le suivant :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/408b4c57-e459-412d-b2c0-9f3af8390052)
En cliquant sur le bouton connect on est redirigé vers une autre page et en cliquant sur la table patient  on a une génération automatique de la requête.
![image](https://github.com/baayaouiimane/TP3/assets/167249908/ed27f0a5-3f18-404f-a839-d062e919ef15)
Et en cliquant sur le bouton run on a le résultat ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/d712bfa3-6a10-4206-bfac-768c40698d44)
Et donc cette fois ci pour travailler la partie web au niveau du package web qui est déjà créer on doit créer un controleur c’est à dire une classe PatientController :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/5c4e6e9c-cd57-49c1-9714-f944e94d578f)
Quand on tape « /index » on va avoir un retour d’une vue nommée patients.html et du coup ce patient.html on doit le créer dans un dossier qui s’appelle templates comme apparait ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/b5f58d07-f8bb-4ef7-a6c8-4b37cd693cdd)
Et on redémarre une autre fois :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/a11a7fe9-7323-4b8e-986f-a433e4342187)
Par la suite on lance le browser :localhost:8084/index
Et on obtient le résultat souhaite :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/714a4188-98c7-47f1-bfe8-f74b4210c7b7)
Cette fois ci on veut afficher la liste des patients :
On revient au controleur :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/c92cc8ee-ff59-4fca-8082-8a58ba1b6603)
Revenant donc à la vue pour afficher la liste des patients on aura besoin d’utiliser themleaf comme il est présenté :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/5f7d8a6d-cd02-4a19-a92a-80771d970acf)
![image](https://github.com/baayaouiimane/TP3/assets/167249908/116609dd-05a3-4521-9978-46af6f904dd5)
En redémarrant on remarque que tout se passe bien :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/b26194b4-c2ef-47c6-8e0d-fffa02e2d162)
En visitant : localhost:8084/index on obtient le résultat ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/8edfff36-478b-4e5f-9cbf-b40ef2e5ff1e)
Mais l’affichage n’est pas joli on souhaite utiliser bootsrap .Pour travailler avec ce dernier on aura besoin d’ajouter une dépendance qui s’appelle webjars bootstrap 5 maven dependency et on utilise la version 5 on ajoute la dépendance au fichier pom.xml :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/a6797cee-47d9-4ed8-a6db-6bc60885f192)
Et par la suite  pour savoir comment utiliser bootstrap on doit effectuer des modifications dans patients.html :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/ce53b020-e4e3-461f-b54d-0533f3dfca3a)
![image](https://github.com/baayaouiimane/TP3/assets/167249908/dab80ef1-a4d6-4401-b173-50ecaca189b3)
Et on redémarre une autre fois, et cette fois ci on aura un affichage beaucoup mieux :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/e6422497-0632-4e49-8de4-fe86fd0d5ae5)
En faisant des modications vous allez noter la différence :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/c9cb3a57-3268-41f1-ba23-29d935d87e1e)
Et maintenant on doit basculer de la base donnée h2 vers la base donnée mysql, et donc il faut ajouter une dépendance dans le fichier pom.xml :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/37299ecc-4878-44cb-8710-509789eb71cb)
Et par la suite on doit ajouter quelques dépendances dans le fichier application.properties :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/ba6982d0-990a-47a3-a5f3-db34e821520b)
Ensuite on démarre l’application :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/ee63003d-cb2c-43b2-bd3e-e5e54d984b18)
Si on regarde maintenant la base de donnée et on voit la table patient on aura l’affichage ci dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/c63fc230-1211-479f-8fe6-05bb55e098fa)
On constate qu’à chaque fois on démarre on a une duplication car on écrase pas la base de donnée :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/347bcfaf-39d5-4b7a-9fd6-db127a7a3af8)
Quand visite : localhost:8084/index on obtient le résultat ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/5f7fb127-dac2-4f09-9aa0-d8ad5736bcf7)
 Comme il  n’est pas pratique d’afficher tous les patients, on va passer pour faire la pagination, et donc on va apporter des modications à la classe PatientController :
 ![image](https://github.com/baayaouiimane/TP3/assets/167249908/ffc7533f-160b-4832-9c96-0cd834e6f9d1)
 En visitant : localhost:8084/index on obtient le résultat ci-dessous :
 ![image](https://github.com/baayaouiimane/TP3/assets/167249908/b3a4ba1a-6f94-40cf-8d06-64f15ba2990c)
 Si on tape : localhost:8084/index?size=2 on obtient le résultat ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/37fea103-3dea-436f-b76b-0ae2ce471d13)
Et revenant cette fois ci a la vue pour lui apporter des modifications :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/9e0e6d64-ec29-4bad-bdcc-7cfc07bfd229)
Et par la suite en faisant refresh à la page on obtient le résultat ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/00f65225-b8a0-4efb-9239-e8067d04e98e)
Donc notre souhait c’est d’afficher  l indexe : numéro des éléments en les affichant d’une manière horizontal et afficher chaque élément sous forme d’un bouton ainsi que quand on clique sur une page on la demande,  ceci requiert à faire des modifications  à patient.html .Et il ne faut pas oublier de colorer la page courante avec une couleur différente  en  se redirigant vers la classe PatientController qui est la suivante :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/bbb2c7b0-e7ed-4f0c-a902-fe059f18e1d4)
![image](https://github.com/baayaouiimane/TP3/assets/167249908/48894a75-52a5-44e1-9fb0-978c3fbf35d1)
En faisant une actualisation à la page on obtient ce résultat :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/b0b3fe1b-80e7-416f-a6d9-367e5b2b8998)
Par la suite on va ajouter une partie pour faire la recherche  des patients on va créer un formulaire dans patients.html :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/78953597-5c6e-4410-a0d6-e036b8a94a85)
Et en faisant une actualisation à la page :	
![image](https://github.com/baayaouiimane/TP3/assets/167249908/f827468b-f277-4050-828c-3c4e7e882f73)
En cliquant sur le bouton chercher on aura donc le résultat ci-dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/2f9a4186-18b9-4065-aab5-53e03bc56da2)
Maintenant, il va falloir récupérer le keyword et il faut faire la recherche, on aura besoin d’ajouter une méthode dans  l’interface PatientRepository :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/aebca624-9d18-4193-8c2b-1f1729004419)
Ainsi qu’au niveau du controleur on lui apporte des modifications :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/1b3ffc0a-0acc-4dc5-83bd-b0e99e2a272d)
Par la suite pour afficher la valeur dans la zone texte on a ajouté une toute petite modification dans patient.html :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/139dccf1-b5c3-459c-8761-3a343faeea0f)
Ce qui nous donne après l’actualisation  mais en tapant dans la zone de recherche Mohammed :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/a47e7063-d2c2-4233-8be4-6d9f9be4ad39)
Maintenant on souhaite supprimer un patient  donc on doit effectuer des modifications au niveau de patient.html :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/d27f21d3-adf3-4526-8d9f-b8b34e3ad256)
On obtient comme résultat :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/8c42bedd-ab2d-401b-832a-0ee2af9ccc7a)
Pour que ce bouton fonctionne  voici ce qui faut faire:
![image](https://github.com/baayaouiimane/TP3/assets/167249908/814a3458-d457-4750-ab91-ecfc920de9a9)
Par la suite en faisant une actualisation a la page et en cliquant sur le bouton delete des patients Mohammed et Imane on remarque qu’ils sont supprimés.
![image](https://github.com/baayaouiimane/TP3/assets/167249908/fed98dbc-a8fb-413a-8232-0e677f24932b)
Et comme la suppression est une notion dangereuse vaut mieux afficher un message pour s’assurer  avant de faire de l’action. On est censé cette fois ci d’apporter des modifications dans patient.html :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/ff372fa8-ebcc-4d9c-8051-f33d8df45883)
Et donc quand on clique sur le bouton delete on aura le message ci dessous :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/fc51901c-9da2-4876-b154-2b2d46f21fda)
Si vous voulez garder le mot clé on doit changer dans patient.html :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/24fd0cad-d34e-4478-900e-22e1b831600b)
Et aussi dans PatientController :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/c6eeeba1-83ec-44a8-9054-fa05f6e0b4f8)
En actualisant la page et en cherchant dans la zone de saisie le nom : Imane
![image](https://github.com/baayaouiimane/TP3/assets/167249908/d5923d5e-143a-4f3e-9966-c27ec39812fa)
Et on souhaite supprimer id =42 :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/dd14545c-f5b8-40a1-a811-e1931fb48563)
On constate que la suppression est effectuée avec succès mais restant dans la même page .Par la suite on va changer delete par icone de poubelle. Donc on doit ajouter cette dépendance dans le fichier pom.xml:
![image](https://github.com/baayaouiimane/TP3/assets/167249908/135fe1fa-b888-4b12-808e-4be89cbcd369)
Et aussi dans patient.html on va ajouter ceci :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/ef994adb-c086-45dd-998e-78a2884742e4)
![image](https://github.com/baayaouiimane/TP3/assets/167249908/cb725d42-6313-497f-b8f1-68575a477109)
![image](https://github.com/baayaouiimane/TP3/assets/167249908/6355e9ab-77f8-4c83-92e0-f3514ddca2ca)
En actualisant la page on obtient le résultat suivant :
![image](https://github.com/baayaouiimane/TP3/assets/167249908/bd3a747a-6311-48d8-a911-b1a7f6cdda3d)




























 

































