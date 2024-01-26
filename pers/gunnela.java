package pers;
import java.util.Objects;
import enums.*;
import abstrakt_class.*;
import technical.*;

public class gunnela extends People {
    private String name="Гуннела";
    private int dexterity;
    private int probability;
    NoiseLevel boise=new NoiseLevel();
    private Location locashen=Location.darkness;
    public gunnela(int dexterity,int probability){
        super("Гуннела",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }
    public void moving(movement Movement,Location locashen){
        this.locashen=locashen;
        switch (Movement) {
            case sneaking:
                System.out.println(this.name + " прокрался в "+ locashen);
                break;
            case sneaks:
                System.out.println(this.name +" пробрался на "+ locashen);
                break;
            case hiding:
                System.out.println(this.name +" стараясь не шуметь, прячясь за " + locashen);
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
}