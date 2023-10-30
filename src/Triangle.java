public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if(sideA <= 0) {
            throw new IllegalArgumentException("Triangle side must be greater than 0");
        }

        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if(sideB <= 0) {
            throw new IllegalArgumentException("Triangle side c must be greater than 0");
        }

        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if(sideC <= 0) {
            throw new IllegalArgumentException("Triangle side b must be greater than 0");
        }

        this.sideC = sideC;
    }

    /**
     * Calculates the area of the triangle
     * This method calculates the area of the triangle based on sideA, SideB and SideC
     * @return area
     */
    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /**
     * Calculates the perimeter of the triangle
     * This method calculates the area of the triangle based on sideA, sideB, sideC
     * @return area
     */
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public String toString() {
        return "Triangle {" +
                "sideA = " + sideA + " " +
                ", sideB = " + sideB + " " +
                ", sideC = " + sideC + " " +
                "Area = " + calculateArea() + " " +
                "Perimeter = " + calculatePerimeter() +
                '}';
    }
}
