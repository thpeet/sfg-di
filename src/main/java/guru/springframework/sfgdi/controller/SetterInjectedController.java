package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting(){
        return this.greetingService.getGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
