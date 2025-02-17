package controller;

public class SomaCtrl {
	public SomaCtrl() {
		super();
	}
	
	public static int soma (int vl1, int vl2) {
		//verifica se o número não é negativo
		if(vl1 < 0 || vl2 < 0) {
			return 0;
		}

		else if(vl2 == 0) {
			return vl1;
		}
		else {
			//ele retira 1 do vl2 e adiciona 1 no vl1
			return soma(vl1+1, vl2-1);
		}
	}
}
