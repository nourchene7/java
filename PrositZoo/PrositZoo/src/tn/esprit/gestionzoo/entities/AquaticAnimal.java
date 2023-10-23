package tn.esprit.gestionzoo.entities;

public abstract class AquaticAnimal extends Animal {
    private String habitat;

    public AquaticAnimal() {}

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + " | Habitat: " + habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AquaticAnimal other = (AquaticAnimal) obj;
        return getName().equals(other.getName())
                && getAge() == other.getAge()
                && habitat.equals(other.habitat);
    }
}