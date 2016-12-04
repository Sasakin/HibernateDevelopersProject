package project.model;

public class Project {
    private int id;
    private String projectTitle;
    private int clientId;
    private int companyId;
    private int cost;

    public Project() {
    }

    public Project(int id, String projectTitle, int clientId, int companyId, int cost) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.clientId = clientId;
        this.companyId = companyId;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getprojectTitle() {
        return projectTitle;
    }

    public void setprojectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectTitle='" + projectTitle + '\'' +
                ", clientId=" + clientId +
                ", companyId=" + companyId +
                ", cost=" + cost +
                '}';
    }
}
