package model;

import java.util.List;

public class Cart {

	private String userId;
	private List<Product> listProd;
	
//	コンストラクタ
	public Cart(String userId, List<Product> listProd) {
		this.userId = userId;
		this.listProd = listProd;
	}
	
//	ゲッター
	public String getUserId() {
		return userId;
	}
	
	public List<Product> getListProd(){
		return listProd;
	}
	
//	通常メソッド
//	カート商品追加
	public void add(Product prod) {
		listProd.add(prod);
	}
	
//	カート商品の特定削除
	public void remove(int index) {
		listProd.remove(index);
	}
	
//	カート全体削除
	public void clear() {
		listProd.clear();
	}
	
//	カート内商品の合計金額
	public int getTotalPrice() {
		int total = 0;
		for (Product prod: listProd) {
			total += prod.getPrice();
		}
		return total;
	}
	
//	カート内商品の合計金額を3桁区切り文字列で返す
	public String getTotalPriceString() {
		return String.format("%,d", getTotalPrice()) + "円";
	}
}
