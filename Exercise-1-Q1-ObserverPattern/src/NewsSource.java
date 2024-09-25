class NewsSource implements Observer {
    private String agencyName;

    public NewsSource(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(agencyName + " reports: The price of " + stockName + " has changed to " + price);
    }
}
