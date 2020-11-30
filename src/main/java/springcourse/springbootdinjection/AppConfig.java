package springcourse.springbootdinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springcourse.springbootdinjection.models.domain.ItemFactura;
import springcourse.springbootdinjection.models.domain.Producto;
import springcourse.springbootdinjection.models.service.IServicio;
import springcourse.springbootdinjection.models.service.MiServicio;
import springcourse.springbootdinjection.models.service.MiServicioComplex;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("identificadorBean")
    public IServicio registrarServicio() {
        return new MiServicio();
    }

    @Bean("identificadorBeanComplex")
    public IServicio registrarServicioComplex() {
        return new MiServicioComplex();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto = new Producto("Camara Sony",100);
        Producto producto2 = new Producto("Camara Samsumng",200);

        ItemFactura lineal = new ItemFactura(producto, 2);
        ItemFactura lineal2 = new ItemFactura(producto2, 4);

        return Arrays.asList(lineal,lineal2);
    }

}
