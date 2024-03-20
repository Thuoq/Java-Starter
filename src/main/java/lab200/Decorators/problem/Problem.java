package lab200.Decorators.problem;

public class Problem {
    public static void main(String[] args) {
        Notifier notifier = new SmsNotifier();
        notifier.sendMessage("Hello");
        notifier = new FacebookNotifier();
        notifier.sendMessage("Hello");
        notifier = new SlackNotifier();
        notifier.sendMessage("Hello");
    }
}


interface Notifier {
    void sendMessage(String message);
}

class SmsNotifier implements Notifier {
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
class FacebookNotifier implements Notifier {
    public void sendMessage(String message) {
        System.out.println("Facebook: " + message);
    }
}

class SlackNotifier implements Notifier {
    public void sendMessage(String message) {
        System.out.println("Slack: " + message);
    }
}
