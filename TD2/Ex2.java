// Exercice 2 : Correction

// XYZ a = new XYZ();
// Appel du premier constructeur pour l’objet a.
// y est un attribut static, commun à tous les objets de la classe.

// x = 0
// y = 1
// z = y = 1

// a.affiche();
// Affichage des attributs de a :
// x = 0, y = 1, z = 1

// XYZ b = new XYZ(1);
// Appel du second constructeur pour l’objet b.

// b.x = 1
// y est static, sa valeur devient 2 (partagée par a et b)
// b.z = y = 2

// a.affiche();
// Affichage des attributs de a :
// x reste 0
// y = 2 (attribut static commun)
// z reste 1 (valeur fixée lors de la création de a)
// x = 0, y = 2, z = 1

// b.affiche();
// Affichage des attributs de b :
// x = 1, y = 2, z = 2
