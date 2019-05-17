package java_practic.lectures.lecture_8.task_2;

public class AnimalsInfoPrinter {
    public void info(Animal animal){

        if (animal.getClass().getSimpleName().equals("Cat")){
            System.out.printf("name - %s\nage - %d\nkind - %s\ncolor - %s\nlengthClutch - %d" , animal.getName(), animal.getAge(), animal.getKind(),((Cat)animal).getColor(),((Cat)animal).getLengthClutch());
        }
        if (animal.getClass().getSimpleName().equals("Dog")){
            System.out.printf("name - %s\nage - %d\nkind - %s\nlengthTail - %d\n numberOfTeeth - %s", animal.getName(), animal.getAge(), animal.getKind(), ((Dog)animal).getLengthTail(), ((Dog)animal).getNumberOfTeeth());
        }
        if (animal.getClass().getSimpleName().equals("Horse")){
            System.out.printf("name - %s\nage - %d\nkind - %s\nheight - %d\n wearsHorseShoe - %s", animal.getName(), animal.getAge(), animal.getKind(), ((Horse)animal).getHeight(), ((Horse)animal).getWearsHorseShoe());
        }else{
            System.out.println("Class not found");
        }
    }
}
