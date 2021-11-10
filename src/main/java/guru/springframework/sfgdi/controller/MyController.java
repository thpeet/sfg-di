package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld(){
        System.out.println("Hello from the method");
        return "Hello world";
    }
}
