package model;

public class Product {

	private String id;
	private String name;
	private int price;
	
//	コンストラクタ
	public Product(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
//	メソッド
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
//	価格を文字列（3桁カンマ区切り＋円）で返す
	public String getPriceString() {
		return String.format("%,d", price) + "円";
	}
}
