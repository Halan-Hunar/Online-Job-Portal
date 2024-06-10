package idea.project;

public abstract class JobPortalManager {
  public abstract boolean create(String... details);
  public abstract boolean edit(String... details);
  public abstract boolean delete(int id);
}