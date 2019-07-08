package java_practic.lectures.lecture_23.paterns.abstractfactory;

import java.util.Scanner;

public class Demo {
    private static Squadron getSquadron(String name) {
        Squadron squadron = null;
        SquadronFactory squadronFactory = null;

        switch (name) {
            case "elf":
                squadronFactory = new ElfSquadronFactoty();
                squadron = new Squadron(squadronFactory);
                break;
            case "ork":
                squadronFactory = new OrkSquadronFactoty();
                squadron = new Squadron(squadronFactory);
                break;
            case "human":
                squadronFactory = new HumanSquadronFactoty();
                squadron = new Squadron(squadronFactory);
                break;
            default:
                System.out.println("Unknown squadron!");
        }
        return squadron;
    }

    public static void main(String[] args) {
        System.out.println("Please, enter squadron name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Squadron squadron = getSquadron(name);
        squadron.fight();
    }
}
