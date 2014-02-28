package Author;

public class Triangle{

	private Point v1;
	private Point v2;
	private Point v3;

	public Triangle(Point newV1,Point newV2,Point newV3){
		
		v1=newV1;
		v2=newV2;
		v3=newV3;
		
	}

	@Override
	public String toString() {
		return v1+","+v2+","+v3;
	}
	public double getPerimeter(){
		
		return Point.distance(v1,v2)+Point.distance(v1,v3)+Point.distance(v2,v3);
		
	}

	public String printType() {

		float s1=Point.distance(v1,v2);
		float s2=Point.distance(v1,v3);
		float s3=Point.distance(v2,v3);
		
		System.out.println("\nSide 1 = "+s1);
		System.out.println("Side 2 = "+s2);
		System.out.println("Side 3 = "+s3+"\n");
		
		if(s1 == s2)
			if(s2 == s3)
				return "equilateral";
			else
				return "isosceles";
		else
			if(s1 == s3)
				return "isosceles";
			else
				if (s2 == s3)
					return "isosceles";
				else
					return "scalene";
	}

}

