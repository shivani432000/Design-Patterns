package src.ObserverPattern.Observer;

import src.ObserverPattern.Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{

    private StockObservable so;
    private String mobileNo;

    public MobileNotificationAlertObserver(StockObservable so,String mobileNo)
    {
        this.mobileNo = mobileNo;
        this.so = so;
    }

    @Override
    public void update() {
        this.sendMobileNotif(mobileNo, "Item back in stock. Hurry! only " + so.getCount() + " items available");
    }

    public void sendMobileNotif(String phoneNo, String msg) {
        System.out.println("Mobile notification sent to " + this.mobileNo + " with message " + msg);
      }

}
