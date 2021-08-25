//Esta clase extendiende de User
class BasicUser extends User {
    private String membershipType;
    private Integer devices;

    public BasicUser (Integer id, String name, String membershipType) {
        super(id, name);
        this.membershipType = membershipType;
    }


    public String getMembershipType() {
        return membershipType;
    }


    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }


    public Integer getDevices() {
        return devices;
    }

//validamos que el numero de devices sea solo 1, de lo contrario avisamos al usuario que necesita una cuenta Premium
    public void setDevices(Integer devices) {
        if (devices==1){
            this.devices = devices;
        }
        else{
            System.out.println("Premium account is needed to use more devices");
            devices=null;
        }
        
    }

//Invocamos el metodo PrintUser de la clase user y mostramos tambien la informacion de Basic User
    public void printBasicUser(){
        super.printUser();
        System.out.println("Membership Type: " + membershipType + "\nDevices allowed: " + devices + "\n");
    }
}
