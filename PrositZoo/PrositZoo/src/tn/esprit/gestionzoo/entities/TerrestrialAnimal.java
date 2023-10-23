package tn.esprit.gestionzoo.entities;

public class TerrestrialAnimal extends Animal {
    private int nbrLegs;
    public TerrestrialAnimal() {}

    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + " | Number of Legs: " + nbrLegs;
    }

}


