package java_practic.homework.homework_6.task_2;

public class ExecutionQueue {
    // верно, только не 'asg', а 'msg' переменная называлась в примере 
    private static String asg;

    static {
        asg = "static block";//стоит первым в приоритете выполнения.
    }

    {
        // blocK
        asg = "regular init bloc";//стоит вторым в приоритете выполнения.
    }

    public ExecutionQueue(){
        asg = "constructor value";//стоит третим в приоритете выполнения, следователтно выведится "constructor value".
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(executionQueue.asg);
    }
}
