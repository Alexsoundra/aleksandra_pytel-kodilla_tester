public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User marcin = new User("Marcin", 19);
        User nelly = new User("Nelly", 15);
        User tom = new User("Tom", 16);

        User[] users = {anna, marcin, nelly, tom};


        int sum = 0;

        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age();
        }
        System.out.println("SUM " + sum);
        double average = sum * 1.0 / users.length;


        for (int i = 0; i < users.length; i++) {
            if (users[i].age() < average) {
                System.out.println("User " + users[i].name() +
                        "  ma wiek poniżej średniej "
                        + average + " ,jego wiek to "
                        + users[i].age());
            } else {
                System.out.println("User " + users[i].name() + "  ma wiek powyżej średniej.");
            }
        }
    }
}
