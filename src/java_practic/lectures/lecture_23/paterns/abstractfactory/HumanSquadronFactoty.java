package java_practic.lectures.lecture_23.paterns.abstractfactory;

public class HumanSquadronFactoty extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new HumanMage();
    }

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }
}
