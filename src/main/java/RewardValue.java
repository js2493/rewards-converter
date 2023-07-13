public class RewardValue {
    private double cashValue;
    private static final double MILES_TO_CASH_CONVERSION = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int miles) {
        this.cashValue = miles*MILES_TO_CASH_CONVERSION;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue/MILES_TO_CASH_CONVERSION);
    }
}
