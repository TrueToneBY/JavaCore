package Lessons48Enum;

public enum Animal {
    CAT("Кот"),DOG("Собака"),FROG("Лягушка");

    private final String translation;

     Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
         return translation;
    }

    public String toString(){
         return "Perevod na Russia  " +  translation;
    }


}
