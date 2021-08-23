public class Streaming extends Interaction {
    String contentType;
    Integer devices;

    public Streaming (String remitente, Integer fecha, String contentType, Integer devices) {
        super(remitente, fecha);
        this.contentType = contentType;
        this.devices = devices;
    }
    
}
