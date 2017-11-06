import java.util.HashSet;

abstract class Group implements Cloneable {
    private String name = null;
    private double amount = 0.0;
    private HashSet<String> members = new HashSet<>();

    Group(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void addMember(String person) {
        this.members.add(person);
    }

    Object[] getMembers() {
        return members.toArray();
    }

    void donate(double value) {
        this.amount += value;
    }

    double getAmount() {
        return this.amount;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

class Group1 extends Group {
    Group1() {
        super("Group1");
        addMember("Person1");
        addMember("Person2");
    }
}

class Group2 extends Group {
    Group2() {
        super("Group2");
        addMember("Person3");
        addMember("Person4");
        addMember("Person5");
    }
}

class Group3 extends Group {
    Group3() {
        super("Group3");
        addMember("Person6");
        addMember("Person7");
    }
}