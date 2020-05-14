public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + "  " + notebook.price + "  " + notebook.yearOfProduction);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();
        notebook.checkYearAndPrice();


        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        System.out.println(heavyNotebook.weight + "   " + heavyNotebook.price + "  " + heavyNotebook.yearOfProduction);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2000);
        System.out.println(oldNotebook.weight + "  " + oldNotebook.price + "  " + oldNotebook.yearOfProduction);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
        oldNotebook.checkYearAndPrice();

        Notebook pinkNotebook = new Notebook(800, 980, 2019);
        System.out.println(pinkNotebook.weight + "  " + pinkNotebook.price + "  " + pinkNotebook.yearOfProduction);
        pinkNotebook.checkWeight();
        pinkNotebook.checkPrice();
        pinkNotebook.checkYear();
        pinkNotebook.checkYearAndPrice();

        Notebook thickNotebook = new Notebook(2000, 100, 1999);
        System.out.println(thickNotebook.weight + "  " + thickNotebook.price + "  " + thickNotebook.yearOfProduction);
        thickNotebook.checkWeight();
        thickNotebook.checkPrice();
        thickNotebook.checkYear();
        thickNotebook.checkYearAndPrice();

        Notebook brandNewNotebook = new Notebook(1000, 1600, 2020);
        System.out.println(brandNewNotebook.weight + "  " + brandNewNotebook.price + "  " + brandNewNotebook.yearOfProduction);
        brandNewNotebook.checkYearAndPrice();

    }
}
