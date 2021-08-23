public class Inbox extends Interaction{
    String contentType;
    Boolean characters;

    public Inbox (String contentType, Boolean characters, String remitente, Integer fecha) {
        super(remitente, fecha);
        this.contentType = contentType;
        this.characters = characters;

    }
}
