import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
დავუშვათ, ჩვენ გვაქვს ჩატი და გვინდა რომ მისმა ყველა მომხმარებელმა მიიღოს ჩატის სტატუსის განახლებები.
ჩატის კლასში დამკვირვებლები (ანუ ჩატის მომხმარებლები) ინახება დამკვირვებელთა სიაში ხოლო ჩატის შეტყობინებები -შეტყობინებების სიაში.
 ახალი შეტყობინების მიღებისას გამოიძახება notifyObservers ფუნქცია, რომელიც შეტყობინებას უგზავნის ყველა დამკვირვებელს.
 **/
public class Chat {
    private List messages;
    private Set<ChatObserver> observers;

    public Chat() {
        observers = new HashSet<>();
        messages = new ArrayList<>();
    }

    //add user
    public void addObserver(ChatObserver observer) {
        observers.add(observer);
    }

    //remove user
    public void removeObserver(ChatObserver observer) {
        observers.remove(observer);
    }

    //send message to chat users
    public void addMessage(String message) {
        messages.add(message);
        System.out.println("_________________" + this.getClass().getName() + "_________________ sent new message: " + message + "\n");
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (ChatObserver observer : observers) {
            observer.update(message);
        }
    }
}