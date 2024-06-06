package co.develhope.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

    @GetMapping("/sum")
    public int sum(int a, int b){
        return a + b;
    }
}
