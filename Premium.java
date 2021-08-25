//esta clase extiende de User

class Premium extends User {

    String membershipType;
    Integer devices;

    public Premium (Integer id, String name, String membershipType) {
        super(id, name);
        this.membershipType = membershipType;
    }

    //Validamos que devices sea 3, de lo contrario le decimos al usuario que se permiten 3 devices
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
    
    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    //Invocamos el metodo PrintUser de la clase user y mostramos tambien la informacion de Premium
    public void printPremiumUser(){
        super.printUser();
        System.out.println("Membership Type: " + membershipType + "\nDevices allowed: " + devices + "\n");
    }
}
