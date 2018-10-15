import java.util.*;

public class Main {

    // Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
    // public Set<String> removeEvenLength(Set<String> set);
    // Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]

    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        add();

        printSet(set);

        removeEvenLength(set);

    }

    private static void add() {
        set.add("foo");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("dude");
        set.add("!");
        set.add("works");
    }

   private static void printSet(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.print(it + " ");
        }
        System.out.println();
        System.out.println("==============" );
    }

    private static Set<String> removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        String it;
        Set<String> newSet = new HashSet<>();
        while (iterator.hasNext()) {
             it = iterator.next();
            if(it.length()%2==1) {
                newSet.add(it);
                System.out.print(it + " ");
            }
        }

        return newSet;
    }
}
