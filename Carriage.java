/**
 * Created by Olenkaa on 09.02.2017.
 */
import java.util.Random;
public class Carriage {
    private boolean light;

    public Carriage() {
        Random random = new Random();
        this.light = random.nextBoolean();

    }

    public boolean isLightOn() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public void LightOn(){this.light = true;}

    public void LightOff() {
        this.light = false;
    }



    @Override
    public String toString() {
        return "Carriage{" +
                "light=" + light +
                '}';
    }
}
