package springcourse.springbootdinjection.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("identificadorMain")
//@Primary
public class MiServicio implements IServicio {

    @Override
    public String operacion() {
        return "resolviendo servicio simple...";
    }
}
