public class SeniorDeveloper extends Developer{

    public SeniorDeveloper(Handler handler) {
        super(handler);
        level = 3;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        super.nextHandler = nextHandler;
    }

    @Override
    public void handleTask(Task task) {
        if (task.getDifficultyLevel() <= level) {
            System.out.println("Task handled by senior developer");
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
