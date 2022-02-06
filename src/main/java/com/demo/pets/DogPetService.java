package com.demo.pets;

import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 12/28/19.
 */
@Profile("dog")
public class DogPetService implements PetService{
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
