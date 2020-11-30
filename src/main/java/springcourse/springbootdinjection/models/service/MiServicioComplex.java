package springcourse.springbootdinjection.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("identificadorComplex")
public class MiServicioComplex implements IServicio {

    @Override
    public String operacion() {
        return "resolviendo servicio complicado...";
    }
}
