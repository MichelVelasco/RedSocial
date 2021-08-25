class Premium extends User {
    String membershipType;
    Integer devices;

    public Premium (Integer id, String name, String membershipType, Integer devices) {
        super(id, name);
        this.membershipType = membershipType;
        this.devices = devices;
    }

    public void setDevices(Integer devices) {
        if (devices < 3 || devices > 3 ) {
            System.out.println("\nYou are premium, 3 devices are allowed\n");
        }
        else {
            this.devices = devices;
        }
    }

    public Integer getDevices() {
        return devices;
    }

    public void setMembershipType (String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipType () {
        return membershipType;
    }

    public void printPremiumUser(){
        super.printUser();
        System.out.println("Membership Type: " + membershipType + "\nDevices allowed: " + devices + "\n");
    }
}
