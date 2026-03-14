package Com.LLD.Behavioral.Observer;

import java.util.*;

interface Subscriber {
    void update();
}

class EmailSubscriber implements Subscriber{
    private String email;

    EmailSubscriber(String email) {
        this.email=  email;
    }

    public void update() {
        System.out.println("send email subs noti.." + email);
    }
}

interface Subject {
    void addSubscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscriber();
}

class YouTuberChannel implements Subject {
    List<Subscriber> subscribers = new ArrayList<>();
    String channelName;

    YouTuberChannel(String channelName) {
        this.channelName = channelName;
    }
    @Override
    public void addSubscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    @Override
    public void unSubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscriber(){
        for(Subscriber subs : subscribers) {
            subs.update();
        }
    }

}

class Main {
    public static void main(String[] args) {
        YouTuberChannel channel1 =new YouTuberChannel("tharun");
        channel1.addSubscribe(new EmailSubscriber("tha@2002.com"));
        channel1.addSubscribe(new EmailSubscriber("enf.com"));

        channel1.notifySubscriber();
    }
}
