<h3>Compte rendu - Injection des Dependences</h3>
<h4>Objectif : Realiser l'injection des dependances</h4>
<h4>Activités :<br/>
1. Créer l'interface IDao avec une méthode getDate<br/>
2. Créer une implémentation de cette interface<br/>
3. Créer l'interface IMetier avec une méthode calcul<br/>
4. Créer une implémentation de cette interface en utilisant le couplage faible<br/>
5. Faire l'injection des dépendances :<br/>
   a. Par instanciation statique<br/>
   b. Par instanciation dynamique<br/>
   c. En utilisant le Framework Spring<br/>
   - Version XML<br/>
   - Version annotations</h4>

<h4>Modelisation :</h4>
<img src="captures/Diagramme.JPG">
<hr/>

<h6>Question 1 - 2: Creation de interface IDao et une implementation DaoImpl :</h6>
<p>Dans le package dao, Creation de l'interface IDao avec une methode getData() et creation d'une implementation de l'interface IDao "DaoImpl" qui implemente la methode getData() qui retourne un réel aleatoire de 0 à 40.</p>
<p>Creation d'une extension "package ext" qui contient une autre implementation de l'interface IDao "DaoImplV2" qui implemente la methode getData() qui retourne un réel aleatoire de 0 à 60.</p>
<img src="captures/Dao.JPG" alt="dao and ext package">
<hr/>

<h6>Question 3 - 4: Creation de interface IMetier et une implementation MetierImpl :</h6>
<p>Dans le package metier, Creation de l'interface IMetier avec une methode calcul() et creation d'une implementation de l'interface IMetier "MetierImpl" qui implemente la methode calcul().</p>
<img src="captures/Metier.JPG" alt="metier package">
<hr/>

<h6>Question 5 - a: Injection des dependences - Instanciation statique - Resultat :</h6>
<img src="captures/StaticInstance.JPG">
<hr/>

<h6>Question 5 - b: Injection des dependences - Instanciation dynamique - Resultat :</h6>
<img src="captures/DynamicInstance.JPG">
<hr/>

<h6>Question 5 - c: Injection des dependences - Spring Framework XML - Resultat :</h6>
<img src="captures/PresSpringXML.JPG">
<hr/>

<h6>Question 5 - c: Injection des dependences - Spring Framework Annotations - Resultat :</h6>
<img src="captures/PresSpringAnnotation.JPG">