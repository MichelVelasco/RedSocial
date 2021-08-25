public class Main {
    public static void main(String[] args){

        //User usuario = new User (2121, "Michel"); 
        //usuario.printUser();
       
        BasicUser freeUser;
        freeUser = new BasicUser(1989 , "Velasco", "Free", 1);
        freeUser.printBasicUser();

        Paypal paypalUser = new Paypal("Michel", 19890321, "michel@paypal.com");
        paypalUser.printPaypal();

        Interaction publication = new Interaction("MichelVelasco", 21031989);
        publication.printInteraction();



    }

}
