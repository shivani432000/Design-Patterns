package src.ObserverPattern.Observer;

import src.ObserverPattern.Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver {

    private StockObservable so;
    private String email;

    public EmailNotificationAlertObserver(StockObservable so, String email) {
        this.so = so;
        this.email = email;
      }
    
      @Override
      public void update() {
        this.sendEmail(email, "Item back in stock. Hurry! left : "+so.getCount());
      }
    
      public void sendEmail(String email, String msg) {
        System.out.println("Email sent to " + this.email + " with message " + msg);
      }

}
