package exercices.tp1;

public class Exercice2 {
    public static void main(String[] args) throws ExercicesException {
        int prixHT = 25;

        try {
            int prixTTC = prixHT + prixHT * 20 / 100;
            System.out.println("Le prix TTC est de : " + prixTTC + "€");
        } catch (ArithmeticException e) {
            throw new ExercicesException("Ne fonctionne pas");
        } finally {
            System.out.println("Calculé avec succès");
        }
    }
}
