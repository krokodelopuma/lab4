import java.util.Objects;
import enums.*;
import pers.*;
import interfaces.*;
public class Main {
    public static void main(String[] args) {

        karlson karl = new karlson(60,60);
        System.out.println(karl.toString());
        malesh male = new malesh(60,60);
        System.out.println(male.toString());
        gunnela gunn = new gunnela(60,60);
        System.out.println(gunn.toString());
        krester kres = new krester(60,60);
        System.out.println(kres.toString());
        rulla rull = new rulla(60,60);
        System.out.println(rull.toString());
        fella fell = new fella(60,60);
        System.out.println(fell.toString());




        male.Fear();
        kres.Fear();
        gunn.Fear();
        //karl.Fear();

        karl.moving(movement.hiding,Location.furniture);
        karl.moving(movement.sneaks,Location.kitchen);
        male.moving(movement.hiding,Location.furniture);
        male.moving(movement.sneaks,Location.kitchen);
        gunn.moving(movement.hiding,Location.furniture);
        gunn.moving(movement.sneaks,Location.kitchen);
        kres.moving(movement.hiding,Location.furniture);
        kres.moving(movement.sneaks,Location.kitchen);
        karl.finds(things.tablecloths);
        karl.moving(movement.hid,Location.closet);
        male.moving(movement.hid,Location.sofa);
        rull.moving(movement.sneaking,Location.kitchen);
        fell.moving(movement.sneaking,Location.kitchen);
        rull.finds(things.money);
        rull.finds(things.rings);
        karl.moving(movement.popout,Location.kitchen);
        rull.Fear();
        fell.Fear();


    }
}



