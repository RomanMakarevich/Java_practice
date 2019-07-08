package java_practic.lectures.lecture_23.paterns.abstractfactory;

public abstract class SquadronFactory {
    public abstract Mage createMage();
    public abstract Warrior createWarrior();
    public abstract Archer createArcher();

}
