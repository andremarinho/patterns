public class Main {

    public static void main(String[] args) {
        Developer developer = new JuniorDeveloper(new PlenoDeveloper(new SeniorDeveloper(null)));
        Task task = new Task(1);
        developer.handleTask(task);
    }
}
