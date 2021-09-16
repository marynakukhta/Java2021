package ua.kpi.tef;

public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point one, Point two, Point three) {
        this.pointA = one;
        this.pointB = two;
        this.pointC = three;
    }

    @Override
    public double square() {
        double distA = getDistance(pointA,pointB);
        double distB = getDistance(pointC,pointB);
        double distC = getDistance(pointA,pointC);
        return Math.sqrt(semiPerimeter()*(semiPerimeter()-distA)*(semiPerimeter()-distB)*(semiPerimeter()-distC));
    }

    @Override
    public double perimeter() {
        double distA = getDistance(pointA,pointB);
        double distB = getDistance(pointC,pointB);
        double distC = getDistance(pointA,pointC);
        return distA + distB + distC;
    }

    @Override
    public void move(double dx, double dy) {
        pointA.setX(pointA.getX()+dx);
        pointA.setY(pointA.getY()+dy);
        pointB.setX(pointB.getX()+dx);
        pointB.setY(pointB.getY()+dy);
        pointC.setX(pointC.getX()+dx);
        pointC.setY(pointC.getY()+dy);

    }

   private double getDistance(Point pointA, Point pointB){
        double firstTerm = Math.pow(pointB.getX()-pointA.getX(), 2);
        double secondTerm = Math.pow(pointB.getY()-pointA.getY(), 2);
        return Math.sqrt(secondTerm + firstTerm);
   }


    public double semiPerimeter(){
        return perimeter()/2;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;

    }

}
