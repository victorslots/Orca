package br.com.orca;

public class Calc {
	
	private float preco = 90;
	private float preco_min = 70;
	private float area;
	private float med1;
	private float med2;
	private int qtde;
	
	public String calcArea(float medida1, float medida2) {
		area = (medida1*medida2)/10000;
		med1 = medida1;
		med2 = medida2;
		
		return Float.toString(area);
	}
	
	public String qtde_mquad() {
		return Double.toString(Math.floor(1/area));
	}
	
	public String mquad_qtde(int quantidade) {
		
		qtde = quantidade;
		return Double.toString(area*qtde);
	}
	
	public String qtde_vm(){
		return Double.toString(Math.floor((preco_min/preco)/area));
	}
	
	public String valor_total() {
		return qtde * area * preco > 70 ? Double.toString(qtde * area * preco) : Double.toString(preco_min);
	}
	
	public String valor_ads() {
		return Double.toString((qtde * area * preco)/qtde);
	}
}
