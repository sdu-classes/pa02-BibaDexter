public class Shape1{
    public String color = "red";
    public boolean filled = true;
        public  Shape1(){

        }
        public Shape1(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public boolean isFilled(){
            return filled ;
        }
        public void setFilled(boolean filled){
            this.filled = filled ;
        }
        public String toString(){
            return "Shape[color=" + color + ",filled=" + filled + "]";
        }
}