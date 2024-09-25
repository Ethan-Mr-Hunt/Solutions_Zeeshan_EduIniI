class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Hello " + name + ", the price of " + stockName + " has changed to " + price);
    }
}
