public class Main {
    public static void main(String[] args){

        //User usuario = new User (2121, "Michel"); 
        //usuario.printUser();
       
        BasicUser freeUser;
        freeUser = new BasicUser(1300,"Velasco", "Free");
        freeUser.setDevices(2);
        freeUser.printBasicUser();

        Premium premiumUser = new Premium(1400,"Gonzalez", "Premium");
        premiumUser.setDevices(2);
        premiumUser.printPremiumUser();

        Paypal paypalUser = new Paypal("Michel", 19890321, "michel@paypal.com");
        paypalUser.printPaypal();

        Interaction publication = new Interaction("MichelVelasco", 21031989);
        publication.printInteraction();





    }

}
