package controller;

public class SomaCtrl {
	public SomaCtrl() {
		super();
	}
	
	public static double soma (double vl1, double vl2) {
		if(vl2 == 0) {
			return vl1;
		}
		else {
			return soma(vl1+1, vl2-1);
		}
	}
}
