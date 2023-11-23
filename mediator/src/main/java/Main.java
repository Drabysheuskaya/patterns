public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new Chat();
        User user1 = new ChatUser(chat, "User 1");
        User user2 = new ChatUser(chat, "User 2");
        User user3 = new ChatUser(chat, "User 3");
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("initializing the project");
        user2.sendMessage("add dependencies");
        user3.sendMessage("creating first class");

        System.out.println(chat.getMessagesHistory());

    }
}
