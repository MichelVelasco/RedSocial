import java.util.Date;

class User {
    private double id;
    private String name;
    private Date doa;
    private String email;
    private String password;

    public User (Double id, String name, Date doa) {
        this.id = id;
        this.name = name;
        this.doa = doa;
    }
}