class Premium extends User {
    String mT;
    String devices;

    public Premium (Integer id, String name, String mT, String devices) {
        super(id, name);
        this.mT = mT;
        this.devices = devices;
    }
}
