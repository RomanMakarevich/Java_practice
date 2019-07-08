package java_practic.lectures.lecture_23.paterns.abstractfactory;

public class Squadron {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    public Squadron(SquadronFactory squadronFactory) {
     this.mage = squadronFactory.createMage();
     this.archer = squadronFactory.createArcher();
     this.warrior = squadronFactory.createWarrior();
    }

    public void fight(){
        mage.cast();
        archer.shoot();
        warrior.attack();
    }
}
