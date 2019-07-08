package java_practic.lectures.lecture_23.paterns.singleton;

public class Singleton{
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){

        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton(value);
                }
            }
        }
        return  instance;
    }

}
