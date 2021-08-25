class BasicUser extends User {
    private String membershipType;
    private Integer devices;

    public BasicUser (Integer id, String name, String membershipType, Integer devices) {
        super(id, name);
        this.membershipType = membershipType;
        this.devices = devices;

    }
    public void setdevices (Integer devices) {
        if (devices > 1) {
            System.out.println("\nYou need a Premium Account\n");
        }
        else {
            this.devices = devices;
        }
    }

    public Integer getDevices(){
        return devices;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }
    
    public void printBasicUser(){
        super.printUser();
        System.out.println("Membership Type: " + membershipType + "\nDevices allowed: " + devices + "\n");
    }
}
