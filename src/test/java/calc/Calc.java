package calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class Calc {
    String value;
    String[] values;
    int result;
    int number;

    @BeforeEach
    void setUp(){
        //Scanner sc = new Scanner(System.in);
        value = "2 + 3 * 4 / 2";
        values = value.split(" ");
        result = 0;
    }

    @Test
    void calc(){
        for (int i = 0; i < values.length; i++) {
            try {
                number = Integer.parseInt(values[i]);
            }catch (Exception e){
                switch (values[i]){
                    case "+" :
                        result += result + number;
                        break;
                    case "-" :
                        result += result - number;
                        break;
                    case "*" :
                        result += result * number;
                        break;
                    case "/" :
                        result += result / number;
                        break;
                }
            }
        }
        System.out.println("결과 = " +result);
    }



}
