class Paypal extends Payment {
    String correo;

    public Paypal (String name, Integer accNum, String correo) {
        super(name, accNum);
        this.correo = correo;
    }

    public void printPaypal() {
        super.printPayment();
        System.out.println("Paypal email: " + correo + "\n");
    }


    
}
