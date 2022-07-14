
public class Admin implements ChatObserver {
    @Override
    public void update(String message) {
        System.out.println(this.getClass().getName() + " get new message: " + message);
    }
}
