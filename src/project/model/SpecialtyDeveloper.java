package project.model;


public class SpecialtyDeveloper {
    private int id;
    private int specialtyId;
    private int developerId;

    public SpecialtyDeveloper() {
    }

    public SpecialtyDeveloper(int id, int specialtyId, int developerId) {
        this.id = id;
        this.specialtyId = specialtyId;
        this.developerId = developerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    @Override
    public String toString() {
        return "SpecialtyDeveloper{" +
                "id=" + id +
                ", specialtyId=" + specialtyId +
                ", developerId=" + developerId +
                '}';
    }
}
