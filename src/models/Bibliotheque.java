package models;

public class Bibliotheque {
    private static int LIVRE_MAX = 5;
    Livre[] livres;
    String nom;

    public Bibliotheque(String nom) {
        livres = new Livre[LIVRE_MAX];
        this.nom = nom;
    }

    public void ajouterLivre(Livre livre) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i] == null) {
                livres[i] = livre;
                break;
            }
        }
    }

    public Livre rechercheLivreTitre(String titre) {
        System.out.println("Recherche de livre par titre...");
        Livre resultat = null;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getTitre().equals(titre)) {
                resultat = livres[i];
            }
        }
        return resultat;
    }

    public Livre rechercheLivreAuteur(String auteur) {
        System.out.println("Recherche de livre par auteur...");
        Livre resultat = null;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getAuteur().equals(auteur)) {
                resultat = livres[i];
            }
        }
        return resultat;
    }

    public Livre rechercheLivreIsbn(long isbn) {
        System.out.println("Recherche de livre par isbn...");
        Livre resultat = null;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getIsbn() == isbn) {
                resultat = livres[i];
            }
        }
        return resultat;
    }

    public void afficherLibre() {
        System.out.println("Affichage des livres libres...");
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].estLibre()) {
                System.out.println(livres[i]);
            }
        }
    }

    public void afficherEmprunte() {
        System.out.println("affichage des livres empruntes");
        for (int i = 0; i < livres.length; i++) {
            if (!livres[i].estLibre()) {
                System.out.println(livres[i]);
            }
        }
    }

    public void emprunterLivre(long isbn) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getIsbn() == isbn) {
                if (livres[i].estLibre()) {
                    livres[i].setStatut(false);
                    System.out.println("Le livre a été ajouté a votre compte");
                } else {
                    System.out.println("Vous ne pouvez pas emprunter ce livre");
                }
            } else {
                System.out.println("Aucun livre correspondant");
            }
        }
    }

    public void rendreLivre(long isbn) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getIsbn() == isbn) {
                livres[i].setStatut(true);
            }
        }
    }

    public void afficherStock() {
        System.out.println("Affichage du stock...");
        for (int i = 0; i < livres.length; i++) {
            System.out.println(livres[i]);
        }
    }

    @Override
    public String toString() {
        String tempString = "";
        for (int i = 0; i < livres.length; i++) {
            tempString += livres[i] + "\n";
        }
        return "Bibliotheque " + nom + "\n" + "Stock:" + "\n" + tempString;

    }
}
