package Lessons43;

public class ElectroCar {
    private int id;
    public ElectroCar(int id){
        this.id = id;
    }
    public void start(){
        System.out.println("ElectoCar " + id + " is starting...");
    }
}
