package pers;
import enums.*;
import interfaces.*;
import abstrakt_class.*;
import technical.*;
import java.util.Objects;
public class rulla extends People implements FindsPepls {
    private String name="Рулле";
    private int dexterity;
    private int probability;
    NoiseLevel boise=new NoiseLevel();
    public rulla(int dexterity,int probability){
        super("Рулле",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }
    private Location locashen=Location.kitchen;
    public void finds(things what){
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
        System.out.println(this.name + " выдвинул ящик секретора и свиснул");
        malesh male = new malesh(0,0);
        male.thinks(what);
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
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    @Override
    public void Fear() {
        fear=true;
        System.out.println(name+ " испугался");
        System.out.println(name+ " хрюкнул от ужаса");
        Drops Droprulla = new Drops();
        Droprulla.drops(things.money);
        Droprulla.drops(things.rings);
    }
    class Drops {
        public void drops(things droprulla){
            System.out.println(name+ " роняет "+ droprulla);
        }
    }
}