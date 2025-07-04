import java.util.Set;
import controllers.ContactoController;
import controllers.Ejercicios;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Sets sets = new Sets();
        // System.out.println("HashSet");
        // runHashSet(sets);
        // System.out.println();
        // System.out.println("LinkedHashet");
        // runLinkedHashSet(sets);
        // System.out.println();
        // System.out.println("TreeSet");
        // runTreeSet(sets);
        // System.out.println();
        // System.out.println("TreeSetConComparador");
        // runTreeSetConComparador(sets);
        // System.out.println();
        // System.out.println("TreeSetConComparador2");
        // runTreeSetConComparador2(sets);

        //ContactoController contactos=new ContactoController();
        Ejercicios ejercicio=new Ejercicios();
    }

    public static void runHashSet(Sets sets) {
        Set<String> palabras = sets.construirHashSet();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets) { // Asegura un Orden de entrada
        Set<String> palabras = sets.construirLinkedHashSet();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSet(Sets sets) { // Asegura un Orden natural
        Set<String> palabras = sets.construirTreeSet();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetConComparador(Sets sets) { // Asegura un Orden natural
        Set<String> palabras = sets.construirTreeSetConComparador();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetConComparador2(Sets sets) { // Asegura un Orden natural
        Set<String> palabras = sets.construirTreeSetConComparador2();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
