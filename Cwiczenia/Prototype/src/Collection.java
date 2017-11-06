import java.util.HashMap;
import java.util.Random;

public class Collection {
    private static HashMap<String, Group> groups = new HashMap<>();

    static {
        addGroup(new Group1());
        addGroup(new Group2());
        addGroup(new Group3());
    }

    public static void addGroup(Group g) {
        groups.putIfAbsent(g.getName(), g);
    }

    public static Group getGroup(String name) {
        Group group = groups.get(name);
        return (Group) group.clone();
    }

    public static void donate(String group, double value) {
        groups.get(group).donate(value);
    }

    public static void main(String[] args) {
        Random random = new Random();
        double sum = 0.0;

        for (int i = 0; i < 10; i++) {
            Collection.donate("Group1", random.nextDouble() * 100);
            Collection.donate("Group2", random.nextDouble() * 100);
            Collection.donate("Group3", random.nextDouble() * 100);
        }

        sum += Collection.getGroup("Group1").getAmount();
        sum += Collection.getGroup("Group2").getAmount();
        sum += Collection.getGroup("Group3").getAmount();

        System.out.printf("Gathered amount: %.2f\n", sum);
    }
}
