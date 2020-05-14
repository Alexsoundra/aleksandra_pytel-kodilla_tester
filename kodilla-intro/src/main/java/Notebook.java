public class Notebook {
    int weight;
    int price;
    int yearOfProduction;

    public  Notebook(int weight, int price, int yearOFProduction){
        this.weight = weight;
        this.price = price;
        this.yearOfProduction = yearOFProduction;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price > 600 && this.price < 1000){
            System.out.println("This price is good.");
        }
        else{
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700){
            System.out.println("This notebook is very light.");
        }
        else if (this.weight > 700 && this.weight < 1200){
            System.out.println("This notebook is not too heavy.");
        }
        else{
            System.out.println("This notebook is too heavy");
        }
    }
    public void checkYear(){
        if (this.yearOfProduction < 2010){
            System.out.println("This notebook is old.");
        }
        else if (this.yearOfProduction > 2011 && this.yearOfProduction < 2016) {
            System.out.println("This notebook is not bad.");
        }
        else {
            System.out.println("This notebook is pretty new.");
        }
    }
}

