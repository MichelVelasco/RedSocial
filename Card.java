class Card extends Payment{
    Integer cvv;

    public Card (Integer cvv, String name, Integer accNum) {
        super(name, accNum);
        this.cvv = cvv;
    }
}