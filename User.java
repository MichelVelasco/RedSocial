class User {
    private Integer id;
    private String name;
    private String email;
    private String password;

    public User (Integer id, String name) {
        this.setId(id); //indicamos que cuando se reciba un parametro en "id" debe pasar por la funcion setId
        this.setName(name);//indicamos que cuando se reciba un parametro en "name" debe pasar por la funcion setname
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

    //Mostramos la informacion solo de User
    public void printUser() {
        System.out.println("==USER INFO==");
        System.out.println("ID: " + id + "\nName: " + name);
    }

}