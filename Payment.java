class Payment {
    private String name;
    private Integer accNum;

    public Payment (String name, Integer accNum) {
        this.name = name;
        this.accNum = accNum;
    }

    public void printPayment () {
        System.out.println("Account Name: " + name + "\nAccount Number: " + accNum + "\n");
    }
}