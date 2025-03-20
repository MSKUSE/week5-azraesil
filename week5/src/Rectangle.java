public class Rectangle {

   private Point topLeft;
   private int sideA,sideB;

    public Rectangle(Point topLeft,int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }


  public Point getTopLeft(){
        return topLeft;

  }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setSideA(int sideA) {
        if(sideA<0){
            this.sideA=0;
            System.out.println("A cannot be 0");
        }
        else {
                this.sideA=sideA;
        }

    }

    public void setSideB(int sideB) {
        if(sideB<0){
            this.sideB=0;
            System.out.println("B cannot be 0");
        }
        else{
            this.sideB=sideB;
        }

    }

    public int perimeter(){
        return (2*sideA)+(2*sideB);
    }
    public int area(){
        return sideA*sideB;
    }
}
