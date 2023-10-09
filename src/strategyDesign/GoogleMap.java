package strategyDesign;

public class GoogleMap {
    public void findPath(String from ,String to,String mode){
        pathCalculator pathCalculator=PathCalFactory.getPCForMode(mode);
        pathCalculator.findPath(from,to);
    }
}
