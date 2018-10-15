public class circleClient {
    public static void main(String[] args) {
       Point p = new Point(10,5);
       circle circle = new circle(p,7);
      
       System.out.println(circle.toString());
      
       
       System.out.println("Circumference = " + circle.getArea());
       System.out.println("Area = " + circle.getCircumference());
      
       Point p2 = new Point(5,7);
       
       if(circle.containsP(p2)) {
           System.out.println("The point (" +p2.toString()+ "), lies within the circle.");
        } else {
           System.out.println("The point (" +p2.toString()+ "), does not lie within the circle.");
        }
   }
}