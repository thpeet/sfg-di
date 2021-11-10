package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

		String response = myController.helloWorld();
		System.out.println(response);
	}

}
