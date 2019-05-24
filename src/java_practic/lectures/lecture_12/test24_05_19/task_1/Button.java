package java_practic.lectures.lecture_12.test24_05_19.task_1;

public class Button implements EventHandler {
    EventHandler  eventHandler;

    @Override
    public void execute() {

    }
    public Button (EventHandler eventHandler){
        this.eventHandler = eventHandler;
    }

    public void click(){
        execute();
    }
}
