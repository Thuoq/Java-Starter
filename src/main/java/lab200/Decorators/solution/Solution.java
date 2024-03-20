package lab200.Decorators.solution;

public class Solution {
    public static void main(String[] args) {
        Notifier notifier = new SmsNotifier(new FacebookNotifier(new SlackNotifier(null)));
        notifier.sendMessage("Hello");
    }
}

interface Notifier {
    void sendMessage(String message);
}
class NotifierDecorator implements Notifier {
    private final Notifier wrapper;
    NotifierDecorator(Notifier noty) {
        wrapper = noty;
    }

    @Override
    public void sendMessage(String message) {
        if(wrapper != null) {
            wrapper.sendMessage(message);
        }
    }
}

class FacebookNotifier extends NotifierDecorator {
    FacebookNotifier(Notifier noty) {
        super(noty);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("Facebook: " + message);
    }
}
class SlackNotifier extends NotifierDecorator {
    SlackNotifier(Notifier noty) {
        super(noty);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("Slack: " + message);
    }
}

class SmsNotifier extends NotifierDecorator {
    SmsNotifier(Notifier noty) {
        super(noty);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("SMS: " + message);
    }
}
