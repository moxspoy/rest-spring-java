package hello.controller;

import java.util.concurrent.atomic.AtomicLong;

import hello.model.Greeting;
import hello.model.Jodoh;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/bgst")
    public Jodoh jodoh() {
        return new Jodoh("bangsat", "hh", 12, 13);
    }

    @RequestMapping("/str")
    public String str() {
        return "<h1>Bangsat</h1>";
    }
}
