package guma;
import java.util.Scanner;
public class Hexa {
	public static void main(String[] args) {
		double area;
		double s,part1,part2;
		double a=(3.14/6.000);
		//a=Math.toRadians(a);
		System.out.println("Enter the side of the hexagon");
		Scanner sss = new Scanner(System.in);
		s = sss.nextDouble();
		part1 = 6* Math.pow(s, 2);
		part2 = 4* java.lang.Math.tan(a);
		
		area = part1/part2;
		
		System.out.println("area ="+area);

 }
}