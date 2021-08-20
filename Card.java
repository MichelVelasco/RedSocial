class Card extends Payment{
    Integer cvv;

    public Card (Integer cvv, String name, Double accNum) {
        super(name, accNum);
        this.cvv = cvv;
    }
}