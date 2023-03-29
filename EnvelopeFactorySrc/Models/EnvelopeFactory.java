package Models;

public class EnvelopeFactory {

    public static Envelope getEnvelope(String size, int weight){
        if(size.equals("A4")){
            return new A4(size,weight);
        }
        if(size.equals("A5")){
            return new A5(size,weight);
        }
        if(size.equals("A6")){
            return new A6(size,weight);
        }
        else {return null;}
    }

}
