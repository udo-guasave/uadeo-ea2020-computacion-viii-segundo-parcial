import SqliteConnection;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String rememberToken;

    // CRUD - Create Read Update Delete
    
    public void All() {
        try (Connection cnn = SqliteConnection.Connect()) {
            // TODO: realizar la consulta select * from users
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void Add() {}
    public void FindById(int id) {}
    public void SaveChanges() {}
    public void Delete(int id) {}
}