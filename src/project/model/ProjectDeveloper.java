package project.model;


public class ProjectDeveloper {
    private int id;
    private int projectId;
    private int DeveloperId;

    public ProjectDeveloper() {
    }

    public ProjectDeveloper(int id, int projectId, int developerId) {
        this.id = id;
        this.projectId = projectId;
        DeveloperId = developerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getDeveloperId() {
        return DeveloperId;
    }

    public void setDeveloperId(int developerId) {
        DeveloperId = developerId;
    }

    @Override
    public String toString() {
        return "ProjectDeveloper{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", DeveloperId=" + DeveloperId +
                '}';
    }
}
