package t708m.myserviceclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t708m.myserviceclient.service.HelloWorld;
import t708m.myserviceclient.service.HelloWorldServiceLocator;
import t708m.myserviceclient.service.place.PlaceService;
import t708m.myserviceclient.service.place.PlaceServiceServiceLocator;

import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {

    @Bean
    HelloWorld helloWorld() throws ServiceException {
        return new HelloWorldServiceLocator().getHelloWorldPort();
    }

    @Bean
    PlaceService placeService() throws ServiceException {
        return new PlaceServiceServiceLocator().getPlaceServicePort();
    }
}
