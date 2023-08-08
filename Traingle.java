public class Traingle extends Shape {
    private double base;
    private double height;
    public Traingle(double base, double height) {
        this.base = base;
        this.height = height;
    }
        @Override
                public double getArea(){
        return 0.5 * base * height;

    }
    @Override
            public double calcParmitere(){
            return base * height;
        }
}
