package app;

import models.Bibliotheque;
import models.Livre;

public class Application {

    public static void main(String[] args) {
        Bibliotheque b1 = new Bibliotheque("Bibliotheque communale Fribourg");

        Livre l1 = new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", 9782070643027L);
        Livre l2 = new Livre("Le Seigneur des Anneaux : La Communauté de l'Anneau", "J.R.R. Tolkien", 9782266283611L);
        Livre l3 = new Livre("1984", "George Orwell", 9782070345096L);
        Livre l4 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 9782070628642L);
        Livre l5 = new Livre("To Kill a Mockingbird", "Harper Lee", 9780061120084L);

        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);
        b1.ajouterLivre(l4);
        b1.ajouterLivre(l5);

        System.out.println(b1.rechercheLivreTitre("Harry Potter à l'école des sorciers"));
        System.out.println("--------------------------------");

        System.out.println(b1.rechercheLivreAuteur("Antoine de Saint-Exupéry"));
        System.out.println("--------------------------------");

        System.out.println(b1.rechercheLivreIsbn(9780061120084L));
        System.out.println("--------------------------------");

        b1.afficherLibre();
        System.out.println("--------------------------------");

        b1.afficherEmprunte();
        System.out.println("--------------------------------");

        b1.emprunterLivre(9782070345096L);
        System.out.println("--------------------------------");

        b1.rendreLivre(9782070345096L);
        System.out.println("--------------------------------");

        b1.afficherStock();
        System.out.println("--------------------------------");

    }
}
