public class Application {
    public static String check(Person person) {
        String userInformation = null;
        //wg mnie if jest zbyt ubogo opisany, mógłby zawierać 2xelse if
        if (person.name != null) {
            if (person.age > 30 && person.height > 160) {
                userInformation = "User is older than 30 and higher then 160cm";
            }
            else {
                userInformation = "User is younger than 30 or lower than 160cm";
            }
        }
        return userInformation;
    }
    public static void main(String[] args) {
        Person adam = new Person("Adam", 40.5, 178);
        Person kora = new Person("Kora", 15, 166);
        Person daniel = new Person("Daniel", 31, 180);
       System.out.println(Application.check(adam));
       System.out.println(Application.check(kora));
       System.out.println(Application.check(daniel));
    }
}

