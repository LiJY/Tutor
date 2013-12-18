/**
 * Created by athena2651cn on 13-12-18.
 */
public class Ville {

    public static int nbrInstances = 0;
    public static int nbrInstancesBis = 0;
    private String nomVille;
    private String nomPays;
    private int nbrHabitants;
    private char categorie;

    public Ville() {
        System.out.println("Création d'une ville !");
        nomVille = "Inconnue";
        nomPays = "Inconnue";
        this.setCategorie();
    }

    public Ville(String nomVille, String nomPays, int nbrHabitants) {
        System.out.println("Création d'une ville avec des paramètres !");
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nbrHabitants = nbrHabitants;
        this.setCategorie();
    }

    public static int getNbrInstances() {
        return nbrInstances;
    }

    public static void setNbrInstances(int nbrInstances) {
        Ville.nbrInstances = nbrInstances;
    }

    public static int getNbrInstancesBis() {
        return nbrInstancesBis;
    }

    public static void setNbrInstancesBis(int nbrInstancesBis) {
        Ville.nbrInstancesBis = nbrInstancesBis;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public char getCategorie() {
        return categorie;
    }

    private void setCategorie(){
        int bornesSuperieurs[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int i = 0;
        while (i < bornesSuperieurs.length && this.nbrHabitants >= bornesSuperieurs[i])
            i++;
        this.categorie = categories[i];
    }

}
