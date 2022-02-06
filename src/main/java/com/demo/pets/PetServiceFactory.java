package com.demo.pets;

public class PetServiceFactory {
    public PetService getPetService(String petType){
        switch (petType){
            case "Dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
