class BasicUser extends User {
    String membershipType;
    Integer devices;

    public BasicUser (Integer id, String name, String membershipType, Integer devices) {
        super(id, name);
        this.membershipType = membershipType;
        this.devices = devices;

    }
    
    public void printBasicUser(){
        super.printUser();
        System.out.println("Membership Type: " + membershipType + "\nDevices allowed: " + devices);
    }
}
