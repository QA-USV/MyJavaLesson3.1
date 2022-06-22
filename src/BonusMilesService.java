public class BonusMilesService {
    public int calculate (int cost) {
        int bonus = 1;
        int sumPerBonus = 20;
        return cost / sumPerBonus * bonus;
    }
}

