package pers;
import enums.*;
import interfaces.*;
import abstrakt_class.*;
import technical.*;
import java.util.Objects;
public class malesh extends People implements ThinksPepls {
    //private String name="Малыш";
    private Location locashen=Location.darkness;
    private int dexterity;
    private int probability;
    NoiseLevel boise=new NoiseLevel();
    public malesh(int dexterity,int probability){
        super("Малыш",dexterity);
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
                System.out.println(this.name +" стараясь не шуметь, прячясь за "+ locashen);
                break;
            case hid:
                System.out.println(this.name +" спрятался под диван у камина ");
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    int a=0;
    public void thinks(things thoughts_malesh){
        //System.out.println(this.name + " думает - Наверно, нашел " + thoughts_malesh);
        switch (thoughts_malesh) {
            case money:
                System.out.println(this.name + " думает - Наверно, нашел " + thoughts_malesh);
                break;
            case rings:
                System.out.println(this.name + " думает - Наверно, нашел кольца и брошки" );
                break;
        }
    }
}