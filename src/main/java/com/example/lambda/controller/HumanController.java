package com.example.lambda.controller;

import com.example.lambda.HumanFunction;
import com.example.lambda.NumberOparation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    // Lambda expression

    @GetMapping("/human")
    public void getHuman(){
        HumanFunction humaneat=()->{
            System.out.println("eating ");
        };
        humaneat.eat();
    }
    @GetMapping("/addition")
    public void addNumber(){
        NumberOparation addition=(x1,x2)->{ //not compulsory to put same input parameter names
            return x1+x2;
        };
       int total= addition.perform(5,10);
        System.out.println(total);
    }
    @GetMapping("/substraction")
    public  void subs(){
        NumberOparation substraction=( x1,x2)->
             x1-x2; // no need of return statement if there is a one line(remove curly braces also)
        int total= substraction.perform(20,10);
        System.out.println(total);
    }
    @GetMapping("/multi")
    public void multi() {
        NumberOparation multiplication = (z1, z2) ->
             z1 * z2;
       int total= multiplication.perform(5,12);
        System.out.println(total);
    }
}

