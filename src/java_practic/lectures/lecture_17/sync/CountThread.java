package java_practic.lectures.lecture_17.sync;

public class CountThread implements Runnable {

    CommonResource res;

    public CountThread(CommonResource res){
        this.res = res;
    }

    @Override
    public void run() {
        res.increment();

    }
}
