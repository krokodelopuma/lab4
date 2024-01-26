package pers;
import java.util.Objects;
import enums.*;
import abstrakt_class.*;
import technical.*;
public class fella extends People {
    private String name="Филе";
    private int dexterity;
    private int probability;
    private Location locashen=Location.kitchen;
    NoiseLevel boise=new NoiseLevel();
    public fella(int dexterity,int probability){
        super("Филе",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }
    public void moving(movement Movement,Location locashen) {
        this.locashen=locashen;
        switch (Movement) {
            case sneaking:
                System.out.println(this.name + " прокрался в " + this.locashen);
                break;
            case sneaks:
                System.out.println(this.name + " пробрался на " + this.locashen);
                break;
            case hiding:
                System.out.println(this.name + " стараясь не шуметь, прячясь за мебелью " + this.locashen);
                break;
            case burstin:
                System.out.println(this.name + " ворвался на " + this.locashen);
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    @Override
    public void Fear() {
        fear=true;
        System.out.println(name+ " испугался");
        moving(movement.burstin,Location.kitchen);
        System.out.println(name+ " бледен как полотно");
    }

}