class User {
    private Integer id;
    private String name;
    private String email;
    private String password;

    public User (Integer id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
       if (id > 1500) {
           this.id = id;
       } 
       else { 
            System.out.println("Invalid ID");
       }
    }

    public void printUser() {
        System.out.println("ID: " + id + "\nName: " + name);
    }

}