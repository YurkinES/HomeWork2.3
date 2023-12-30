package pro.sky.HomeWork23;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class CalculateService {
    @GetMapping(path = "/calculator/plus")
    public String plusAnswer(float num1,float num2){
        float i = num1 + num2;
        return num1 + " + " + num2 + " = " + i;
        }

    @GetMapping(path = "/calculator/minus")
    public String minusAnswer(float num1,float num2){
        float i = num1 - num2;
        return num1 + " - " + num2 + " = " + i;
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyAnswer(float num1,float num2){
        float i = num1 * num2;
        return num1 + " * " + num2 + " = " + i;
    }
    @GetMapping(path = "/calculator/divide")
    public String divideAnswer(float num1,float num2){
        if (num2 != 0 ) {
            float i = num1 / num2;
            return num1 + " / " + num2 + " = " + i; }
        else {
            return "На ноль делить нельзя!";
        }
    }
}
