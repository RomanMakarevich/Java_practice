package java_practic.lectures.lecture_12.test24_05_19.task_1;

//В данном случае нет необходимости реализовывать интерфейс EventHandler.
//Достаточно просто оставить поле EventHandler  eventHandler; и проинициализировать его в конструкторе
//Реализация интерфейса EventHandler и переопределение его метода execute() будет происходить в анонимном классе, который ты передаешь 
//в конструктор при создании конкретной кнопки.
public class Button implements EventHandler {
    EventHandler  eventHandler;

    @Override
    public void execute() {

    }
    public Button (EventHandler eventHandler){
        this.eventHandler = eventHandler;
    }

    public void click(){
        eventHandler.execute();
    }
}
