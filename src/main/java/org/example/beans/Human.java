package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Human implements Alive{

    @Override
    public void makeSound() {
        System.out.println("Hello!");
    }
}
