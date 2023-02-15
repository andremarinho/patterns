public class PlenoDeveloper extends Developer  {

    public PlenoDeveloper(Handler handler) {
        super(handler);
        level = 2;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        super.nextHandler = nextHandler;
    }

    @Override
    public void handleTask(Task task) {
        if (task.getDifficultyLevel() <= level) {
            System.out.println("Task handled by pleno developer");
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
