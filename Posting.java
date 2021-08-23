public class Posting extends Interaction{
    String contentType;
    Integer filter;

    public Posting (String remitente, Integer fecha, String ContentType, Integer filter) {
        super(remitente, fecha);
        this.contentType = ContentType;
        this.filter = filter;
    }
    
}
