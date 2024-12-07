package src.ObserverPattern.Observable;

import java.util.ArrayList;

import src.ObserverPattern.Observer.NotificationAlertObserver;

public class StockObservableImpl implements StockObservable{

    private ArrayList<NotificationAlertObserver> list = new ArrayList<NotificationAlertObserver>();
    private int count;

    @Override
    public void add(NotificationAlertObserver observer) {
         list.add(observer);   
         System.out.println("added observer to the list : "+list.size());
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
      list.remove(observer);
    }

    @Override
    public void notifySubstribers() {
       for(int i=0;i<list.size();i++)
       {
           list.get(i).update();
       }
    }

    @Override
    public void setCount(int count) {
        System.out.println("updating stock, new quantity: " + count);
        this.count = count;
        if(this.count>0) notifySubstribers();
    }

    @Override
    public int getCount() {
        return this.count;
        
    }

}
