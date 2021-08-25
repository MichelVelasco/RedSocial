import java.rmi.Remote;

class Interaction {
    private String remitente;
    private  Integer fecha;

    public Interaction (String remitente, Integer fecha) {
        this.remitente = remitente;
        this.fecha = fecha;
    }

    public void printInteraction() {
        System.out.println("Owner: " + remitente + "\nPublication Date: " + fecha + "\n");
    }
}