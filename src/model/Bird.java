package model;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(String animalId, String animalType,
                String description, boolean canFly) {

        super(animalId, animalType, description);

        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String getAnimalCategory() {
        return "BIRD";
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Can Fly: " + canFly);
    }
}