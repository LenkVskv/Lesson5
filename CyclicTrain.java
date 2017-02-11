import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olenkaa on 09.02.2017.
 */
public class CyclicTrain implements Train {

    private int currentPossition;
    private int expectedLength;
    private Carriage currentCarriage;
    List<Carriage> carriages = new ArrayList<>();

    public CyclicTrain() {
        for(int i = 0; i<58; i++){
            carriages.add(new Carriage());
        }
        currentPossition = 0;
        currentCarriage = carriages.get(0);
    }

    public CyclicTrain(List<Carriage> carriages) {
        this.carriages = carriages;
    }
    public List<Carriage>getCarriages(){
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }


    @Override
    public void turnLeft() {
        if(currentPossition == 0){
            currentPossition = carriages.size()-1;
        }
        else{
        currentPossition--;
        }
        currentCarriage=carriages.get(currentPossition);
    }

    @Override
    public void turnRight() {
        if(currentPossition == carriages.size()-1){
            currentPossition = 0;
        }
        else{
            currentPossition++;
        }
        currentCarriage=carriages.get(currentPossition);

    }

    @Override
    public void lightOn() {
        currentCarriage.setLight(true);
    }

    @Override
    public void lightOff() {
        currentCarriage.setLight(false);

    }

    @Override
    public boolean isLightOn() {
        return currentCarriage.isLightOn();
    }

    @Override
    public boolean isLength(int expectedLength) {
        return (expectedLength == carriages.size());
    }
}