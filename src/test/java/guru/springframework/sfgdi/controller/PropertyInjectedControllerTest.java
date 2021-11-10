package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void greetingTest(){
        System.out.println(this.controller.getGreeting());
    }
}