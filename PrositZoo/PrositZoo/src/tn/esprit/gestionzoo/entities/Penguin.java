package tn.esprit.gestionzoo.entities;

public class Penguin extends AquaticAnimal {
    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " nage à une profondeur de " + swimmingDepth + " mètres");
    }

    @Override
    public String toString() {
        return super.toString() + " | Profondeur de nage : " + swimmingDepth;
    }
}