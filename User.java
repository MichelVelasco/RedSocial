class User {
    private Integer id;
    private String name;
    private String email;
    private String password;

    public User (Integer id, String name) {
        this.id = id;
        this.name = name;
    }
 

    public void printUser() {
        System.out.println("ID: " + id + "\nName: " + name);
    }
}