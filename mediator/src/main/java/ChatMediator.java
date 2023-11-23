import java.util.List;

public interface ChatMediator {
    void addUser(User user);
    void notifyChanges(User sender, String changes);
    List<String> getMessagesHistory();
    void addMessageToHistory(String message);
}
