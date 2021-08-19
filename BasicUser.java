class Basicuser extends User {
    String membershipType;
    Integer devices;

    public Basicuser (String membershipType, Integer devices) {
        this.membershipType = membershipType;
        this.devices = devices;

    }
    
}
