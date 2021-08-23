class Premium extends User {
    String membershipType;
    String devices;

    public Premium (Integer id, String name, String membershipType, String devices) {
        super(id, name);
        this.membershipType = membershipType;
        this.devices = devices;
    }
}
