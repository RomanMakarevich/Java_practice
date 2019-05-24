package java_practic.lectures.lecture_12.test24_05_19.task_1;

public class Program {
    public static void main(String[] args) {
        Button changePinButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("changePinButton");
            }
        });

        Button checkBalanceButton  = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("checkBalanceButton ");
            }
        });

        changePinButton.click();
        checkBalanceButton.click();
    }
}
