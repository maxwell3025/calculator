package helpfulUtilities;

public class Line {
	double length;
	Point point1;
	Point point2;

	public Line(Point x, Point y) {
		int b = 0;
		for (int a=0;a<(x.getAllDim().length);a++){
			b = b+x.getDim(a)*x.getDim(a)+y.getDim(a)*y.getDim(a);
		}
		Double c = new Double(b);
		length=Math.sqrt(c);
	}
	public double getLength(){
		return length;
	}
}
