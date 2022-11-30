public class Calculator {
    double addition;
    double subtraction;
    double mulitplication;
    double division;

    public Calculator(double addition, double subtraction, double mulitplication, double division){
        this.addition=addition;
        this.subtraction =subtraction;
        this.mulitplication=mulitplication;
        this.division=division;
    }
    public double getAddition() {
        return addition;
    }
    public double getSubtraction() {
        return subtraction;
    }
    public double getMulitplication() {
        return mulitplication;
    }
    public double getDivision() {
        return division;
    }
    public void setAddition(double addition) {
        this.addition = addition;
    }
    public void setSubtraction(double subtraction) {
        this.subtraction = subtraction;
    }
    public void setMulitplication(double mulitplication) {
        this.mulitplication = mulitplication;
    }
    public void setDivision(double division) {
        this.division = division;
    }

}
