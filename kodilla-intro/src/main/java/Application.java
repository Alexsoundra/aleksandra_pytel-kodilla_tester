public class Application {
        String name;
        double age;
        double height;

        public Application(String name, double age, double height){
            this.name = name;
            this.age = age;
            this.height = height;
        }

         public void calculateUserAgeAndHeight() {
             if (age > 30 && height > 160) {
                 System.out.println("User is older than 30 and higher then 160cm");
             } else {
                 System.out.println("User is younger than 30 or lower than 160cm");
             }
         }
    public static void main(String[] args){
        Application adam = new Application("Adam", 40.5, 178);
        adam.calculateUserAgeAndHeight();
        Application kora = new Application("Kora", 15, 166);
        kora.calculateUserAgeAndHeight();
        Application daniel = new Application("Daniel", 31, 180);
        daniel.calculateUserAgeAndHeight();
    }
}

