public class Posting extends Interaction{
    String contentType;
    Integer devices;

    public Posting (String remitente, Integer fecha, String ContentType, Integer devices) {
        super(remitente, fecha);
        this.contentType = ContentType;
        this.devices = devices;
    }
    
}
