package Java2Session2;

public class Paper {
public void draw (Shape shapeObj) {
shapeObj.draw (this);
}
public void displayAll (List<Shape> shObj) {
for (Shape s: shObj) {
s.draw (this) ;
}
}
}