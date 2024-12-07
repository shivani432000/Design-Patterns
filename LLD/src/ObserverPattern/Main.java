package src.ObserverPattern;


import src.ObserverPattern.Observable.StockObservableImpl;
import src.ObserverPattern.Observer.EmailNotificationAlertObserver;
import src.ObserverPattern.Observer.MobileNotificationAlertObserver;

public class Main {
    public static void main()
   {
       StockObservableImpl stockObservableObj = new StockObservableImpl();
    
    MobileNotificationAlertObserver mobileNotifAlertObserver1 = new MobileNotificationAlertObserver(stockObservableObj,"7409204545");
    EmailNotificationAlertObserver emailNotifAlertObserver2 = new EmailNotificationAlertObserver(stockObservableObj, "patsy@gmail.com");
    EmailNotificationAlertObserver emailNotifAlertObserver3 = new EmailNotificationAlertObserver(stockObservableObj, "ryuk@gmail.com");

    System.out.println("current stock: " + stockObservableObj.getCount());
    
    // add only 1 observer for now
    stockObservableObj.add(mobileNotifAlertObserver1);
    
    // update stock
    stockObservableObj.setCount(2);

    // add another observer
    stockObservableObj.add(emailNotifAlertObserver2);

    // update stock
    stockObservableObj.setCount(4);

    // add another observer
    stockObservableObj.add(emailNotifAlertObserver3);

    // update stock
    stockObservableObj.setCount(5);
   }
}
