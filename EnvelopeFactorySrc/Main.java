import Models.Envelope;
import Models.EnvelopeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(EnvelopeFactory.getEnvelope("A4", 100));
        System.out.println(EnvelopeFactory.getEnvelope("A5", 200));
        System.out.println(EnvelopeFactory.getEnvelope("A6", 300));





    }

}