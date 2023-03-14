package book.dto;

public class UserTO {
    private String pass;
    private String name;
    private String email;
    public UserTO() {

    }
    public UserTO( String name, String email,String pass) {
        super();

        this.name = name;
        this.email = email;
        this.pass=pass;
    }
    public String getpass() {
        return pass;
    }
    public void setpass(String pass) {
        this.pass = pass;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
