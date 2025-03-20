public class Circle {

    private Point center;
    private int radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<0){
            this.radius=0;
            System.out.println("radius cant be 0");
            else{
                this.radius=radius;
            }
        }


        this.radius = radius;
    }
}
