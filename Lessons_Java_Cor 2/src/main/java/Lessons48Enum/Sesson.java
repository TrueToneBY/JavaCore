package Lessons48Enum;

public enum Sesson {
    SUNBER(20),WINTER(25),AUTUMN(50),SPRING(40);

    private int temperatyra;

    Sesson(int temperatyra){
        this.temperatyra = temperatyra;
    }

    public int getTemperatyra() {
        return temperatyra;
    }
    public String toString(int temperatyra){
        return "Temperatyra " + temperatyra;
    }
}
