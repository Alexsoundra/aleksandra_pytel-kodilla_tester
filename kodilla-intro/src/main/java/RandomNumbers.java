import java.util.Random;

public class RandomNumbers {
    public int max = 0;
    public int min = 30;

    public void getCountOfRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);

            if (temp > this.max) {
                this.max = temp;
            }
            if (temp < this.min) {
                this.min = temp;
            }
            sum = sum + temp;
            System.out.println(temp + "  Wszystkie");
        }

    }
    public int getLowestNumber() {
        return min;
    }
    public int getHighestNumber() {
        return max;
    }
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumbers();
        int maxNumber = randomNumbers.getHighestNumber();
        int minNumber = randomNumbers.getLowestNumber();
        System.out.println("MAX " + maxNumber + "  MIN " + minNumber);
    }

}

