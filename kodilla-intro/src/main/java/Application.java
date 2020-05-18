public class Application {

    public static void main(String[] args) {
        Person adam = new Person("Adam", 40.5, 178);
        Person kora = new Person("Kora", 15, 166);
        Person daniel = new Person("Daniel", 31, 180);

       System.out.println(adam.getDescription());
       System.out.println(kora.getDescription());
       System.out.println(daniel.getDescription());
    }
}

