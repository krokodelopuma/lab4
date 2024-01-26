package pers;
import enums.*;
import abstrakt_class.*;
import technical.*;
import java.util.Objects;
public class krester extends People {
    private String name="Кристер";
    private Location locashen=Location.darkness;
    private int dexterity;
    private int probability;
    NoiseLevel boise=new NoiseLevel();
    public krester(int dexterity,int probability){
        super("Кристер",dexterity);
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
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    @Override
    public void Fear() {
        fear=true;
        System.out.println(name+ " испугался");
        Eff eff=new Eff();
        Eff.Locked EFF=eff.new Locked();
        EFF.LOKED(name);
        System.out.println(name+ " очень пожалел об этом");
    }
}