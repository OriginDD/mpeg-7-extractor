package de.origindd.extractor;

import de.origindd.mpeg.mpeg7._2004.Mpeg7;
import lombok.Data;

@Data
public class Mpeg7MarshalException extends RuntimeException {

    private Mpeg7 rootElement;

    public Mpeg7MarshalException(Mpeg7 rootElement, Exception ex){
        super(String.format("Cannot marshal document %s, got Exception %s", rootElement, ex), ex);
        this.rootElement = rootElement;
    }

    public static Mpeg7MarshalException with(Mpeg7 rootElement, Exception ex){
        return new Mpeg7MarshalException(rootElement, ex);
    }

}
