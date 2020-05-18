import java.util.Scanner;

public class Colors {
    public static String getColor(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Choose color (W - white, B - black, R - red, G - green):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color){
                case "W" : return "white";
                case "B" : return "black";
                case "R" : return "red";
                case "G" : return "green";
                default:
                    System.out.println("Wrong symbol. Try again.");
            }
        }
    }
    public static void main (String[] args){
       String color = Colors.getColor();
       System.out.println("Your color is " + color);
    }
}
