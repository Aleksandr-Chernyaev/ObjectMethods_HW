//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author pelevin = new Author("Виктор", "Пелевин");
        Author yarros = new Author("Ребекка", "Яррос");

        Book generationP = new Book("Generation П", pelevin, 1999);
        Book generationPNew = new Book("Generation П", pelevin, 1999);
        Book ironFlame = new Book("Железное пламя", yarros, 2023);

        System.out.println(generationP.equals(generationPNew));
        System.out.println(generationP.equals(ironFlame));

        System.out.println(generationP);
        System.out.println(ironFlame);

        generationP.setPublicationYear(2011);

        System.out.println(generationP);

        System.out.println(generationP.hashCode());
        System.out.println(ironFlame.hashCode());
    }
}