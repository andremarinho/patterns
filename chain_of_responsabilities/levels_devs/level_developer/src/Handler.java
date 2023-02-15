public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleTask(Task task);
    int getLevel();
}
