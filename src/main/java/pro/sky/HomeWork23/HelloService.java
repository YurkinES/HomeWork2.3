package pro.sky.HomeWork23;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloService {
    public String answerCalculate() {
        return "Добро пожаловать в программу калькулятор";
    }

}
