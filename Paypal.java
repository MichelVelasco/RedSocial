class Paypal extends Payment {
    String correo;

    public Paypal (String name, Double accNum, String correo) {
        super(name, accNum);
        this.correo = correo;
    }



    
}
