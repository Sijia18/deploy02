package co.develhope.deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

    @Value("${int1}")
    private int int1;

    @Value("${int2}")
    private int int2;

    @GetMapping
    public int sum() {
        return int1 + int2;
    }
}
