package JavaLab11;

public class Debt {
    private double debtRatio;

    public double getDR() {
        return debtRatio;
    }

    public void calculateDR(double totalDebt, double totalAssets) {
        double ratio = totalDebt / totalAssets;
        this.debtRatio = ratio;
    }

}
