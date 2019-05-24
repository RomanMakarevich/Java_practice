package java_practic.homework.homework_9.task_1;

//лучше назвать IConverter
public interface IConverter {
    public void converter();
    public double usd(int sum, double usd);
    public double eur(int sum, double eur);
    public double rus(int sum, double rus);


}
