
interface MessagingService {
    void sendMessage(String message);
}

public class LambdaExpreesion1 {
    public static void main(String[] args) {


        // Using lambda for EmailService
        MessagingService emailService = message -> System.out.println("Sending email: " + message);
        emailService.sendMessage("Hello! This is an email.");

        // Using lambda for SMSService
        MessagingService smsService = message -> System.out.println("Sending SMS: " + message);
        smsService.sendMessage("Hi! This is an SMS.");

        // Using lambda for PushNotificationService
        MessagingService pushNotificationService = message -> System.out.println("Sending push notification: " + message);
        pushNotificationService.sendMessage("Hey! This is a push notification.");
    }
}

