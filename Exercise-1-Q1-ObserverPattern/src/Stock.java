import java.util.ArrayList;
import java.util.List;

class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}