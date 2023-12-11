package exercices.tp1;

public class Exercice1 {
    public static void main(String[] args) throws ExercicesException {
        int note1 = 12;
        int note2 = 15;
        int note3 = 7;

        try {
            int moyenne = (note1 + note2 + note3) / 3;
            System.out.println("La moyenne des 3 notes est : " + moyenne + "/20");
        } catch (ArithmeticException e) {
            throw new ExercicesException("Ne fonctionne pas");
        } finally {
            System.out.println("Calculé avec succès");
        }
    }
}

