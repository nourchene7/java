package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;



public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        AquaticAnimal dolphin = new Dolphin();
        dolphin.setName("Leo");
        dolphin.setAge(9);
        dolphin.setFamily("Dolphin");
        dolphin.setMammal(true);
        ((Dolphin) dolphin).setSwimmingSpeed(58.0f);

        AquaticAnimal penguin = new Penguin();
        penguin.setName("Lucas");
        penguin.setAge(8);
        penguin.setFamily("Penguin");
        penguin.setMammal(false);
        ((Penguin) penguin).setSwimmingDepth(79.0f);

        TerrestrialAnimal dog = new TerrestrialAnimal();
        dog.setName("Scooby");
        dog.setAge(2);
        dog.setFamily("Ursidae");
        dog.setMammal(true);
        dog.setNbrLegs(4);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        Animal dog2 = new Animal("Canine", "Lll", 2, true);


        System.out.println(myZoo);
        myZoo.addAnimal(lion);
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.searchAnimal(dog2));

        myZoo.displayAnimals();

        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();

        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(dog);

        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
        System.out.println(myZoo.isZooFull());

        AquaticAnimal shark = new Dolphin("Fish", "Lolla", 3, true, "Ocean");
        myZoo.addAquaticAnimal(shark);

        AquaticAnimal turtle = new Dolphin("Reptile", "Lolita", 100, true, "Ocean");
        myZoo.addAquaticAnimal(turtle);

        for (int i = 0; i < myZoo.getNbrOfAquaticAnimals(); i++) {
            AquaticAnimal animal = (AquaticAnimal) myZoo.getAquaticAnimals()[i];
            animal.swim();
        }

        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins est : " + maxDepth);

        myZoo.displayNumberOfAquaticsByType();
    }
}