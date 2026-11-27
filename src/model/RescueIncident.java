package model;

import enums.IncidentStatus;
import enums.LocationRisk;
import enums.PriorityCategory;

import java.util.List;

public class RescueIncident {

    private int animalCount;
    private String location;
    private LocationRisk LocationRisk;
    private boolean immediateDanger;
    private List<Equipment> requiredEquipments;
    private String reporterContact;
    private int priorityScore;
    private IncidentStatus status;
    private String assignedTeamId;
    private List<Animal> animals;
    private List<String> requiredSkills;
    private PriorityCategory priority;
    private String incidentId;

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocationRisk getLocationRisk() {
        return LocationRisk;
    }

    public void setLocationRisk(LocationRisk locationRisk) {
        LocationRisk = locationRisk;
    }

    public List<Equipment> getRequiredEquipments() {
        return requiredEquipments;
    }

    public void setRequiredEquipments(List<Equipment> requiredEquipments) {
        this.requiredEquipments = requiredEquipments;
    }

    public boolean isImmediateDanger() {
        return immediateDanger;
    }

    public void setImmediateDanger(boolean immediateDanger) {
        this.immediateDanger = immediateDanger;
    }

    public String getReporterContact() {
        return reporterContact;
    }

    public void setReporterContact(String reporterContact) {
        this.reporterContact = reporterContact;
    }

    public int getPriorityScore() {
        return priorityScore;
    }

    public void setPriorityScore(int priorityScore) {
        this.priorityScore = priorityScore;
    }

    public IncidentStatus getStatus() {
        return status;
    }

    public void setStatus(IncidentStatus status) {
        this.status = status;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public String getAssignedTeamId() {
        return assignedTeamId;
    }

    public void setAssignedTeamId(String assignedTeamId) {
        this.assignedTeamId = assignedTeamId;
    }


    public RescueIncident(String incidentId, PriorityCategory priority, List<String> requiredSkills, List<Animal> animals, String assignedTeamId, IncidentStatus status, String reporterContact, int priorityScore, List<Equipment> requiredEquipments, boolean immediateDanger, LocationRisk locationRisk, String location, int animalCount) {
        this.incidentId = incidentId;
        this.priority = priority;
        this.requiredSkills = requiredSkills;
        this.animals = animals;
        this.assignedTeamId = assignedTeamId;
        this.status = status;
        this.reporterContact = reporterContact;
        this.priorityScore = priorityScore;
        this.requiredEquipments = requiredEquipments;
        this.immediateDanger = immediateDanger;
        LocationRisk = locationRisk;
        this.location = location;
        this.animalCount = animalCount;
    }



    public PriorityCategory getPriority() {
        return priority;
    }

    public void setPriority(PriorityCategory priority) {
        this.priority = priority;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }
}
