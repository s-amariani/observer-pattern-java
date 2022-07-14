import java.time.Duration;

public class ChatApp {
    public static void main(String[] args) throws InterruptedException {
        User user = new User();
        Admin admin = new Admin();

        Chat chat = new Chat();
        chat.addObserver(admin);
        chat.addObserver(user);

        chat.addMessage("The server will restart after 15 minutes");
        Thread.sleep(7000);
        chat.addMessage("The server will restart after 5 minutes");
        Thread.sleep(5000);
        chat.addMessage("We're restarting the server in 3...2....1");

        chat.removeObserver(user);
        chat.addMessage("Buy-buy");
    }
}