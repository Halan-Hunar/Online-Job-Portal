package idea.project;

public interface Manageable {
  boolean create(String... details);
  boolean edit(String... details);
  boolean delete(int id);
}