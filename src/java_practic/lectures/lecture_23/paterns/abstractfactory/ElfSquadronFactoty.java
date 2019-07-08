package java_practic.lectures.lecture_23.paterns.abstractfactory;

public class ElfSquadronFactoty extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }
}
