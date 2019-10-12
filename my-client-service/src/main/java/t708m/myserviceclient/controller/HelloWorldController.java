package t708m.myserviceclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import t708m.myserviceclient.service.HelloWorld;
import t708m.myserviceclient.service.HelloWorldServiceLocator;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @Autowired
    HelloWorld helloWorld;

    @RequestMapping(method = RequestMethod.GET, value = "/world")
    public String sayHello(Model model, @RequestParam(name = "name") String name) {
        try {
            model.addAttribute("message", helloWorld.sayHelloWorldFrom(name));
        }catch (Exception ex){

        }

        return "hello";
    }
}
