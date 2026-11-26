package model;

public class Animal {
    private String animalId;
    private String animalType;
    private String condition;


    public String getAnimalId() {
        return animalId;
    }
    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }
    public String getAnimalType() {
        return animalType;
    }
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }




    public Animal(String animalId, String condition, String animalType) {
        this.animalId = animalId;
        this.condition = condition;
        this.animalType = animalType;
    }





}
