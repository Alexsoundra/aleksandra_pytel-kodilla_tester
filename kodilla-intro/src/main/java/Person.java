public class Person {
    String name;
    double age;
    double height;

    public Person(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getDescription() {
        String userInformation = null;

        if (name != null) {
            if (age > 30 && height > 160) {
                userInformation = "User is older than 30 and higher then 160cm";
            } else {
                userInformation = "User is younger than 30 or lower than 160cm";
            }
        }
        return userInformation;
    }
}
