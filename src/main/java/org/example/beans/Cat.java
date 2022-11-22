package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Alive{

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
