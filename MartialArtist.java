public class MartialArtist extends Adventurer {

    public MartialArtist(String mingzi) {
	setName(mingzi);
	setQi(18);
    }

    private double qi;

    public double getQi() {
	return qi;
    }
    public void setQi(double qi) {
	this.qi = qi;
    }

    public void attack(Adventurer target) {
	System.out.println(getName() + " karate-chopped " + target.getName() + "!");
	if (hit(target)) {
	    target.takeDamage(damageCalc(6, target));
	    if (rand.nextDouble() < 0.1) {
		qi += 0.85;
		System.out.println(getName() + "\'s qi rose.");
	    }
	}
	else {
	    System.out.println(getName() + "\'s attack missed...");
	    if (rand.nextDouble() < 0.2) {
		qi -= 0.45;
		System.out.println(getName() + "\'s qi fell slightly...");
	    }
	}
    }

    public void specialAttack(Adventurer target) {
	System.out.println(getName() + " roundhouse kicked " + target.getName() + "!");
	if (hit(target)) {
	    target.takeDamage(damageCalc(9, target));
	    if (rand.nextDouble() < 0.1) {
		qi += 1.25;
		System.out.println(getName() + "\'s qi rose sharply!");
	    }
	}
	else {
	    System.out.println(getName() + "\'s attack missed...");
	    qi -= 0.45;
	    System.out.println(getName() + "\'s qi fell slightly...");
	}
    }

}
