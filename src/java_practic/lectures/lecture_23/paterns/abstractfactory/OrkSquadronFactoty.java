package java_practic.lectures.lecture_23.paterns.abstractfactory;

public class OrkSquadronFactoty extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new OrkMage();
    }

    @Override
    public Warrior createWarrior() {
        return new OrkWarrior();
    }

    @Override
    public Archer createArcher() {
        return new OrkArcher();
    }
}
