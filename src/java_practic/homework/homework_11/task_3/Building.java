package java_practic.homework.homework_11.task_3;

// class Building implements Comparable<Build>{
public class Building {
    private String street;
    private  int entrance;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getEntrance() {
        return entrance;
    }

    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }

    public Building(String street, int entrance) {
        this.street = street;
        this.entrance = entrance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("street='").append(street).append('\'');
        sb.append(", entrance=").append(entrance);
        sb.append('}');
        return sb.toString();
    }
    
    //    @Override
//    public int compareTo(Build a, Build b) {
//        int comparedStreet = a.getStreet().compareTo(b.getStreet());
//
//        if(comparedStreet != 0) {
//            return comparedStreet;
//        }
//
//        return Integer.compare(a.getHousNumber(), b.getHousNumber());
//    }
}
