package helpfulUtilities;

public class Point {
int[] dim;
public Point(int[] dimensions){
	dim=dimensions;
}
public int getDim(int dimension){
	return dim[dimension];
}
public int[] getAllDim(){
	return dim;
}
}
