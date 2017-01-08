package comjosim74.github.rrfoundationtutorial;

/**
 * Created by MD JOSIM UDDIN on 1/8/2017.
 */

public class DomesticAnimal {

    private String name;
    private String numberOfLegs;
    private String food;

    public DomesticAnimal(String name, String numberOfLegs, String food){
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.food = food;
    }
public String writeEssay(){
    String firsSentence = "The name of animal is"+name;
    String secondSentence = "It has "+numberOfLegs;
    String thirdSentence = "It lives on "+food;
    String all = firsSentence+secondSentence+thirdSentence;
    return all;
}





    /*String name;
    String numberOfLegs;
    String food;

    public DomesticAnimal(String name, String numberOfLegs, String food){
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.food = food;
    }
    public String writeEssay(){
        String sentenceOne = name+" is a domestic animal.";
        String sentenceTwo = name+" has"+numberOfLegs+" legs";
        String lastSentence = "It lives on "+food;
        String essay =sentenceOne+sentenceTwo+lastSentence;
        return essay;
    }*/
}
