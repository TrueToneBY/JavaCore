package Generic;

import java.util.Queue;

public class Animal {
    public Animal(){

    }
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }

    public void eat(){
        System.out.println("Hello Dog");
    }
}
