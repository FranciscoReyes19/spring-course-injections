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

    //Cuando se crea la instancia de este tipo, se crean tambien los registros
    //utilizando el identificador "itemsFacturaOficina" podemos hacer switch entre que tipo se instanciará
    //Como inicializador de datos
    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto = new Producto("Monitor LG",250);
        Producto producto2 = new Producto("Notebook Asus",500);
        Producto producto3 = new Producto("Impresora HP multi",700);
        Producto producto4 = new Producto("Escritorio oficina",1500);

        ItemFactura lineal = new ItemFactura(producto, 2);
        ItemFactura lineal2 = new ItemFactura(producto2, 1);
        ItemFactura lineal3 = new ItemFactura(producto3, 1);
        ItemFactura lineal4 = new ItemFactura(producto4, 1);

        return Arrays.asList(lineal,lineal2, lineal3, lineal4);
    }

}
