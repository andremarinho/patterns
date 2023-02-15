public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(Handler handler) {
        super(handler);
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        super.nextHandler = nextHandler;
    }

    public void handleTask(Task task) {
        if (task.getDifficultyLevel() <= level) {
            System.out.println("Task handled by junior developer");
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        } else {
            System.out.println("No one can handle this task");
        }
    }

    @Override
    public int getLevel() {
        return level;
    }
}
