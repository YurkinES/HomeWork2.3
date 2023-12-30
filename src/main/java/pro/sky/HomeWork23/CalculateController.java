package pro.sky.HomeWork23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculateController {
    private final CalculateService calculateService;
    public CalculateController(CalculateService calculateService){
        this.calculateService = calculateService;
    }
    @GetMapping(path = "/plus")
       public String plusAnswer(@RequestParam float num1, @RequestParam float num2){
          return calculateService.plusAnswer(num1, num2);
       }

    @GetMapping(path = "/minus")
    public String minusAnswer(@RequestParam float num1,@RequestParam float num2){
    return calculateService.minusAnswer(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyAnswer(@RequestParam float num1,@RequestParam float num2){
    return calculateService.multiplyAnswer(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divideAnswer(@RequestParam float num1,@RequestParam float num2){
    return calculateService.divideAnswer(num1, num2);
    }
}





