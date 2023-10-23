package tn.esprit.gestionzoo.entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
   private int nbrAnimals;
   private Animal[] aquaticAnimals;
   private int nbrAquaticAnimals;

    public Zoo() {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Animal[10];
        nbrAnimals = 0;
        nbrAquaticAnimals = 0;
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }
    private String validateName(String name) {
        if (name.isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide.");
            return "";
        } else {
            return name;
        }
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public void addAquaticAnimal(AquaticAnimal aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println("Aquatic animal added successfully!");
        } else {
            System.out.println("Aquatic animals section is full.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) animals[i];
                float depth = penguin.getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numDolphins = 0;
        int numPenguins = 0;

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] instanceof Dolphin) {
                numDolphins++;
            } else if (animals[i] instanceof Penguin) {
                numPenguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + numDolphins);
        System.out.println("Nombre de pingouins : " + numPenguins);
    }
}
