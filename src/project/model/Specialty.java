package project.model;

public class Specialty {
    private int keyid;
    private String specialtyTitle;

    public Specialty() {

    }

    public Specialty(int keyid, String specialtyTitle) {
        this.keyid = keyid;
        this.specialtyTitle = specialtyTitle;
    }

    public int getKeyid() {
        return keyid;
    }

    public void setKeyid(int keyid) {
        this.keyid = keyid;
    }

    public String getSpecialtyTitle() {
        return specialtyTitle;
    }

    public void setSpecialtyTitle(String specialtyTitle) {
        this.specialtyTitle = specialtyTitle;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "keyid=" + keyid +
                ", specialtyTitle='" + specialtyTitle + '\'' +
                '}';
    }
}
