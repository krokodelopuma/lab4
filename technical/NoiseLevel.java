package technical;
import enums.*;
import java.lang.Object;
public class NoiseLevel {
    private int noise=0;
    static private int noiseall=0;
    static private int noisemax=0;
    private int maxturn=5;
    static private int turn=0;

    /*public NoiseLevel(int noise,int maxturn){
        this.maxturn=maxturn;
        this.noise=noise;
    }*/
    public NoiseLevel(){}


    public int Noise(String name,Location locashen,int probability,int dexterity/*,int noise,int maxturn*/) {
        /*this.maxturn=maxturn;
        this.noise=noise;*/
        if ((Math.random() * (100-dexterity)+dexterity)>=probability) {
            this.noise = this.noise + 1;
            this.noiseall=this.noiseall+1;
            this.turn = this.turn + 1;
            System.out.println(name + " шумит в " + locashen);
            if ((this.maxturn == this.turn) && (this.noise > 0)) {
                this.turn=0;
                this.noise = this.noise - 1;
                this.noiseall=this.noiseall-1;
                System.out.println("но уровень шума издоваемый " + name + " остался прежним:" + this.noise);
                dexterity=dexterity-10;
            } else {
                System.out.println("уровень шума издоваемый " + name + " увеличился:" + this.noise);
                dexterity=dexterity+10;
            }
            NoiseLevel.MaxNoise noiselevelmax= new NoiseLevel.MaxNoise(this.noise);
            noiselevelmax.Maxnoise();
        }
        return dexterity;
    }
    public static class MaxNoise {
        //private int oldnoisemax;
        private int newnoisemax;
        public MaxNoise(int newnoisemax) {
            this.newnoisemax = newnoisemax;
        }

        public void Maxnoise() {
            if (newnoisemax>noisemax) {
                System.out.println("максимальный уровень шума издаваемый одним человеком увеличился: "+newnoisemax);
                noisemax=newnoisemax;
            }
        }
    }

    public int getnoise() {
        return this.noise;
    }
    public int getmaxturn() {
        return this.maxturn;
    }
}
