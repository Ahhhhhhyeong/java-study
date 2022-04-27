package chapter03;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		// int를 double로 변형
		double[] result = new double[a.length];
		for(int i = 0; i < a.length; i++) {
			result[i]= a[i]; 
		}
		return result;
	}

	public static int[] doubleToint(double[] ds) {
		// double을 int로 변형
		int[] result = new int[ds.length];
		for(int i = 0; i < ds.length; i++) {
			result[i] = (int)ds[i]; 
		}
		return result;
	}

	public static int[] concat(int[] ds1, int[] ds2) {
		// ds1과 ds2 합치기
		int[] result = new int[ds1.length + ds2.length];
		System.arraycopy(ds1, 0, result, 0, ds1.length);
		System.arraycopy(ds2, 0, result, ds1.length, ds2.length);
				
		return result;
	}
	
}
