public abstract class User{
    protected ChatMediator chatMediator;
    protected String username;

    public User(ChatMediator chatMediator, String username) {
        this.chatMediator = chatMediator;
        this.username = username;
    }

    public abstract void receiveMessage(String changes);

    public abstract void sendMessage(String changes);
}
