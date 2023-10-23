package tn.esprit.gestionzoo.entities;

public class Dolphin extends AquaticAnimal {
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " nage à une vitesse de " + swimmingSpeed + " km/h");
    }

    @Override
    public String toString() {
        return super.toString() + " | Vitesse de nage : " + swimmingSpeed;
    }
}