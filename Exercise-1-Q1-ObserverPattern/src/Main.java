public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.00);

        Investor investor1 = new Investor("Sahil");
        Investor investor2 = new Investor("Karim");
        NewsSource newsAgency = new NewsSource("ABC");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);
        appleStock.addObserver(newsAgency);

        // Notify the Observers
        appleStock.setPrice(155.00);
        appleStock.setPrice(160.00);
    }
}