public class circle {
        private int radius;
        public Point center;
        
        public circle(Point p, int Radius) { 
            this.radius=Radius;
            this.center = p;
        }
        public Point getCenter() { 
            return center;
        }
        public int getRadius() { 
             return radius;
        }
        public double getArea() {  
            return (Math.PI * (Math.pow(radius,2)));
        }
        public double getCircumference() {
            return (2*Math.PI*radius);
        }
        public String toString()  {
            return "Circle(Center = ("+ center +"), Radius = " + radius +")";
        }
        public boolean containsP(Point P) {
            double distance = (Math.sqrt((center.x - P.x) * (center.x - P.x) + (center.y - P.y) * (center.y - P.y)));
            if (distance <= radius) {
                return true;
            } else {
                return false;
            }
        }
}