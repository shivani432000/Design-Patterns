package src.ObserverPattern.Observable;


import src.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
     public void add(NotificationAlertObserver observer);
     public void remove(NotificationAlertObserver observer);
     public void notifySubstribers();
     public void setCount(int count);
     public int getCount();
     
}
