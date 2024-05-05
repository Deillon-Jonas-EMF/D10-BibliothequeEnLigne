package models;

public class Livre {
    private String titre;
    private String auteur;
    private long isbn;
    private boolean statut;

    public Livre(String titre, String auteur, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.statut = true;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public long getIsbn() {
        return isbn;
    }

    public boolean estLibre() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Titre : " + titre + ", Auteur : " + auteur + ", ISBN : " + isbn + ", Statut : " + statut;
    }
}
