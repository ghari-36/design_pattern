package strategyDesign;

public class PathCalFactory {
    public static pathCalculator getPCForMode(String mode){
        if(mode.equals("car")){
            return new CarPathCalculator();
        }
        else if(mode.equals("bike")){
            return new BikePathCalculator();
        }
        else{
            throw new IllegalArgumentException("mode not found");
        }
    }
}
