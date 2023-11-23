public class ChatUser extends User {

    public ChatUser(ChatMediator chatMediator, String username) {
        super(chatMediator, username);
    }

    @Override
    public void receiveMessage(String changes) {
        System.out.printf("Chat user {%s} receive message: '%s'\n", username, changes);
    }

    @Override
    public void sendMessage(String message) {
        System.out.printf("Chat user {%s} is sending message: '%s'%n", username, message);
        chatMediator.notifyChanges(this, message);
        chatMediator.addMessageToHistory(message);
    }
}
