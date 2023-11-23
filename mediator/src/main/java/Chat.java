import java.util.ArrayList;
import java.util.List;

class Chat implements ChatMediator {
    private final List<User> users;
    private final List<String> messagesHistory;

    public Chat() {
        this.users = new ArrayList<>();
        this.messagesHistory = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void notifyChanges(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    public List<String> getMessagesHistory() {
        return messagesHistory;
    }

    @Override
    public void addMessageToHistory(String message) {
        messagesHistory.add(message);
    }
}
