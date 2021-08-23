class Paypal extends Payment {
    String correo;

    public Paypal (String name, Integer accNum, String correo) {
        super(name, accNum);
        this.correo = correo;
    }



    
}
