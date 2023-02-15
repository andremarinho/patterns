public abstract class Developer implements Handler {
    protected Handler nextHandler;
    protected int level = 0;

    public Developer(Handler handler){
            this.nextHandler = handler;
    }
}
