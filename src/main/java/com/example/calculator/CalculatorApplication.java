package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class kalkulator{
    int A;
    int B;
    public int AddAToB (int A, int B){
        return A + B;
    }
    public int SubtractAFromB (int A, int B){
        return A - B;
    }
}
public class CalculatorApplication {

    public static void main(String[] args) {
        kalkulator SimpleCalculator = new kalkulator ();
        int result = SimpleCalculator.AddAToB(5,6);
        int result1 = SimpleCalculator.SubtractAFromB(9,4);
        System.out.println(result);
        System.out.println(result1);
    }

}
