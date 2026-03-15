package Com.LLD.Behavioral.Template;

abstract class NotificationTemplate {

    final void send(String message , String to) {
        rateLimitCheck(to);                                                       //all sub class will use this template
        validateMessage(message);                                                 //insteadd of code reusability
        readyTemplate();
        sendMessage();
    }
    void rateLimitCheck(String to) {
        System.out.println("checking Rate limit" + to);
    }
    void validateMessage(String message) {
        System.out.println("validate message" + message);
    }
    abstract void readyTemplate();
    abstract void sendMessage();
}

class Email extends NotificationTemplate {
    public void readyTemplate() {
        System.out.println("ready for email");
    }
    public void sendMessage() {
        System.out.println("send Message email");
    }
}

class SMS extends NotificationTemplate {
    public void readyTemplate() {
        System.out.println("ready for SMS");
    }
    public void sendMessage() {
        System.out.println("send Message SMS");
    }
}


public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        email.send("hi","tharun");
    }
}
