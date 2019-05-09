package java_practic.homework.homework_6.task_1;

public class Engine {
    private boolean engineStatus;

    public boolean getEngineStatus() {
        return engineStatus;
    }

    {
        engineStatus = false;
    }

    public void engineOn() {
        if (engineStatus == false) {
            engineStatus = true;
        } else {
            System.out.println("Action is not available, engine - On.");
        }
    }

    public void engineOff() {
        if (engineStatus == true) {
            engineStatus = false;
        } else {
            System.out.println("Action is not available, engine - Off.");
        }
    }
}
