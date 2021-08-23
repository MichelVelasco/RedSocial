public class Streaming extends Interaction {
    String contentType;
    Integer volume;

    public Streaming (String remitente, Integer fecha, String contentType, Integer volume) {
        super(remitente, fecha);
        this.contentType = contentType;
        this.volume = volume;
    }
    
}
