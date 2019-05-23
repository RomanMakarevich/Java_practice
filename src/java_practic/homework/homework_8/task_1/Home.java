package java_practic.homework.homework_8.task_1;

public class Home {
    private String material;
    private String roof;
    private String shapeOfTheWindows;
    private boolean garage;
    private boolean fence;
    private boolean pool;
    private boolean terrace;

    {
        garage = false;
        fence = false;
        pool = false;
        terrace = false;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getShapeOfTheWindows() {
        return shapeOfTheWindows;
    }

    public void setShapeOfTheWindows(String shapeOfTheWindows) {
        this.shapeOfTheWindows = shapeOfTheWindows;
    }

    public Home(boolean garage, boolean fance, boolean pool, boolean terrace){
        this.garage = garage;
        this.fence = fance;
        this.pool = pool;
        this.terrace = terrace;
    }


}
