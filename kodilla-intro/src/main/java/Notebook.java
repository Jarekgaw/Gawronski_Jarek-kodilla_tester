public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This notebook is good.");
        } else {
            System.out.println("This price is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 600 && this.weight > 1600) {
            System.out.println("This notebook is quite light.");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYear() {
        if (this.price >= 2000) {
            System.out.println("This notebook is expensive.");
        } else if (this.price >= 1600 && this.year > 2020) {
            System.out.println("This notebook is quite cheap and new. ");
        } else {
            System.out.println("This notebook is old and cheap");
        }
    }
}



