class Basicuser extends User {
    String membershipType;
    Integer devices;

    public Basicuser (Integer id, String name, String membershipType, Integer devices) {
        super(id, name);
        this.membershipType = membershipType;
        this.devices = devices;

    }
    
}
