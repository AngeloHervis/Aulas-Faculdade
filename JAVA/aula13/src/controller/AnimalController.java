package controller;
import model.IAnimal;

import java.util.Collections;
import java.util.List;

public class AnimalController{
    List<IAnimal> animais;

    public AnimalController(List<IAnimal> animais) {
        this.animais = animais;
    }

    public void ordernarPorNome(){
        //Collections.sort(animais, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
       Collections.sort(animais);
    }

    public List<IAnimal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<IAnimal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "AnimalController [animais=" + animais + "]";
    }

    
}