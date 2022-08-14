package br.com.orca;

import java.text.DecimalFormat;

public class Calc {
	
	private float preco = 90;
	private float precoMin = 70;
	private float area;
	private float med1;
	private float med2;
	private int qtde;
	private DecimalFormat formatter;
	
	public String calcArea(float medida1, float medida2) {
		area = (medida1*medida2)/10000;
		med1 = medida1;
		med2 = medida2;
		
		return Float.toString(area);
	}
	
	public String qtde_mquad() {
		formatter = new DecimalFormat("#,##0 un");
		return formatter.format(Math.floor(1/area));
	}
	
	public String mquad_qtde(int quantidade) {
		
		qtde = quantidade;
		return Double.toString(area*qtde);
	}
	
	public String qtde_vm(){
		formatter = new DecimalFormat("#,##0 un");
		return formatter.format(Math.floor((precoMin/preco)/area));
	}
	
	public String valor_total() {
		formatter = new DecimalFormat("R$ #,##0.00");
		return qtde * area * preco > 70 ? formatter.format(qtde * area * preco) : formatter.format(precoMin);
	}
	
	public String valor_ads() {
		formatter = new DecimalFormat("R$ #,##0.00");
		return formatter.format((qtde * area * preco)/qtde);
	}
}