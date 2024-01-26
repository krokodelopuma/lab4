package pers;

import enums.Location;
import technical.NoiseLevel;

public class Eff {
    private String name="Ефф";
    private boolean locked=false;
    public Eff(){
    }
    public class Locked {
/*        public Locked(){

        }*/
        public void LOKED(String Name) {
            if (locked == false) {
                locked = true;
                System.out.println(Name + " запер "+name);
            } else {
                System.out.println(name + " уже заперт");
            }
        }
    }
}
