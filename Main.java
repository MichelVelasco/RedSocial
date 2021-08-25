public class Main {
    public static void main(String[] args){

        //User usuario = new User (2121, "Michel"); 
        //usuario.printUser();
       
        BasicUser freeUser;
        freeUser = new BasicUser(1989 , "Velasco", "Free", 2);
        freeUser.setdevices(2);
        freeUser.printBasicUser();

        Premium premiumUser = new Premium(2121, "Gonzalez", "Premium", 2);
        premiumUser.printPremiumUser();

        Paypal paypalUser = new Paypal("Michel", 19890321, "michel@paypal.com");
        paypalUser.printPaypal();

        Interaction publication = new Interaction("MichelVelasco", 21031989);
        publication.printInteraction();





    }

}
