public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMiles = 1;
        int bonusMilesForEachSum = 20;
        return cost / bonusMilesForEachSum * bonusMiles;
    }
}

