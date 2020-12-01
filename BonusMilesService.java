public class BonusMilesService {
    public int calculate(int cost) {
        int miles = cost / 20;
        if (cost < 20) {
            miles = 0;
        }
        return miles;
    }
}
